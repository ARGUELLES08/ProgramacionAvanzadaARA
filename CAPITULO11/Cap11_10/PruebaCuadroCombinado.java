package CAPITULO11.Cap11_10;
import javax.swing.JFrame;
public class PruebaCuadroCombinado 
{
    public static void main (String args[] )
    {
        MarcoCuadroCombinado marcoCuadroCombinado = new MarcoCuadroCombinado();
        marcoCuadroCombinado.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marcoCuadroCombinado.setSize(900, 750);
        marcoCuadroCombinado.setVisible(true);
    }
}