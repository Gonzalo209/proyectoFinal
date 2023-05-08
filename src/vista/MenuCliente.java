package vista;

import javax.swing.JInternalFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;

public class MenuCliente extends JInternalFrame {


    public MenuCliente() {

        super("Menu de clientes", false, true, false, true);

        setLayout(new BorderLayout(5, 5));

        String[] nombreBotones = {"Crear cuenta", "Iniciar sesion"};

        JButton[] botones = new JButton[nombreBotones.length];

        for(int i = 0; i < botones.length; i++) {

            botones[i] = new JButton(nombreBotones[i]);

        }

        add(botones[0], BorderLayout.NORTH);
        add(botones[1], BorderLayout.SOUTH);

        setSize(300, 200);

    }

}