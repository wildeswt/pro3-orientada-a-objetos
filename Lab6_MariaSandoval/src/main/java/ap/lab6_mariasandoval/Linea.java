package ap.lab6_mariasandoval;
/**
 *
 * @author Maria Sandoval
 */
public class Linea implements Comparar{
    private Punto p1;
    private Punto p2;
    
    public Linea(){ //Sin parametro
        p1=p2=null;
    }
    
    public Linea(Punto p1, Punto p2){
        this.p1=p1;   //Con parametros
        this.p2=p2;
    }
    
    //SET/GET
    public void setP1(Punto p1) {
        this.p1 = p1;
    }

    public void setP2(Punto p2) {
        this.p2 = p2;
    }

    public Punto getP1() {
        return p1;
    }

    public Punto getP2() {
        return p2;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        p1.ImprimirInfo();
        p2.ImprimirInfo();
    }
    
    public double Longitud(){
        return Math.sqrt(Math.pow(p2.getX()-p1.getX(),2)+ Math.pow(p2.getY()-p1.getY(),2));
    }

    @Override
    public void Comparar(double num) {
        System.out.println("Se estan comparando lineas.");
        if (this.Longitud() == num)
            System.out.println("Linea 1 es igual que la Linea 2");
        else if (this.Longitud() > num)
            System.out.println("Linea 1 es mayor que la Linea 2");
        else 
            System.out.println("Linea 1 es menor que la Linea 2");
    }
    
}
