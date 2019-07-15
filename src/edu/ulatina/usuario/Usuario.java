package edu.ulatina.usuario;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Usuario
 *
 */
@Entity
public class Usuario implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;
	private String nombre;
	private String apellido;
	@Column(unique = true)
	private String correo;
	@Column(unique = true)
	private String username;
	private String password;
	@Column(columnDefinition = "boolean default false", nullable = false)
	private Boolean rol = false;
	@Column(columnDefinition = "boolean default false", nullable = false)
	private Boolean verificado = false;

	private static final long serialVersionUID = 1L;

	public Usuario() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

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

	public Boolean getRol() {
		return rol;
	}

	public void setRol(Boolean rol) {
		this.rol = rol;
	}

	public Boolean getVerificado() {
		return verificado;
	}

	public void setVerificado(Boolean verificado) {
		this.verificado = verificado;
	}

	public boolean isPasswordValid(String password) {
		return this.password.equals(password);
	}

}
