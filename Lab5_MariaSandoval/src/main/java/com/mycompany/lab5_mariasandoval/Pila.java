package com.mycompany.lab5_mariasandoval;

/**
 *
 * @author Labam
 * @param <P>
 */
public class Pila <P>{
    //Atributos
    private int tamanno;
    private int cima;
    private P[] elementos;
    
    //Constructores
    public Pila (){  //Sin parametros
        tamanno=0;
        cima=-1;
        elementos=(P[])new Object[tamanno];
    }
    
    public Pila(int tamanno) throws TamannoInvalidoExcepcion{  //Con parametros
        this.tamanno=tamanno;
        this.cima=-1;
        if (tamanno < 0)
            throw new TamannoInvalidoExcepcion("El tamanno no puede ser negativo");
        this.elementos=(P[])new Object[tamanno];
    }
    
    //SET/GET
    public void setTamanno(int tamanno) {
        this.tamanno = tamanno;
    }

    public void setCima(int cima) {
        this.cima = cima;
    }

    public void setElementos(P[] elementos) {
        this.elementos = elementos;
    }

    public int getTamanno() {
        return tamanno;
    }

    public int getCima() {
        return cima;
    }

    public P[] getElementos() {
        return elementos;
    }
    
    //Otros metodos
    public boolean esVacia(){
        return cima==-1;
    }
    
    public boolean esLlena(){
        return cima==tamanno-1;
    }
    
    public void CrearPila (){
       cima=-1;
    }
    
    public void Apilar (P elem) throws PilaLlenaExcepcion{
        if (esLlena())
            throw new PilaLlenaExcepcion("La pila esta llena");
        else{
            cima++;
            elementos[cima]=elem;
        }
    }
    
    public P Desapilar () throws PilaVaciaExcepcion{
        if (esVacia()){
            throw new PilaVaciaExcepcion("La pila esta vacia");
        }else{
            P aux;
            aux=elementos[cima];
            cima--;
            return aux;
        }
    }
    
    public void ImprimirInfo() throws PilaVaciaExcepcion{
        if (esVacia())
            throw new PilaVaciaExcepcion("La pila esta vacia");
        else
            for(int i=0; i<=cima; i++)
                if (elementos[i] instanceof Carta carta){
                    carta.ImprimirInfo();
                    System.out.println("---------------------------------");
                }else if (elementos[i] instanceof Libro libro){
                    libro.ImprimirInfo();
                    System.out.println("---------------------------------");
                }   
    }
    
    public int Tamaño() throws PilaVaciaExcepcion{
        if (esVacia()){
            throw new PilaVaciaExcepcion("La pila esta vacia");
        }
        return cima;
    }
    
    public Pila<P> mezcla(Pila<P> q) throws TamannoInvalidoExcepcion, PilaLlenaExcepcion, PilaVaciaExcepcion {
        Pila<P> resultado = new Pila<>(this.getTamanno() + q.getTamanno());
        Pila<P> pInvertida = new Pila<>(this.getTamanno());
        Pila<P> qInvertida = new Pila<>(q.getTamanno());

        // Invertir las pilas p y q
        while (!this.esVacia()) {
            pInvertida.Apilar(this.Desapilar());
        }
        
        while (!q.esVacia()) {
            qInvertida.Apilar(q.Desapilar());
        }

        // Mezclar alternadamente las pilas invertidas
        while (!pInvertida.esVacia() || !qInvertida.esVacia()) {
            if (!pInvertida.esVacia())
                resultado.Apilar(pInvertida.Desapilar());
            if (!qInvertida.esVacia())
                resultado.Apilar(qInvertida.Desapilar());
        }
        return resultado;
    }
}
