package uth.hn.crm.modelo;

import java.math.*;
import java.time.*;

import javax.persistence.*;

import org.openxava.annotations.*;

import lombok.*;

/**
 * Esto es un ejemplo de una entidad.
 *
 * Siéntete libre de renombrarla, modificarla o borrarla a tu gusto.
 */
@Entity @Getter @Setter
public class Clientes {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	@Column(length = 50)
	@Required
	private String nombre;
	@Column(length = 50)
	@Required
	private String Direccion;

	private LocalDate fecha_registro;

	private String Identidad;

	private String Correo_Electronico;

}
