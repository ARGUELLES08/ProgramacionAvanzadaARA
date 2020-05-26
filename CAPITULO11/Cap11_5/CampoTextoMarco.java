package CAPITULO11.Cap11_5;

//DEmostración de la clase JTextField
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JOptionPane;

public class CampoTextoMarco extends JFrame
{
    private JTextField campoTexto1;
    private JTextField campoTexto2;
    private JTextField campoTexto3;
    private JPasswordField campoContrasenia;

    //El constructor de CampoTextoMarco agrega objetos JTextField a JFrame
    public CampoTextoMarco()
    {
        super("Prueba de JTextField y JPasswordField");
        setLayout(new FlowLayout()); //establece el esquema del marco

        //construye campo de texto con 10 columnas
        campoTexto1= new JTextField(10);
        add( campoTexto1); //agerga campoTexto1 a JFrame

        //construye campo de texto con texto prederminado
        campoTexto2 = new JTextField( "Escriba el texto aqui" );
        add( campoTexto2); 

        //construye campo de texto con texto predeterminado y 21 columnas
        campoTexto3 = new JTextField("Campo de texto no editable", 21);
        campoTexto3.setEditable( false); //deshabilita la edicion
        add(campoTexto3);

        //construye campo de contraseña con texto predeterminado
        campoContrasenia = new JPasswordField("Texto oculto");
        add(campoContrasenia);

        //registra los manejadores de eventos
        ManejadorCampoTexto manejador = new ManejadorCampoTexto();
        campoTexto1.addActionListener(manejador);
        campoTexto2.addActionListener(manejador);
        campoTexto3.addActionListener(manejador);
        campoContrasenia.addActionListener(manejador);
    } // fin del constructor CampoTextoMarco
    //clase interna privada para el manejo de eventos
    private class ManejadorCampoTexto implements ActionListener
    {
        //procesa los eventos de campo de texto
        public void actionPerformed(ActionEvent evento)
        {
            String cadena = ""; //declara la cadena a mostrar
            //el usuario oprimio intro en el objeto JTextField campoTexto1
            if (evento.getSource()==campoTexto1)
            cadena =String.format("campoTexto1: %s", evento.getActionCommand() );

            else if (evento.getSource()== campoTexto2 )
            cadena = String.format("campoTexto2: %s", evento.getActionCommand() );

            else if (evento.getSource()==campoTexto3)
            cadena = String.format("campoTexto3: %S", evento.getActionCommand() );

            else if (evento.getSource()==campoContrasenia)
            cadena = String.format ("campoContrasenia: %s", new String(campoContrasenia.getPassword() ) );

            //muestra el contenido del objeto JTextField
            JOptionPane.showMessageDialog(null, cadena);
        }
    }
}