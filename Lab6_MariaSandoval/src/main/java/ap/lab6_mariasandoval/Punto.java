package ap.lab6_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class Punto {
    //Atributos
    private double x;
    private double y;
    
    //Constructores
    public Punto(){ //Sin parametros
        x=y=0;
    }
    
    public Punto (double x, double y){
        this.x=x;  //Con parametros
        this.y=y;
    }
    
    //SET/GET
    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        System.out.println("Punto ("+x+","+y+")");
    }
}
