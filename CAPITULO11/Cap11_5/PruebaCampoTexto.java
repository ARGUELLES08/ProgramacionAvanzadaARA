package CAPITULO11.Cap11_5;
import javax.swing.JFrame;
public class PruebaCampoTexto 
{
    public static void main ( String args[] )
    {
        CampoTextoMarco campoTextoMarco = new CampoTextoMarco();
        campoTextoMarco.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        campoTextoMarco.setSize(450,500);
        campoTextoMarco.setVisible(true);
    }
}