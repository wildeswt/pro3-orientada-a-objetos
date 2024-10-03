package ap.continuacionlab7_mariasandoval;

import java.util.Comparator;

/**
 *
 * @author Maria Sandoval
 */
public class CompararNombreInverso implements Comparator<Usuario> {

    @Override
    public int compare(Usuario o1, Usuario o2) {
        return o2.getNombre().compareTo(o1.getNombre());
    }
    
}
