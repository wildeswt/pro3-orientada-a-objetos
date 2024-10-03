/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ap.lab10_mariasandoval;

/**
 *
 * @author Maria Sandoval
 */
public class BajarTemperaturaCommand implements Command{
private RecibidorAireAcond aire;
    private int cantTemp;
    
    public BajarTemperaturaCommand(){
        aire=null;
        cantTemp=0;
    }
    
    public BajarTemperaturaCommand(RecibidorAireAcond aire, int cantTemp){
        this.aire=aire;
        this.cantTemp=cantTemp;
    }

    public void setAire(RecibidorAireAcond aire) {
        this.aire = aire;
    }

    public void setCantTemp(int cantTemp) {
        this.cantTemp = cantTemp;
    }

    public RecibidorAireAcond getAire() {
        return aire;
    }

    public int getCantTemp() {
        return cantTemp;
    }
    
    //Otros metodos
    @Override
    public boolean ejecutar() {
        aire.bajarTemperatura(cantTemp);
        return true;
    } 
}
