package ap.lab9_mariasandoval;

import java.util.ArrayList;

/**
 *
 * @author Maria Sandoval
 */
public class AdapterSistAutenticacion implements SistemaAutenticacion{
    private SistemaAutenticacionExt sistAutenExt;
    private ArrayList<ObservadorLibros> usuarios;
    
    public AdapterSistAutenticacion(ArrayList<ObservadorLibros> usuarios) {
        this.sistAutenExt= new SistemaAutenticacionExt(usuarios);
        this.usuarios = usuarios; 
    }
    public AdapterSistAutenticacion() {
        usuarios= new ArrayList<>();
    }
    
    public void setSistemaAutenExt(SistemaAutenticacionExt sistemaAutenExt) {
        this.sistAutenExt = sistemaAutenExt;
    }

    public void setUsuariosRegistrados(ArrayList<ObservadorLibros> usuarios) {
        this.usuarios = usuarios;
    }
    
    public SistemaAutenticacionExt getSistemaAutenExt() {
        return sistAutenExt;
    }

    public ArrayList<ObservadorLibros> getUsuarios() {
        return usuarios;
    }

    @Override
    public boolean autenticarUsuario(int id, String contrasenna) {
        return sistAutenExt.autenticar(id, contrasenna);
    }
}
