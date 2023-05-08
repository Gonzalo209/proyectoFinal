package control;

import vista.MenuCliente;
import vista.VentaPrincipal;

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

        MenuCliente menuCliente = new MenuCliente();

        switch (menu) {

            case "Clientes" -> {

                menuCliente.setVisible(true);

                ventaPrincipal.getEscritorio().add(menuCliente);

            }

            case "Salir" ->

                System.exit(0);

        }

    }

}