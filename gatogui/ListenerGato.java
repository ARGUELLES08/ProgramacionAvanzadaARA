/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gatogui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;

/**
 *
 * @author Roberto Cruz Leija
 */
public class ListenerGato implements ActionListener{

    private Gato gato;
    
    public ListenerGato(Gato gato) {
        this.gato = gato;
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        JButtonNuevo boton = (JButtonNuevo) e.getSource();
        boolean ganador = this.gato.agregarJugada(boton.getR(), boton.getC());
        // verificar primero el turno
        int turno = this.gato.getMovimientos()[this.gato.getJugada()];
        if(turno == 1){
        boton.setIcon(new ImageIcon("C:\\Users\\Ale\\Desktop\\IPN-UPIIZ\\UPIIZ2DOSEMESTRE\\PROGRAMACION_AVANZADA\\xgato.png"));
        
        }else{
        boton.setIcon(new ImageIcon("C:\\Users\\Ale\\Desktop\\IPN-UPIIZ\\UPIIZ2DOSEMESTRE\\PROGRAMACION_AVANZADA\\cirgato.png"));
        }
        boton.setEnabled(false);
        if (ganador){
            JOptionPane.showMessageDialog(null,"Gano "+turno);
        }
        
       // gato.agregarJugada(boton.getR(),boton.getC());
       // System.out.println(boton.getC()+","+boton.getR());
    }
    
}