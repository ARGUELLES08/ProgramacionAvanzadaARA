package CAPITULO11.Cap11_11;
import javax.swing.JFrame;
public class PruebaLista 
{
    public static void main (String args[] )
    {
        MarcoLista marcoLista = new MarcoLista();
        marcoLista.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoLista.setSize(400, 250);
        marcoLista.setVisible( true );
    }
}