package com.mycompany.lab8_mariasandoval;

/**
 *
 * @author Labam
 * @param <E>
 */
public class MatrizGenerica <E> {
    //Atributos
    private E elementos[][];
    private int tamannoX;
    private int tamannoY;
    
    //Constructores
    public MatrizGenerica(){ //Sin parametros
        elementos= (E[][])new Object[tamannoX][tamannoY];
        tamannoX=tamannoY=0;
    }
    
    public MatrizGenerica(int tamannoX, int tamannoY) throws NumeroNegativoExcepcion{
        if (tamannoX < 0 || tamannoY < 0) //Con parametros
            throw new NumeroNegativoExcepcion("El tamanno no puede ser negativo");
        this.tamannoX=tamannoX; 
        this.tamannoY=tamannoY;
        this.elementos=(E[][])new Object[tamannoX][tamannoY];
    }
    
    //SET/GET
    public void setElementos(E[][] elementos) {
        this.elementos = elementos;
    }

    public void setTamannoX(int tamannoX) throws NumeroNegativoExcepcion{
        if (tamannoX < 0)
            throw new NumeroNegativoExcepcion("El tamanno no puede ser negativo");
        this.tamannoX=tamannoX; 
    }

    public void setTamannoY(int tamannoY) throws NumeroNegativoExcepcion{
        if (tamannoY < 0)
            throw new NumeroNegativoExcepcion("El tamanno no puede ser negativo");
        this.tamannoY=tamannoY;
    }

    public E[][] getElementos() {
        return elementos;
    }

    public int getTamannoX() {
        return tamannoX;
    }

    public int getTamannoY() {
        return tamannoY;
    }
    
    //Otros metodos
    public E CrearMatrizGenerica (int x, int y) throws NumeroNegativoExcepcion{
        if ( x < 0 || y < 0)
            throw new NumeroNegativoExcepcion("El tamanno no puede ser negativo");
        elementos= (E[][])new Object[x][y];
        return (E) elementos;
    }
    
    public E BuscarObjeto (int x, int y) throws PosicionNoValidaExcepcion, NumeroNegativoExcepcion{
        if (x > tamannoX || y > tamannoY)
            throw new PosicionNoValidaExcepcion("Posicion no existe en su matriz");
        if (tamannoX < 0 || tamannoY < 0)
            throw new NumeroNegativoExcepcion("La posicion no puede ser negativa");
        return elementos[x][y];
    }
    
    public boolean MatrizLlena(){
        for(int i=0; i<tamannoX; i++)
            for(int j=0; j<tamannoY; j++)
                if(elementos[i][j]==null)
                    return false;
        return true;
    }
    
    public boolean MatrizVacia(){
        for(int i=0; i<tamannoX; i++)
            for(int j=0; j<tamannoY; j++)
                if(elementos[i][j]!=null)
                    return false;
        return true;
    }
    
    public void EstablecerElem(int x, int y, E elem) throws MatrizLlenaExcepcion, PosicionOcupadaExcepcion, PosicionNoValidaExcepcion{
        if(MatrizLlena())
            throw new MatrizLlenaExcepcion("La matriz esta llena");
        if (elementos[x][y]!=null)
            throw new PosicionOcupadaExcepcion("Ya existe un objeto en esa posicion");
        if (x > tamannoX || y > tamannoY)
            throw new PosicionNoValidaExcepcion("Posicion no existente en su matriz");
        elementos[x][y]=elem;
    }
    
    public int ObtenerNfilas (){
        return tamannoX;
    }
    
    public int ObtenerNcol (){
        return tamannoY;
    }
    
    public void Imprimir() throws MatrizVaciaExcepcion{
        if (MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz está vacía");
        for (int i=0; i<tamannoX; i++){
            for (int j=0; j<tamannoY; j++){
                System.out.print(" ("+i+","+j+")");
                if(elementos[i][j] instanceof Estudiante estudiante)
                    estudiante.ImprimirNombre();
                if(elementos[i][j] instanceof Carro carro)
                    carro.ImprimirPlaca();
                if(elementos[i][j]==null)
                    System.out.print(" null");
            }
            System.out.println(" ");
        }
    }
    
    public void ImprimirEst() throws MatrizVaciaExcepcion{
         if (MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz está vacía");
        for (int i=0; i<tamannoX; i++)
            for (int j=0; j<tamannoY; j++){
                if(elementos[i][j] instanceof Estudiante estudiante){
                    System.out.print(" ("+i+","+j+")");
                    estudiante.ImprimirNombre();
                }
            }
    }
    
    public void ImprimirCarro() throws MatrizVaciaExcepcion{
         if (MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz está vacía");
        for (int i=0; i<tamannoX; i++)
            for (int j=0; j<tamannoY; j++){
                if(elementos[i][j] instanceof Carro carro){
                    System.out.print(" ("+i+","+j+")");
                    carro.ImprimirPlaca();
                }
            }
    }
    
    public int CantEst() throws MatrizVaciaExcepcion{
        if (MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz está vacía");
        int cant=0;
        for (int i=0; i<tamannoX; i++)
            for (int j=0; j<tamannoY; j++)
                if(elementos[i][j] instanceof Estudiante)
                    cant++;
        return cant;
    }
    
    public int CantCarros() throws MatrizVaciaExcepcion{
        if (MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz está vacía");
        int cant=0;
        for (int i=0; i<tamannoX; i++)
            for (int j=0; j<tamannoY; j++)
                if(elementos[i][j] instanceof Carro)
                    cant++;
        return cant;
    }
    
    public double PromedioNotas() throws MatrizVaciaExcepcion{
        if (MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz está vacía");
        double notas=0;
        for (int i=0; i<tamannoX; i++)
            for (int j=0; j<tamannoY; j++)
                if(elementos[i][j] instanceof Estudiante est)
                    notas+= est.getCalificacion();
        return notas/CantEst();
    }
    
    public double PromedioKilometraje() throws MatrizVaciaExcepcion{
        if (MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz está vacía");
        double kilometrajes=0;
        for (int i=0; i<tamannoX; i++)
            for (int j=0; j<tamannoY; j++)
                if(elementos[i][j] instanceof Carro carro)
                    kilometrajes+= carro.getKilometraje();
        return kilometrajes/CantCarros();
    }
    
    public E BuscarObjetoPalabra(String palabra) throws MatrizVaciaExcepcion{
        if(MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz esta vacia");
        palabra=palabra.toLowerCase();
        for(int i=0; i<tamannoX; i++)
            for(int j=0; j<tamannoY; j++)
                if(elementos[i][j]!= null && elementos[i][j].toString().toLowerCase().contains(palabra))
                    return elementos[i][j];
        System.out.println("Objeto no encontrado");
        return null;
    }    
}