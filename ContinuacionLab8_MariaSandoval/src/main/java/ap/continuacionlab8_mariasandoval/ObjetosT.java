package ap.continuacionlab8_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class ObjetosT {
     //Atributos
    private String nombre;
    private String palabra1;
    private String palabra2;
    
    //Constructor
    public ObjetosT(){  //Sin parametros
        nombre=palabra1=palabra2="";
    }
    
    public ObjetosT(String nombre, String palabra1, String palabra2){
        this.nombre=nombre;   //Con parametros
        this.palabra1=palabra1;
        this.palabra2=palabra2;
    }
    
    //SET/GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPalabra1(String palabra1) {
        this.palabra1 = palabra1;
    }

    public void setPalabra2(String palabra2) {
        this.palabra2 = palabra2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPalabra1() {
        return palabra1;
    }

    public String getPalabra2() {
        return palabra2;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        System.out.println("Nombre de la fruta: "+nombre);
        System.out.println("Palabra clave 1: "+palabra1);
        System.out.println("Palabra clave 2: "+palabra2);
    }
}
