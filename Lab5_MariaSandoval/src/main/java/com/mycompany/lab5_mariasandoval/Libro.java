package com.mycompany.lab5_mariasandoval;

/**
 *
 * @author Labam
 */
public class Libro {
    //Atributos
    private String titulo;
    private String autor;
    
    //Constructores
    public Libro (){ //Sin parametros
        titulo=autor="";
    }
    
    public Libro (String titulo, String autor){
        this.titulo=titulo;  //Con parametros
        this.autor=autor;
    }
    
    //SET/GET
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        System.out.println("Titulo: "+titulo);
        System.out.println("Autor: "+autor);
    }
}
