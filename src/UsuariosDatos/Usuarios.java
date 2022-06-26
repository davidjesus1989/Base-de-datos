package UsuariosDatos;


public class Usuarios {

private Integer id;
private String nombre;
private String apellido;
private String run;
private Integer edad;
private String correo;

public Usuarios() {
    }

    public Usuarios(Integer id, String nombre, String apellido, String run, Integer edad, String correo) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.run = run;
        this.edad = edad;
        this.correo = correo;
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

    public String getRun() {
        return run;
    }

    public void setRun(String run) {
        this.run = run;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    @Override
    public String toString() {
        return "Usuarios{" + "id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", run=" + run + ", edad=" + edad + ", correo=" + correo + '}';
    }




}
