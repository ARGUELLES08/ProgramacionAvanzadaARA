package CAPITULO11.Cap11_4;
//prueba de Label Frame
import javax.swing.JFrame;

public class PruebaLabel
{
    public static void main(String args[])
    {
        LabelFrame marcoEtiqueta = new LabelFrame (); //crea objeto LabelFrame
        marcoEtiqueta.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE);
        marcoEtiqueta.setSize(475, 375); //establece el tamaño del marco
        marcoEtiqueta.setVisible(true); //muestra el marco
    } //fin de main
} // fin de la clase PruebaLabel