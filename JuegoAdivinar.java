package pkginterface;

import javax.swing.JOptionPane;

public class JuegoAdivinar implements Juego{
    private int num = 1;
    private int numAdivinar;
    private int intento = 1;
    private boolean acierto = false;
    
    public JuegoAdivinar(){
        
    }
    
    @Override
    public void iniciar(){
        JOptionPane.showMessageDialog(null, "Este juego se basa en adivinar un número del 1 al 100 generado aleatoriamente", "Javadesde0.com", 2);
    }
    
    @Override
    public void jugar(){
        this.num += (int) (Math.random() * 100);
       while(this.acierto == false && this.intento<6){
            this.numAdivinar = Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero"));
            if(num == numAdivinar){
                JOptionPane.showMessageDialog(null, "el numero de la computadora es: " + this.num + " tu numero fue: " + this.numAdivinar);
                this.acierto = true;
            }
            else{
                JOptionPane.showMessageDialog(null, "Intente de nuevo", "Javadesde0.com", 2);
                this.intento ++;
            }
        }
    }
    
    @Override
    public void finalizar(){
            if(this.acierto == true){
                JOptionPane.showMessageDialog(null, "Ganaste!", "Javadesde0.com", 1); 
                JOptionPane.showMessageDialog(null, "Nro de intentos: " + this.intento, "Javadesde0.com", 1);
            }
            else{
                JOptionPane.showMessageDialog(null, "Perdiste", "Javadesde0.com", 0);
            }
    }
}
