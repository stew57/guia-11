package it.pkg.entidades;

import jakarta.persistence.*;

@Entity
@Table(name = "usuariossitema")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Id;

    @Column(name = "Nombre")
    private String Nombre;

    @Column(name = "Apellido")
    private String Apellido;
    
    @Column(name = "Usuario")
    private String Usuario;
    
    @Column(name = "Clave")
    private String Clave;
    
    @Column(name = "Correo")
    private String Correo;
    
    @Column(name = "Roll")
    private String Roll;
    
    @Column(name = "Estado")
    private String Estado;

    public Usuario() {
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public void setClave(String Clave) {
        this.Clave = Clave;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public void setRoll(String Roll) {
        this.Roll = Roll;
    }

    public void setEstado(String Estado) {
        this.Estado = Estado;
    }

    public Integer getId() {
        return Id;
    }

    public String getNombre() {
        return Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public String getUsuario() {
        return Usuario;
    }

    public String getClave() {
        return Clave;
    }

    public String getCorreo() {
        return Correo;
    }

    public String getRoll() {
        return Roll;
    }

    public String getEstado() {
        return Estado;
    }
    
    

}
