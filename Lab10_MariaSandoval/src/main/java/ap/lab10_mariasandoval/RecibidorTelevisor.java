package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class RecibidorTelevisor extends RecibidorDispositivo {
    private int cantVol;
    private int canalActual;

    public RecibidorTelevisor() {
        super();
        cantVol=0;
        canalActual=0;
    }
    
    public RecibidorTelevisor(boolean estado, int cantVol, int canalActual){
        super(estado);
        this.cantVol=cantVol;
        this.canalActual=canalActual;
    }

    public void setCantVol(int cantVol) {
        this.cantVol = cantVol;
    }

    public void setCanalActual(int canalActual) {
        this.canalActual = canalActual;
    }
    
    public int getCantVol() {
        return cantVol;
    }

    public int getCanalActual() {
        return canalActual;
    }
    
    public void subirVolumen(int cant){
        cantVol +=cant;
        System.out.println("Se ha subido el volumen ("+cantVol+")");
    }
    
    public void bajarVolumen(int cant){
        cantVol -=cant;
        System.out.println("Se ha bajado el volumen ("+cantVol+")");
    }
    
    public void cambiarCanal(int nuevoCanal){
        canalActual=nuevoCanal;
        System.out.println("Se ha cambiado el canal ("+canalActual+")");
    }
    
    @Override
    public void ImprimirInfo() {
        System.out.println("Este dispositivo es una television.");
    }
}