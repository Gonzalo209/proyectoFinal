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

        JMenuItem opcion11 = new JMenuItem("Clientes");

        JMenuItem opcionSalir = new JMenuItem("Salir");

        opcion11.addActionListener(ManipuladorMenu.getInstancia());

        opcionSalir.addActionListener(ManipuladorMenu.getInstancia());

        menu1.add(opcion11);

        menu1.add(opcionSalir);

        barraMenu.add(menu1);

        return barraMenu;

    }

    public void mostrarMensaje(String texto) {

        JOptionPane.showMessageDialog(this, texto, "Mensaje: ", JOptionPane.PLAIN_MESSAGE);

    }

    public JDesktopPane getEscritorio() {

        return escritorio;

    }

}