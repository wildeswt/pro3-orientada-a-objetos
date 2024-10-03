package ap.lab9_mariasandoval;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Maria Sandoval
 */
public class Lab9_MariaSandoval {

    public static void main(String[] args) {
        //Crear instancias
        Biblioteca biblioteca=Biblioteca.getInstance();
        UsuarioFactory aux1= new UsuarioFactory();
        Usuario usu1= aux1.crearUsuario("Maria", 3434, "jijij");
        Usuario usu2= aux1.crearUsuario("Samuel", 8989,"18022005");
        LibroFactory aux2= new LibroFactory();
        Libro libro1= aux2.crearLibro("La Metamorfosis","Franz Kafka", 36);
        Libro libro2= aux2.crearLibro("Mi nombre era Eileen","Ottessa Moshfegh", 7);
        biblioteca.registrarUsuario(usu1);
        biblioteca.registrarUsuario(usu2);
        biblioteca.AgregarLibro(libro1);
        biblioteca.AgregarLibro(libro2);
        
        //Funciones
        AdapterSistAutenticacion sistAuten= new AdapterSistAutenticacion(biblioteca.getUsuarios());
        if(sistAuten.autenticarUsuario(3434, "jijij")){
            
            usu1.ImprimirInfo();
            System.out.println();
            Prestamo prestamo1= new PrestamoBasico(libro1);
            ((PrestamoBasico) prestamo1).RealizarPrestamo(biblioteca,usu1, libro1);
            biblioteca.AgregarPrestamo(prestamo1);
            prestamo1.ImprimirInfo();
            
            System.out.println("\nExtender fecha: ");
            PrestamoExtender prestamoExt= new PrestamoExtender(prestamo1);
            prestamoExt.CalcularNuevaFecha();
            prestamoExt.ImprimirInfo();
            
            System.out.println();
            
            Calendar calendar = Calendar.getInstance();
            calendar.setTime(new Date());
            calendar.add(Calendar.DAY_OF_MONTH, 2);
            prestamoExt.setFechaVencimiento(calendar.getTime());
            biblioteca.Activar(2, libro1);
            
            System.out.println("\nUsuario "+usu1.getNombre());
            usu1.ImprimirPrestamos();
            
            System.out.println("\nUsuario "+usu2.getNombre());
            usu2.ImprimirPrestamos();
        }
        
    }
}
