package ap.lab6_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class Numero implements Comparar{
    //Atributos
    private double n;
    
    //Constructores
    public Numero(){ //Sin parametros
        n=0.00;
    }
    
    public Numero(double n){
        this.n=n; //Con parametros 
    }
    
    //SET/GET
    public void setN(double n) {
        this.n = n;
    }

    public double getN() {
        return n;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        System.out.println("Numero: "+n);
    }

    @Override
    public void Comparar(double num) {
        System.out.println("Se estan comparando numeros.");
        if (this.n == num)
            System.out.println("Numero 1 es igual que numero 2");
        else if (this.n > num)
            System.out.println("Numero 1 es mayor que numero 2");
        else 
            System.out.println("Numero 1 es menor que numero 2");
    }
}
