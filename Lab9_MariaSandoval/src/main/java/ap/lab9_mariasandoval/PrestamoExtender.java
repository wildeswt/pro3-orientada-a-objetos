package ap.lab9_mariasandoval;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Maria Sandoval
 */
public class PrestamoExtender extends PrestamoDecorador{
    
    public PrestamoExtender(Prestamo prestamo){
        super(prestamo);
    }

    @Override
    public void setFechaVencimiento(Date fechaVencimiento) {
        super.setFechaVencimiento(fechaVencimiento);
    }

    public void CalcularNuevaFecha() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(getPrestamo().getFechaVencimiento());
        calendar.add(Calendar.DAY_OF_MONTH, 7);
        ((PrestamoBasico)getPrestamo()).setFechaVencimiento(calendar.getTime());
        System.out.println("La fecha del prestamo se extendio hasta el dia: " + calendar.getTime());
    } 
}
