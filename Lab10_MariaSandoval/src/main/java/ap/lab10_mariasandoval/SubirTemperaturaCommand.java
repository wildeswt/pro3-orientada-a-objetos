package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class SubirTemperaturaCommand implements Command{
    private RecibidorAireAcond aire;
    private int cantTemp;
    
    public SubirTemperaturaCommand(){
        aire=null;
        cantTemp=0;
    }
    
    public SubirTemperaturaCommand(RecibidorAireAcond aire, int cantTemp){
        this.aire=aire;
        this.cantTemp=cantTemp;
    }

    public void setAire(RecibidorAireAcond aire) {
        this.aire = aire;
    }

    public void setCantTemp(int cantTemp) {
        this.cantTemp = cantTemp;
    }

    public RecibidorAireAcond getAire() {
        return aire;
    }

    public int getCantTemp() {
        return cantTemp;
    }
    
    //Otros metodos
    @Override
    public boolean ejecutar() {
        aire.subirTemperatura(cantTemp);
        return true;
    } 
}
