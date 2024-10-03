package ap.lab6_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class Lab6_MariaSandoval {

    public static void main(String[] args) {
        //Crear objetos
        Numero num1= new Numero(18.7);
        Numero num2= new Numero(18.5);
        Punto punto1= new Punto(8,10);
        Punto punto2= new Punto(3,5);
        Punto punto3= new Punto(1,0);
        Punto punto4= new Punto(2,7);
        Linea linea1= new Linea(punto1, punto2);
        Linea linea2= new Linea(punto3, punto4);
        
        //Comparar
        num1.Comparar(num2.getN());
        System.out.println();
        linea1.Comparar(linea2.Longitud());
    }
}
