package ap.lab9_mariasandoval;

import java.util.ArrayList;

/**
 *
 * @author Maria Sandoval
 */
public class SistemaAutenticacionExt {
    private ArrayList<ObservadorLibros> usuarios;
    
    public SistemaAutenticacionExt() {
        usuarios= new ArrayList<>();
    }
    public SistemaAutenticacionExt(ArrayList<ObservadorLibros> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void setUsuarios(ArrayList<ObservadorLibros> usuarios) {
        this.usuarios= usuarios;
    }
    
    public ArrayList<ObservadorLibros> getUsuarios() {
        return usuarios;
    }

    public boolean autenticar(int id, String contrasenna){
        for (ObservadorLibros usu: usuarios)
            if (((Usuario)usu).getId() == id && ((Usuario)usu).getContrasenna().equals(contrasenna)){
                System.out.println("Autenticacion exitosa, usuario " + ((Usuario)usu).getNombre());
                return true;
            }
        System.out.println("Error durante la autenticacion del usuario");
        return false;
    }
}
