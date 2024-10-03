package ap.continuacionlab7_mariasandoval;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

/**
 *
 * @author Maria Sandoval
 */
public class ContinuacionLab7_MariaSandoval {

    public static void main(String[] args) {
        //Crear instancias
        TreeSet<String> conj = new TreeSet<>();
        conj.add("Carro");
        conj.add("Secadora");
        conj.add("Lapices");
        TreeSet<Usuario> conjUsu = new TreeSet<>();
        Usuario usu1= new Usuario("Maria");
        Usuario usu2= new Usuario("Fernanda");
        Usuario usu3= new Usuario("Estefania");
        Usuario usu4= new Usuario("Samuel");
        Usuario usu5= new Usuario("Jeannette");
        conjUsu.add(usu1);
        conjUsu.add(usu2);
        conjUsu.add(usu3);
        conjUsu.add(usu4);
        conjUsu.add(usu5);
        TreeSet<Usuario> conjUsuInverso = new TreeSet<>(new CompararNombreInverso());
        conjUsuInverso.addAll(conjUsu);
        List<Usuario> listaUsu = new ArrayList<>(conjUsu);
        
        
        //Prueba de funciones
        System.out.println("Elementos ordenados:");
        for (String elemento : conj) 
            System.out.println("- " + elemento);
       
        System.out.println("\nConjunto de usuarios por orden natural:");
        for (Usuario usu : conjUsu) 
            usu.ImprimirInfo();
        
        Collections.sort(listaUsu);
        System.out.println("\nLista de usuarios por orden natural:");
        for (Usuario usu : listaUsu)
            usu.ImprimirInfo();
        
        Collections.sort(listaUsu, new CompararNombreInverso());
        System.out.println("\nLista de usuarios ordenados por nombre inverso: ");
        for (Usuario usu : listaUsu)
            usu.ImprimirInfo();
    }
}