package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class InvocadorControlRemoto {
    private Command comandoActual;
    
    public InvocadorControlRemoto(){
        comandoActual=null;
    }
    
    public InvocadorControlRemoto(Command comandoActual){
        this.comandoActual=comandoActual;
    }

    public void setComandoActual(Command comandoActual) {
        this.comandoActual = comandoActual;
    }

    public Command getComandoActual() {
        return comandoActual;
    }
    
    //Otros metodos
    public void ejecutar(){
        if(comandoActual != null)
            comandoActual.ejecutar();
    }
}
