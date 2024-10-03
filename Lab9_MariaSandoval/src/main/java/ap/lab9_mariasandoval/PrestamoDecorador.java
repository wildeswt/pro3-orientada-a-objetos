package ap.lab9_mariasandoval;

import java.util.Date;

/**
 *
 * @author Maria Sandoval
 */
public abstract class PrestamoDecorador implements Prestamo{
    private Prestamo prestamo;
    
    public PrestamoDecorador(){
        prestamo=null;
    }
    
    public PrestamoDecorador(Prestamo prestamo){
        this.prestamo=prestamo;
    }

    public void setPrestamo(Prestamo prestamo) {
        this.prestamo = prestamo;
    }

    public Prestamo getPrestamo() {
        return prestamo;
    }

    @Override
    public Date getFechaVencimiento() {
        return prestamo.getFechaVencimiento();
    }

    @Override
    public void setFechaVencimiento(Date fechaVencimiento) {
        prestamo.setFechaVencimiento(fechaVencimiento);
    }

    @Override
    public void ImprimirInfo() {
        prestamo.ImprimirInfo();
    }
}