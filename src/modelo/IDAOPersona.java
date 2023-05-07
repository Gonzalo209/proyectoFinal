package modelo;

public interface IDAOPersona {

    public void agregar(Persona persona);
    public void modificar(int idPersona);
    public int buscar(int idPersona);

}
