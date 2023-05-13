package control;

import vista.VentaPrincipal;
import vista.VentanaCliente;
import vista.VentanaProveedor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManipuladorMenu implements ActionListener {

    private static ManipuladorMenu instancia;

    private ManipuladorMenu() {}

    public static ManipuladorMenu getInstancia() {

        if(instancia == null) {

            instancia = new ManipuladorMenu();

        }

        return instancia;

    }

    @Override
    public void actionPerformed(ActionEvent evento) {

        VentaPrincipal ventaPrincipal = VentaPrincipal.getInstance();

        String menu = evento.getActionCommand();

        VentanaCliente ventanaCliente = new VentanaCliente();
        VentanaProveedor ventanaProveedor = new VentanaProveedor();

        switch (menu) {

            case "Clientes" -> {

                ventanaCliente.setVisible(true);

                ventaPrincipal.getEscritorio().add(ventanaCliente);

            }

            case "Proveedores" -> {

                ventanaProveedor.setVisible(true);

                ventaPrincipal.getEscritorio().add(ventanaProveedor);

            }

            case "Salir" ->

                System.exit(0);

        }

    }

}