package boletin15;

import javax.swing.JOptionPane;

/**
 *
 * @author Julián
 */
public class Masaxista extends Personas {

    String titulacion;
    int anosExperiencia;

    public Masaxista(String titulacion, int anosExperiencia) {
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    @Override
    public String toString() {
        return "masaxista{" + "titulacion=" + titulacion + ", anosExperiencia=" + anosExperiencia + '}';
    }

    @Override
    public void viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os masaxistas");
    }
}
