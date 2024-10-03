package ap.continuacionlab8_mariasandoval;

/**
 *
 * @author Maria Sandoval
 * @param <E>
 */
public class MatrizGenerica <E> {
    //Atributos
    private E[][] elementos;
    private int tamannoX;
    private int tamannoY;
    
    //Constructores
    public MatrizGenerica(){ //Sin parametros
        tamannoX=tamannoY=1;
        elementos= (E[][]) new Object[tamannoX][tamannoY];
    }
    
    public MatrizGenerica(int tamannoX, int tamannoY)throws DimensionInvalidaExcepcion{ //Con parametros
        if(tamannoX<=0 || tamannoY<=0)
            throw new DimensionInvalidaExcepcion(" Las dimensiones no pueden ser negativas ni igual a 0");
        this.tamannoX=tamannoY;  
        this.tamannoY= tamannoY;
        this.elementos= (E[][]) new Object[tamannoX][tamannoY];
    }
    
    //SET/GET

    public void setElementos(E[][] elementos) {
        this.elementos = elementos;
    }

    public void setTamannoX(int tamannoX) throws DimensionInvalidaExcepcion{
        if(tamannoX<=0)
            throw new DimensionInvalidaExcepcion("La dimiension debe ser mayor que 0");
        this.tamannoX = tamannoX;
    }

    public void setTamannoY(int tamannoY) throws DimensionInvalidaExcepcion{
        if(tamannoY<=0)
            throw new DimensionInvalidaExcepcion("La dimiension debe ser mayor que 0");
        this.tamannoY = tamannoY;
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
    public void ImprimirInfo() throws MatrizVaciaExcepcion{
        if(MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz esta vacia");
        for(int i=0; i<tamannoX; i++){
            for(int j=0; j<tamannoY; j++)
                if(elementos[i][j] != null &&  elementos[i][j] instanceof ObjetosT aux)
                    System.out.print(""+aux.getNombre()+" ");
                else
                    System.out.print("null ");
            System.out.println();
        }      
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
    
    public void EstablecerElem(int x, int y, E obj)throws DimensionInvalidaExcepcion, MatrizLlenaExcepcion{
        if(MatrizLlena())
            throw new MatrizLlenaExcepcion("La matriz esta llena");
        if(x>=tamannoX || y>=tamannoY)
            throw new DimensionInvalidaExcepcion("Posicion no existente");
        if(x<0 || y<0)
            throw new DimensionInvalidaExcepcion("La posicion no puede ser negativa");
        elementos[x][y]=obj;
    }
    
    public E buscarElementoPosicion (int x, int y)throws DimensionInvalidaExcepcion, MatrizVaciaExcepcion{
        if(MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz esta vacia");
        if(x>=tamannoX || y>=tamannoY)
            throw new DimensionInvalidaExcepcion("Posicion no existente");
        if(x<0 || y<0)
            throw new DimensionInvalidaExcepcion("La posicion no puede ser negativa");
        return elementos[x][y];
    }
    
    public E buscarElementoPalabra(String palabra) throws MatrizVaciaExcepcion{
        if(MatrizVacia())
            throw new MatrizVaciaExcepcion("La matriz esta vacia");
        for(int i=0; i<tamannoX; i++)
            for(int j=0; j<tamannoY; j++)
                if (elementos[i][j] !=null && elementos[i][j] instanceof ObjetosT aux)
                    if(aux.getPalabra1().equals(palabra) || aux.getPalabra2().equals(palabra))
                        return elementos[i][j];    
        return null;
    }
}
