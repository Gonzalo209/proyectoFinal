package modelo;

import java.util.ArrayList;

public class ArrayListCliente implements IDAOPersona{

    private ArrayList<Cliente> clientes = new ArrayList<>();

    @Override
    public void agregar(Persona persona) {

        clientes.add((Cliente) persona);

    }

    @Override
    public void modificar(int idPersona) {

    }

    @Override
    public int buscar(int idPersona) {
        return 0;
    }

}