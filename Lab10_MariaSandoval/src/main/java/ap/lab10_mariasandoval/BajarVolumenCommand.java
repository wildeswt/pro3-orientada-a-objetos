package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class BajarVolumenCommand implements Command{
private RecibidorDispositivo dispositivo;
    private int cantVol;
    
    public BajarVolumenCommand(){
        dispositivo=null;
        cantVol=0;
    }
    
    public BajarVolumenCommand(RecibidorDispositivo dispositivo, int cantVol){
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
        if (dispositivo instanceof RecibidorTelevisor dispo)
           dispo.bajarVolumen(cantVol);
        else if (dispositivo instanceof RecibidorReproduct dispo)
                dispo.bajarVolumen(cantVol);
        return true;
    }
    
}

