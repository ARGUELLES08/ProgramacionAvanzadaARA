
import javax.swing.*;
import javax.swing.JFrame;
class gui{
    public static void main(String args[]){
        JFrame frame= new JFrame("Ventana 1");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,300);
        JButton Button = new JButton("Boton 1");
        frame.getContentPane().add(Button);
        frame.setVisible(true);
 
    }
}
