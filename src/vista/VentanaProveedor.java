package vista;

import javax.swing.JInternalFrame;
import javax.swing.JTextField;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.BorderLayout;

public class VentanaProveedor extends JInternalFrame {

    private JTextField txfNombre = new JTextField(10);
    private JTextField txfAPaterno = new JTextField(10);
    private JTextField txfAMaterno = new JTextField(10);
    private JTextField txfDireccion = new JTextField(10);
    private JTextField txfTelefono = new JTextField(10);

    public VentanaProveedor() {

        super("Registro de proveedores", false, true, false, true);

        add(crearPanelPrincipal());

        setSize(300, 150);

    }

    private JPanel crearPanelEdicion() {

        JPanel pnlEdicion = new JPanel();

        JLabel lblNombre = new JLabel("Nombre: ");

        JLabel lblAPaterno = new JLabel("Apellido Paterno: ");

        JLabel lblAMaterno = new JLabel("Apellido Materno: ");

        JLabel lblDireccion = new JLabel("Direccion: ");

        JLabel lblTelefono = new JLabel("Telefono: ");

        pnlEdicion.setLayout(new GridLayout(5, 5));

        pnlEdicion.add(lblNombre);

        pnlEdicion.add(txfNombre);

        pnlEdicion.add(lblAPaterno);

        pnlEdicion.add(txfAPaterno);

        pnlEdicion.add(lblAMaterno);

        pnlEdicion.add(txfAMaterno);

        pnlEdicion.add(lblDireccion);

        pnlEdicion.add(txfDireccion);

        pnlEdicion.add(lblTelefono);

        pnlEdicion.add(txfTelefono);

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