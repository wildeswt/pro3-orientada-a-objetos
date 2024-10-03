package ap.lab9_mariasandoval;

import java.util.ArrayList;

/**
 *
 * @author Maria Sandoval
 */
public class Usuario implements ObservadorLibros{
   //Atributos
   private String nombre;
   private int id;
   private String contrasenna;
   private ArrayList<Prestamo> prestamos;
   
   //Constructores
   public Usuario(){ //Sin parametros
       nombre=contrasenna="";
       id=0;
       prestamos= new ArrayList<>();
   }
   
   public Usuario(String nombre, int id, String contrasenna){
       this.nombre=nombre;  //Con parametros
       this.id=id;
       this.contrasenna=contrasenna;
       this.prestamos=new ArrayList<>();
   }
   
   //SET/GET
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setContrasenna(String contrasenna) {
        this.contrasenna = contrasenna;
    }
    
    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public String getNombre() {
        return nombre;
    }

    public int getId() {
        return id;
    }

    public String getContrasenna() {
        return contrasenna;
    }
    
    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }
   
    //Otros metodos
    public void AgregarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }
    
    public void EliminarPrestamo (Prestamo prestamo){
        prestamos.remove(prestamo);
    }

    @Override
    public void LibroDisp(Libro libro) {
        System.out.println("Usuario: "+nombre+", el libro "+libro.getTitulo()+" esta disponible");
    }

    @Override
    public void CercaVencimiento(Prestamo prestamo) {
        System.out.println("Usuario: "+nombre+", el prestamo del libro "+((PrestamoBasico)prestamo).getLibro()+" esta por vencerse");
    }
    
    public void ImprimirInfo(){
        System.out.println("Usuario: "+nombre);
        System.out.println("ID: " + id);
    }
    
    public void ImprimirPrestamos(){
        System.out.println("Libros Prestados:");
        if (prestamos.isEmpty())
            System.out.println(" No hay libros prestados.");
        else
            for (Prestamo aux : prestamos)
                System.out.println(""+((PrestamoBasico)aux).getLibro().getTitulo());
    }
}

