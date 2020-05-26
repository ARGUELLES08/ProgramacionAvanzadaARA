package CAPITULO11.Cap11_9_2;
import javax.swing.JFrame;
public class PruebaBotonOpcion 
{
    public static void main (String args[] )
    {
        MarcoBotonOpcion marcoBotonOpcion = new MarcoBotonOpcion();
        marcoBotonOpcion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBotonOpcion.setSize(550, 385);
        marcoBotonOpcion.setVisible(true);
    }
}