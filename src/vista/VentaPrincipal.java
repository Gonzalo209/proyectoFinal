package vista;

import javax.swing.JFrame;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

public class VentaPrincipal extends JFrame {

    public VentaPrincipal() {

        super("Menu Principal");

        setVisible(true);

        setJMenuBar(getBarraMenu());

        setSize(600, 400);

        setLocationRelativeTo(null);

        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

    private JMenuBar getBarraMenu() {

        JMenuBar barraMenu = new JMenuBar();

        JMenu menu1 = new JMenu("Menu 1");

        JMenuItem opcion11 = new JMenuItem("Clientes");

        menu1.add(opcion11);

        barraMenu.add(menu1);

        return barraMenu;

    }

}
