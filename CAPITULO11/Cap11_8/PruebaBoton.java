package CAPITULO11.Cap11_8;
import javax.swing.JFrame;
public class PruebaBoton 
{
    public static void main(String args[])
    {
        MarcoBoton marcoBoton = new MarcoBoton();
        marcoBoton.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoBoton.setSize(450,375);
        marcoBoton.setVisible(true);
    }
}