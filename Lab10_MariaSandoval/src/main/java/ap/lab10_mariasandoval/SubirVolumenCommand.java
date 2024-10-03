package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class SubirVolumenCommand implements Command {
    private RecibidorDispositivo dispositivo;
    private int cantVol;
    
    public SubirVolumenCommand(){
        dispositivo=null;
        cantVol=0;
    }
    
    public SubirVolumenCommand(RecibidorDispositivo dispositivo, int cantVol){
        this.dispositivo=dispositivo;
        this.cantVol=cantVol;
    }

    public void setDispositivo(RecibidorDispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public void setCantVol(int cantVol) {
        this.cantVol = cantVol;
    }

    public RecibidorDispositivo getDispositivo() {
        return dispositivo;
    }

    public int getCantVol() {
        return cantVol;
    }
    
    @Override
    public boolean ejecutar() {
        if(dispositivo instanceof RecibidorTelevisor dispo)
           dispo.subirVolumen(cantVol);
        else if (dispositivo instanceof RecibidorReproduct dispo)
                dispo.subirVolumen(cantVol);
        return true;
    }
    
}
