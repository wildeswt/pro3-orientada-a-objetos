package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public abstract class RecibidorDispositivo {
    private boolean estado;
    
    public RecibidorDispositivo(){
        estado=false;
    }
    
    public RecibidorDispositivo(boolean estado){
        this.estado=estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public boolean isEstado() {
        return estado;
    }
    
    public void encenderDispositivo(){
        estado=true;
        System.out.println("El dispositivo se ha encendido");
    }
    
    public void apagarDispositivo(){
        estado=false;
        System.out.println("El dispositivo se ha apagado");
    }
    
    public abstract void ImprimirInfo();
}
