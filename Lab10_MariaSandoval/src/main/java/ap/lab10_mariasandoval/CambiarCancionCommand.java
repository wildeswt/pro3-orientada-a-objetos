package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class CambiarCancionCommand implements Command{
    private RecibidorReproduct reproductor;
    private String cancion;
    
    public CambiarCancionCommand (){
        reproductor=null;
        cancion="";
    }
    
    public CambiarCancionCommand(RecibidorReproduct reproductor, String cancion){
        this.reproductor=reproductor;
        this.cancion=cancion;
    }

    public void setReproductor(RecibidorReproduct reproductor) {
        this.reproductor = reproductor;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public RecibidorReproduct getReproductor() {
        return reproductor;
    }

    public String getCancion() {
        return cancion;
    }
    
    //Otros metodos
    @Override
    public boolean ejecutar() {
        reproductor.CambiarCancion(cancion);
        return true;
    }
    
}
