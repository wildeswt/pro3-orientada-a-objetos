package ap.continuacionlab7_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class Usuario implements Comparable <Usuario>{
    private String nombre;
    
    public Usuario(){
        nombre="";
    }
    
    public Usuario(String nombre){
        this.nombre=nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }
    
    public void ImprimirInfo(){
        System.out.println("Usuario: "+nombre);
    }

    @Override
    public int compareTo(Usuario m) {
        return nombre.compareTo(m.getNombre());
    }
}
