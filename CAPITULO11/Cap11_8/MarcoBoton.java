package CAPITULO11.Cap11_8;
// Creación de objetos JButton
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class MarcoBoton extends JFrame
{
    private JButton botonJButtonSimple; // botón con texto solamente
    private JButton botonJButtonElegante; // botón con iconos

    //MarcoBoton agraga objetos JButton a JFrame
    public MarcoBoton ()
    {
        super( "Prueba de botones" );
        setLayout( new FlowLayout() ); // establece el esquema del marco

        botonJButtonSimple = new JButton( "Boton simple" ); // botón con texto
        add( botonJButtonSimple ); // agrega botonJButtonSimple a JFrame

        Icon insecto1 = new ImageIcon( getClass().getResource( "insecto1.gif" ) );
        Icon insecto2 = new ImageIcon( getClass().getResource( "insecto2.gif" ) );
        botonJButtonElegante = new JButton( "Boton elegante", insecto1 ); // establece la imagen
        botonJButtonElegante.setRolloverIcon( insecto2 ); // establece la imagen de sustitución
        add( botonJButtonElegante );

        ManejadorBoton manejador = new ManejadorBoton();
        botonJButtonElegante.addActionListener( manejador );
        botonJButtonSimple.addActionListener( manejador );
    }
    // clase interna para manejar eventos de botón
    private class ManejadorBoton implements ActionListener
    {
        public void actionPerformed(ActionEvent evento)
        {
            JOptionPane.showMessageDialog(MarcoBoton.this, String.format("Usted oprimio: %s",evento.getActionCommand() ) );

        }
    }
}