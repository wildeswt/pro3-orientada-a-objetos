package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class RecibidorAireAcond extends RecibidorDispositivo{
    private int temperatura;
    
    public RecibidorAireAcond(){
        super();
        temperatura=0;
    }
    
    public RecibidorAireAcond(boolean estado, int temperatura){
        super(estado);
        this.temperatura=temperatura;
    }

    public void setTemperatura(int temperatura) {
        this.temperatura = temperatura;
    }

    public int getTemperatura() {
        return temperatura;
    }
    
    public void subirTemperatura(int cant){
        temperatura+=cant;
        System.out.println("Se ha subido la temperatura ("+temperatura+")");
    }
    
    public void bajarTemperatura(int cant){
        temperatura-=cant;
        System.out.println("Se ha bajado la temperatura ("+temperatura+")");
    }

    @Override
    public void ImprimirInfo() {
        System.out.println("Este dispositivo es un aire acondicionado.");
    }
}
