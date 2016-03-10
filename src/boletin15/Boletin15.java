package boletin15;

/**
 *
 * @author Julián
 */
public class Boletin15 {

    public static void main(String[] args) {

        Xogador delantero = new Xogador(5, "Selecion");
        Masaxista masaxista1 = new Masaxista("Graduada", 5);
        Entrenador entrenador1 = new Entrenador("2");
        Personas asd = new Personas();
        delantero.concentrarse();
        masaxista1.concentrarse();
        entrenador1.concentrarse();
        delantero.viaxar();
        masaxista1.viaxar();
        entrenador1.viaxar();

    }

}
    

