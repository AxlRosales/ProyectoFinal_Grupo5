package uth.hn.crm.modelo;
import javax.persistence.*;
import org.openxava.annotations.*;

@Entity
public class Usuario {
    @Id
    @Column(length = 50)
    private String username;
    @Column(length = 255)
    private String password;
    @Column(length = 100)
    private String email;
    @Stereotype("PASSWORD")
    private String nuevaPassword;
    @Stereotype("PASSWORD")
    private String confirmarPassword;
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getNuevaPassword() {
        return nuevaPassword;
    }
    public void setNuevaPassword(String nuevaPassword) {
        this.nuevaPassword = nuevaPassword;
    }
    public String getConfirmarPassword() {
        return confirmarPassword;
    }
    public void setConfirmarPassword(String confirmarPassword) {
        this.confirmarPassword = confirmarPassword;
    }
}
