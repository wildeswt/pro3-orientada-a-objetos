package ap.lab9_mariasandoval;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Maria Sandoval
 */

public class PrestamoBasico implements Prestamo{
    private Date fechaPrestamo;
    private Date fechaVencimiento;
    private Libro libro;
    
    public PrestamoBasico(){
        fechaPrestamo= new Date();
        fechaVencimiento=new Date();
        libro= new Libro();
    }
    public PrestamoBasico(Libro libro){
        this.fechaPrestamo= new Date(); 
        this.fechaVencimiento= calcularFechaVenc();
        this.libro=libro;
    }
    
    @Override
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public void setFechaPrestamo(Date fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }
    
    @Override
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }
    
    public Libro getLibro() {
        return libro;
    }

    public Date getFechaPrestamo() {
        return fechaPrestamo;
    }

    //Otros metodos
    @Override
    public void ImprimirInfo(){
        System.out.println("Prestamo: ");
        System.out.println("Libro: "+libro.getTitulo());
        System.out.println("Fecha de Inicio: " + fechaPrestamo.toString());
        System.out.println("Fecha de Vencimiento: " + fechaVencimiento.toString());
    }
    
     public Date calcularFechaVenc() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(fechaPrestamo);
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        return calendar.getTime();
    }
    
    public void RealizarPrestamo(Biblioteca biblioteca, Usuario usuario, Libro libro){
        if(libro.Disponible()){
            libro.PrestarLibro();
            usuario.AgregarPrestamo(this);
            biblioteca.AgregarPrestamo(this);
            System.out.println("El prestamo del libro: "+libro.getTitulo()+" se ha realizado exitosamente");
            System.out.println(""+usuario.getNombre()+" debe devolver el libro el dia: "+this.fechaVencimiento.toString());
        }else
            System.out.println("No hay copias disponibles del libro "+libro.getTitulo());
        
    }

    public void DevolverPrestamo(Biblioteca biblioteca,Usuario usuario) {
        this.libro.AgregarCopia();
        usuario.EliminarPrestamo(this);
        biblioteca.EliminarPrestamo(this);
        System.out.println("El libro: "+libro.getTitulo()+" fue devuelto por "+usuario.getNombre());
    }
}