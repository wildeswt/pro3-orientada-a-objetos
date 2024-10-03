package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class ApagarCommand implements Command{
    private RecibidorDispositivo dispositivo;
    
    public ApagarCommand(){
        dispositivo=null;
    }
    
    public ApagarCommand(RecibidorDispositivo dispositivo){
        this.dispositivo=dispositivo;
    }
    
    @Override
    public boolean ejecutar() {
        dispositivo.apagarDispositivo();
        return true;
    }
}
