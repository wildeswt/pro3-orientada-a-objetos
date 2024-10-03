package ap.lab9_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class Libro {
     //Atributos
    private String titulo;
    private String autor;
    private int copiasDisp;
    
    //Constructores
    public Libro(){ //Sin parametros
        titulo=autor="";
        copiasDisp=0;
    }
    
    public Libro(String titulo, String autor, int copiasDisp){
        this.titulo=titulo; //Con parametros
        this.autor=autor;
        this.copiasDisp= copiasDisp;
    }
    
    //SET/GET
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setCopiasDisp(int copiasDisp) {
        this.copiasDisp = copiasDisp;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getCopiasDisp() {
        return copiasDisp;
    }
    
    //Otros metodos
    public void PrestarLibro(){
        copiasDisp--;
    }
    
    public void AgregarCopia(){
        copiasDisp++;
    }

    public boolean Disponible(){
        return copiasDisp != 0;
    }
    
    public void ImprimirInfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
        System.out.println("Copias disponibles: "+copiasDisp);
    }
}
