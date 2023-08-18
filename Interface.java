package pkginterface;

public class Interface {

    public static void main(String[] args) {
        JuegoDados j1 = new JuegoDados();
        JuegoAdivinar j2 = new JuegoAdivinar();
        /*
        j1.iniciar();
        j1.jugar();
        j1.finalizar();
        */
        j2.iniciar();
        j2.jugar();
        j2.finalizar();
    }
    
}
