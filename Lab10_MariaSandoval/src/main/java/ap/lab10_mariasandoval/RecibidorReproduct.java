package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class RecibidorReproduct extends RecibidorDispositivo{
    private String cancion;
    private int cantVol;
    
    public RecibidorReproduct(){
        super();
        cancion="";
        cantVol=0;
    }
    
    public RecibidorReproduct(boolean estado, String cancion, int cantVol){
        super(estado);
        this.cancion=cancion;
        this.cantVol=cantVol;
    }

    public void setCancion(String cancion) {
        this.cancion = cancion;
    }

    public void setCantVol(int cantVol) {
        this.cantVol = cantVol;
    }

    public String getCancion() {
        return cancion;
    }

    public int getCantVol() {
        return cantVol;
    }
    
    public void CambiarCancion(String nuevaCancion){
        cancion=nuevaCancion;
        System.out.println("Ahora se esta reproduciendo "+cancion);
    }
    
    public void subirVolumen(int cant){
        cantVol +=cant;
        System.out.println("Se ha subido el volumen ("+cantVol+")");
    }
    
    public void bajarVolumen(int cant){
        cantVol -=cant;
        System.out.println("Se ha bajado el volumen ("+cantVol+")");
    }
    
    @Override
    public void ImprimirInfo() {
        System.out.println("Este dispositivo es un reproductor de sonido.");
    }
}
