package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class CambiarCanalCommand implements Command{
    //Atributos
    private RecibidorTelevisor televisor;
    private int numCanal;
    
    //Constructores
    public CambiarCanalCommand(){
        televisor=null;
        numCanal=0;
    }
    
    public CambiarCanalCommand(RecibidorTelevisor televisor, int numCanal){
        this.televisor=televisor;
        this.numCanal=numCanal;
    }
    
    //SET/GET
    public void setTelevisor(RecibidorTelevisor televisor) {
        this.televisor = televisor;
    }
    
    public void setNumCanal(int numCanal) {    
        this.numCanal = numCanal;
    }

    public RecibidorTelevisor getTelevisor() {
        return televisor;
    }

    public int getNumCanal() {
        return numCanal;
    }
    
    //Otros metodos
    
    @Override
    public boolean ejecutar() {
        televisor.cambiarCanal(numCanal);
        return true;
    }
    
}
