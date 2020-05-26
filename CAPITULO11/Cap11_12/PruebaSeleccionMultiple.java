package CAPITULO11.Cap11_12;
import javax.swing.JFrame;

public class PruebaSeleccionMultiple 
{
    public static void main (String args[])
    {
        MarcoSeleccionMultiple marcoSeleccionMultiple= new MarcoSeleccionMultiple();
        marcoSeleccionMultiple.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoSeleccionMultiple.setSize( 450, 200);
        marcoSeleccionMultiple.setVisible(true);
    }    
}