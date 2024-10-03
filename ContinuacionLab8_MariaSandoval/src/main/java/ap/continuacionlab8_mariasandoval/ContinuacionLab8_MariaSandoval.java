package ap.continuacionlab8_mariasandoval;

import java.util.Scanner;

/**
 *
 * @author Maria Sandoval
 */
public class ContinuacionLab8_MariaSandoval {

    public static void main(String[] args) {
        try{
            //Crear instancias
            Scanner entrada= new Scanner(System.in);
            MatrizGenerica matriz=new MatrizGenerica(3,3);
            ObjetosT obj1= new ObjetosT("ojo", "ver", "redondo");
            ObjetosT obj2= new ObjetosT("gato", "peludo", "bigotes");
            ObjetosT obj3= new ObjetosT("pasticho", "carne", "queso");
            ObjetosT obj4= new ObjetosT("planta", "verde", "hojas");
            ObjetosT obj5= new ObjetosT("piano", "teclas", "negro");
            ObjetosT obj6= new ObjetosT("fuego", "amarillo", "quema");
            ObjetosT obj7= new ObjetosT("sillon", "suave","alargado");
            ObjetosT obj8= new ObjetosT("cafe", "liquido","marron");
            ObjetosT obj9= new ObjetosT("serpiente", "reptil","escamas");
            
            //Ingresar elementos a la matriz
            matriz.EstablecerElem(0, 0, obj1);
            matriz.EstablecerElem(0, 1, obj2);
            matriz.EstablecerElem(0, 2, obj3);
            matriz.EstablecerElem(1, 0, obj4);
            matriz.EstablecerElem(1, 1, obj5);
            matriz.EstablecerElem(1, 2, obj6);
            matriz.EstablecerElem(2, 0, obj7);
            matriz.EstablecerElem(2, 1, obj8);
            matriz.EstablecerElem(2, 2, obj9);
            
            System.out.println("Tablero: ");
            matriz.ImprimirInfo();
            
            //Funciones basicas
            System.out.println("Objeto conseguido: ");
            ((ObjetosT)matriz.buscarElementoPosicion(2, 1)).ImprimirInfo();
            
            //Juego
            String palabrasC[]={obj1.getPalabra1(), obj1.getPalabra2(), obj2.getPalabra1(), obj2.getPalabra2(), 
                                obj3.getPalabra1(),obj3.getPalabra2(), obj4.getPalabra1(), obj4.getPalabra2(), 
                                obj5.getPalabra1(), obj5.getPalabra2(),obj6.getPalabra1(), obj6.getPalabra2(), 
                                obj7.getPalabra1(), obj7.getPalabra2(), obj8.getPalabra1(), obj8.getPalabra2(), 
                                obj9.getPalabra1(), obj9.getPalabra2()};
            System.out.println("------------ JUEGO ------------");
            char resp='s';
            while(resp != 'n'){
                
                System.out.println("\nLista de palabras claves: ");
                for(int i=0; i<palabrasC.length; i++)
                    System.out.println(""+palabrasC[i]);
                System.out.println("\nIngrese una palabra clave:  ");
                String palabra= entrada.nextLine().toLowerCase();
                
                if (matriz.buscarElementoPalabra(palabra) != null)
                    System.out.println("Objeto encontrado: "+((ObjetosT)matriz.buscarElementoPalabra(palabra)).getNombre());
                else
                    System.out.println("No se encontro ningun objeto");
                
                System.out.println("\nDesea seguir buscando objetos? s/n");
                resp=entrada.nextLine().charAt(0);
            }
            
        }catch(MatrizLlenaExcepcion | MatrizVaciaExcepcion |DimensionInvalidaExcepcion e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
