package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class EncenderCommand implements Command{
    private RecibidorDispositivo dispositivo;
    
    public EncenderCommand(){
        dispositivo=null;
    }
    
    public EncenderCommand(RecibidorDispositivo dispositivo){
        this.dispositivo=dispositivo;
    }

    public void setDispositivo(RecibidorDispositivo dispositivo) {
        this.dispositivo = dispositivo;
    }

    public RecibidorDispositivo getDispositivo() {
        return dispositivo;
    }

    @Override
    public boolean ejecutar() {
        dispositivo.encenderDispositivo();
        return true;
    }
}