package uth.hn.crm.actions;

import org.openxava.actions.*;
import javax.persistence.*;
import uth.hn.crm.modelo.Usuario;
import org.openxava.jpa.XPersistence;
public class CambiarClaveAction extends SaveAction {

    @Override
    public void execute() throws Exception {
        String username = getView().getValueString("username");
        String nuevaPassword = getView().getValueString("nuevaPassword");
        String confirmarPassword = getView().getValueString("confirmarPassword");
        if (nuevaPassword == null || nuevaPassword.isEmpty()) {
            addError("La nueva contrase�a no es v�lida");
            return;
        }
        if (!nuevaPassword.equals(confirmarPassword)) {
            addError("Las contrase�as no coinciden");
            return;
        }
        EntityManager em = XPersistence.getManager();
        Usuario usuario = em.find(Usuario.class, username);
        if (usuario != null) {
            usuario.setPassword(nuevaPassword);
            em.merge(usuario);
            addMessage("Contrase�a cambiada correctamente");
        } else {
            addError("Usuario no encontrado");
        }
    }
}
