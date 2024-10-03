package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class Lab10_MariaSandoval {

    public static void main(String[] args) {
        //CrearInstancias
        RecibidorDispositivo tele= new RecibidorTelevisor();
        RecibidorDispositivo reproduct= new RecibidorReproduct();
        RecibidorDispositivo aire= new RecibidorAireAcond();
        
        //Televisor
        Command encender1= new EncenderCommand(tele);
        Command canales= new CambiarCanalCommand((RecibidorTelevisor)tele, 45);
        Command volumen1= new SubirVolumenCommand(tele, 23);
        Command apagar1=new ApagarCommand(tele);
        
        //Reproductor de Sonido
        Command encender2= new EncenderCommand(reproduct);
        Command musica= new CambiarCancionCommand((RecibidorReproduct)reproduct,"mirroball - Taylor Swift");
        Command volumen2= new SubirVolumenCommand(reproduct, 100);
        Command volumen3= new BajarVolumenCommand(reproduct, 30);
        Command apagar2= new ApagarCommand(reproduct);
        
        //Aire Acondicionado
        Command encender3= new EncenderCommand(aire);
        Command temperatura1= new SubirTemperaturaCommand((RecibidorAireAcond)aire,30);
        Command temperatura2= new BajarTemperaturaCommand((RecibidorAireAcond)aire, 10);
        Command apagar3= new ApagarCommand(aire);
        
        //Invocar comandos
        InvocadorControlRemoto invoker= new InvocadorControlRemoto();
        
        //Televisor
        System.out.println("Televisor");
        invoker.setComandoActual(encender1);
        invoker.ejecutar();
        invoker.setComandoActual(canales);
        invoker.ejecutar();
        invoker.setComandoActual(volumen1);
        invoker.ejecutar();
        invoker.setComandoActual(apagar1);
        invoker.ejecutar();
        
        System.out.println();
        
        //Reproductor de Sonido
        System.out.println("Reproductor de Sonido");
        invoker.setComandoActual(encender2);
        invoker.ejecutar();
        invoker.setComandoActual(musica);
        invoker.ejecutar();
        invoker.setComandoActual(volumen2);
        invoker.ejecutar();
        invoker.setComandoActual(volumen3);
        invoker.ejecutar();
        invoker.setComandoActual(apagar2);
        invoker.ejecutar();
        
        System.out.println();
        
        //Aire Acondicionado
        System.out.println("Aire Acondicionado");
        invoker.setComandoActual(encender3);
        invoker.ejecutar();
        invoker.setComandoActual(temperatura1);
        invoker.ejecutar();
        invoker.setComandoActual(temperatura2);
        invoker.ejecutar();
        invoker.setComandoActual(apagar3);
        invoker.ejecutar();
    }
}
