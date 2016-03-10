package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author Julián
 */
public class Xogador extends Personas {

    int dorsal;
    String demarcacion;

    public Xogador(int dorsal, String demarcacion) {
        this.dorsal = dorsal;
        this.demarcacion = demarcacion;
    }

    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores");
    }

    public void xogarPartido() {
    }

    public void entrenar() {
    }

}
    

