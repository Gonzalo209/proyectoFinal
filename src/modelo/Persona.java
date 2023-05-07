package modelo;

public class Persona {

    protected int id;
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected String direccion;
    protected String telefono;

    public Persona(int id, String nombre, String apellidoPaterno, String apellidoMaterno, String direccion,
                   String telefono) {

        this.id = id;
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.direccion = direccion;
        this.telefono = telefono;

    }

    public void setId(int id) {

        this.id = id;

    }

    public void setNombre(String nombre) {

        this.nombre = nombre;

    }

    public void setApellidoPaterno(String apellidoPaterno) {

        this.apellidoPaterno = apellidoPaterno;

    }

    public void setApellidoMaterno(String apellidoMaterno) {

        this.apellidoMaterno = apellidoMaterno;

    }

    public void setDireccion(String direccion) {

        this.direccion = direccion;

    }

    public void setTelefono(String telefono) {

        this.telefono = telefono;

    }

    public int getId() {

        return id;

    }

    public String getNombre() {

        return nombre;

    }

    public String getApellidoPaterno() {

        return apellidoPaterno;

    }

    public String getApellidoMaterno() {

        return apellidoMaterno;

    }

    public String getDireccion() {

        return direccion;

    }

    public String getTelefono() {

        return telefono;

    }

}