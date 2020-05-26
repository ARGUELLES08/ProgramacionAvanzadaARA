package CAPITULO11.Cap11_4;

// Demostración de la clase JLabel.
import java.awt.FlowLayout; // especifica cómo se van a ordenar los componentes
import javax.swing.JFrame; // proporciona las características básicas de una ventana
import javax.swing.JLabel; // muestra texto e imágenes
import javax.swing.SwingConstants; // constantes comunes utilizadas con Swing
import javax.swing.Icon; // interfaz utilizada para manipular imágenes
import javax.swing.ImageIcon; // carga las imágenes

public class LabelFrame<add> extends JFrame
{
    private final JLabel jpg;
    
    public LabelFrame()
    {
        super("tierno");
        setLayout(new FlowLayout());
        Icon perrito= new ImageIcon(getClass().getResource("perrito.jpg"));

        jpg=new JLabel();
        jpg.setText("Es hermoso este perrito");
        jpg.setIcon(perrito);
        jpg.setHorizontalTextPosition(SwingConstants.CENTER);
        jpg.setVerticalTextPosition(SwingConstants.BOTTOM);
        jpg.setToolTipText(":)");
        add(jpg);
    }
    
} // fin de la clase LabelFrame