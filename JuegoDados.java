package pkginterface;

import javax.swing.JOptionPane;

public class JuegoDados implements Juego{
    private int dado1 = 1;
    private int dado2 = 1;
    private String jugador1;
    private String jugador2;
    
    public JuegoDados(){
        
    }
    
    @Override
    public void iniciar(){
        this.jugador1 = JOptionPane.showInputDialog("Ingrese el nombre del Primer Jugador");
        this.jugador2 = JOptionPane.showInputDialog("Ingrese el nombre del Segundo Jugador");
    }
    
    @Override
    public void jugar(){
        this.dado1 += (int) (Math.random() * 6);
        this.dado2 += (int) (Math.random() * 6);
        
        JOptionPane.showMessageDialog(null, this.jugador1 + " obtuvo: " + this.dado1, "Javadesde0.com", 1);
        JOptionPane.showMessageDialog(null, this.jugador2 + " obtuvo: " + this.dado2, "Javadesde0.com", 1);
    }
    
    @Override
    public void finalizar(){
        if(this.dado1 > this.dado2){
            JOptionPane.showMessageDialog(null, this.jugador1 + " ganó con un: " + this.dado1, "Javadesde0.com", 2);
        }
        else if(this.dado2 > this.dado1){
            JOptionPane.showMessageDialog(null, this.jugador2 + " ganó con un: " + this.dado2, "Javadesde0.com", 2);
        }
        else{
            JOptionPane.showMessageDialog(null, "Los jugadores empataron con un: " + this.dado1, "Javadesde0.com", 2);
        }
    }
}



