package ap.lab9_mariasandoval;

import java.util.Date;

/**
 *
 * @author Maria Sandoval
 */
public interface Prestamo {
   Date getFechaVencimiento();
   public void setFechaVencimiento(Date fechaVencimiento);
   public void ImprimirInfo();
   public static int DiferenciaDias(Date fechaini, Date fechafin){
        float dif= fechaini.getTime() - fechafin.getTime()/(1000 * 60 * 60 * 24);
        return (int) dif;
    }
}
