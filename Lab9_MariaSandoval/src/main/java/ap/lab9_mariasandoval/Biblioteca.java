package ap.lab9_mariasandoval;

import java.util.ArrayList;

/**
 *
 * @author Maria Sandoval
 */
public class Biblioteca implements Alarma{
    //Atributos
    private static Biblioteca instance;
    private ArrayList<Libro> libros;
    private ArrayList<ObservadorLibros> usuarios;
    private ArrayList <Prestamo> prestamos;
    private boolean activado;
    
    public Biblioteca(){
        libros=new ArrayList<>();
        usuarios= new ArrayList<>();
        prestamos= new ArrayList<>();
        activado=false;
    }
    
    //SET/GET
    public void setLibros(ArrayList<Libro> libros) {
        this.libros = libros;
    }

    public void setUsuarios(ArrayList<ObservadorLibros> usuarios) {
        this.usuarios = usuarios;
    }
    
    public void setPrestamos(ArrayList<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public void setActivado(boolean activado) {
        this.activado = activado;
    }    
    
    public ArrayList<Libro> getLibros() {
        return libros;
    }

    public ArrayList<ObservadorLibros> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Prestamo> getPrestamos() {
        return prestamos;
    }

    public boolean isActivado() {
        return activado;
    }
    
    //Otros metodos
    public static Biblioteca getInstance() {
        if (instance == null) {
            instance = new Biblioteca();
            System.out.println("Instancia de biblioteca creada");
        }
        else
            System.out.println("Instancia de biblioteca YA Existe");
        return instance;
    }
    
    public void AgregarLibro(Libro libro){
        if(libros.contains(libro))
            System.out.println("El libro ya fue registrado");
        else{
            libros.add(libro);
            notificarLibroDisponible(libro);
        }
    }
    
    public void EliminarLibro(Libro libro){
        if(!libros.contains(libro))
            System.out.println("El libro no se encuentra registrado");
        else
            libros.remove(libro);
    }
    
    public void AgregarPrestamo(Prestamo prestamo){
        prestamos.add(prestamo);
    }
    
    public void EliminarPrestamo(Prestamo prestamo){
        prestamos.remove(prestamo);
    }
    
    
    @Override
    public void Activar(int inf, Libro libro) {
      this.activado = true;
        if(inf == 1)
            notificarLibroDisponible(libro);
        else if (inf == 2)
            notificarCercaVenc();
    }

    @Override
    public void Desactivar() {
        this.activado=false;
    }
    private void notificarLibroDisponible(Libro libro) {
        for(ObservadorLibros usuario: usuarios)
            ((Usuario) usuario).LibroDisp(libro);
    }
    public void registrarUsuario(Usuario usuario) {
        agregarObservador(usuario);
    }
    
    public void agregarObservador(ObservadorLibros usuario) {
        usuarios.add(usuario);
    }

    public void eliminarObservador(ObservadorLibros usuario) {
        usuarios.remove(usuario);
    }
    
    public void notificarCercaVenc(){
        for(ObservadorLibros aux: usuarios)
            for(Prestamo aux2:((Usuario)aux).getPrestamos()){
                int difdias= Prestamo.DiferenciaDias(((PrestamoBasico)aux2).getFechaPrestamo(), ((PrestamoBasico)aux2).getFechaVencimiento());
                if (difdias <=1)
                   ((Usuario)aux).CercaVencimiento(aux2);
            }
    }
    
    public Usuario BuscarUsuario(int id) {
        for (ObservadorLibros aux : usuarios)
            if (aux instanceof Usuario) {
                if (((Usuario)aux).getId() == id) 
                    return (Usuario) aux;
            }
        return null; 
    }
    
    public Libro BuscarLibro (String titulo) {
        for (Libro libro : libros)
          if (libro.getTitulo().equalsIgnoreCase(titulo)) 
            return libro;
        return null;
    }
}
