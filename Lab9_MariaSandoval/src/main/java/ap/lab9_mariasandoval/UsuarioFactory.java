package ap.lab9_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class UsuarioFactory {
    public Usuario crearUsuario(String nombre, int id, String contrasenna) {
       return new Usuario(nombre, id, contrasenna);
    }
}

