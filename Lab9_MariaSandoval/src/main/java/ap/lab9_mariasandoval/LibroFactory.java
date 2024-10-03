package ap.lab9_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class LibroFactory {
    public Libro crearLibro(String titulo, String autor, int copiasDisp) {
       return new Libro(titulo, autor,copiasDisp);
    }
}