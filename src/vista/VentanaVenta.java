package vista;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class VentanaVenta extends JInternalFrame {

    private JTextField txfTotal = new JTextField(10);
    private JTextField txfFecha = new JTextField(10);
    private JTextField txfCliente = new JTextField(10);
    private JTextField txfProducto = new JTextField(10);
   
    public VentanaVenta() {

        super("Registro de la venta", false, true, false, true);

        add(crearPanelPrincipal());

        setSize(300, 150);

    }

    private JPanel crearPanelEdicion() {

        JPanel pnlEdicion = new JPanel();

        JLabel lblTotal = new JLabel("Total: ");

        JLabel lblFecha = new JLabel("Fecha: ");

        JLabel lblCliente = new JLabel("Cliente: ");

        JLabel lblProducto = new JLabel("Producto: ");

        pnlEdicion.setLayout(new GridLayout(5, 5));

        pnlEdicion.add(lblTotal);

        pnlEdicion.add(txfTotal);

        pnlEdicion.add(lblFecha);

        pnlEdicion.add(txfFecha);

        pnlEdicion.add(lblCliente);

        pnlEdicion.add(txfCliente);

        pnlEdicion.add(lblProducto);

        pnlEdicion.add(txfProducto);

        return pnlEdicion;

    }

    public JPanel crearPanelPrincipal() {

        JPanel pnlPrincipal = new JPanel();

        pnlPrincipal.setLayout(new BorderLayout());

        pnlPrincipal.add(crearPanelEdicion(), BorderLayout.CENTER);

        pnlPrincipal.add(crearPanelControl(), BorderLayout.SOUTH);

        return pnlPrincipal;

    }

    public JPanel crearPanelControl() {

        JPanel pnlControl = new JPanel();

        JButton btnAgregar = new JButton("Agregar");

        pnlControl.add(btnAgregar);

        return pnlControl;

    }

}
