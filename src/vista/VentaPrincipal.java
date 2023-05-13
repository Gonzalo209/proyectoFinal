package vista;

import control.ManipuladorMenu;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import javax.swing.JOptionPane;
import javax.swing.JDesktopPane;

public class VentaPrincipal extends JFrame {

    private static VentaPrincipal instancia;
    private JDesktopPane escritorio = new JDesktopPane();

    private VentaPrincipal() {

        super("Menu Principal");

        add(escritorio);

        setJMenuBar(getBarraMenu());

        setVisible(true);

        setSize(600, 400);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    public static VentaPrincipal getInstance() {

        if(instancia == null) {

            instancia = new VentaPrincipal();

        }

        return instancia;

    }

    private JMenuBar getBarraMenu() {

        JMenuBar barraMenu = new JMenuBar();

        JMenu menu1 = new JMenu("Menu 1");

        JMenu menu2 = new JMenu("Menu 2");

        JMenu menu3 = new JMenu("Menu 3");

        JMenu menu4 = new JMenu("Menu 4");

        JMenuItem opcion11 = new JMenuItem("Clientes");

        JMenuItem opcion12 = new JMenuItem("Compras");

        JMenuItem opcion13 = new JMenuItem("Ventas");

        JMenuItem opcion14 = new JMenuItem("Proveedores");

        JMenuItem opcionSalir = new JMenuItem("Salir");

        opcion11.addActionListener(ManipuladorMenu.getInstancia());

        opcionSalir.addActionListener(ManipuladorMenu.getInstancia());

        opcion14.addActionListener(ManipuladorMenu.getInstancia());

        menu1.add(opcion11);

        menu2.add(opcion12);

        menu3.add(opcion13);

        menu4.add(opcion14);

        menu1.add(opcionSalir);

        barraMenu.add(menu1);

        barraMenu.add(menu2);

        barraMenu.add(menu3);

        barraMenu.add(menu4);

        return barraMenu;

    }

    public void mostrarMensaje(String texto) {

        JOptionPane.showMessageDialog(this, texto, "Mensaje: ", JOptionPane.PLAIN_MESSAGE);

    }

    public JDesktopPane getEscritorio() {

        return escritorio;

    }

}