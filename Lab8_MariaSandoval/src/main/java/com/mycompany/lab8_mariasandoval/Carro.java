package com.mycompany.lab8_mariasandoval;

/**
 *
 * @author Labam
 */
public class Carro {
    //Atributos
    private String marca;
    private String modelo;
    private String color;
    private String placa;
    private double kilometraje;
    
    //Constructores
    public Carro (){ //Sin parametros
        marca=modelo=color=placa=" ";
        kilometraje=0.00;
    }
    
    public Carro (String marca, String modelo, String color, String placa, double kilometraje) throws NumeroNegativoExcepcion{
        this.marca=marca;   //Con parametros
        this.color=color;
        this.modelo=modelo;
        this.placa=placa;
        if (kilometraje < 0)
            throw new NumeroNegativoExcepcion("El kilometraje no puede ser negativo");
        this.kilometraje=kilometraje;
    }
    
    //SET/GET
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public void setKilometraje(double kilometraje)throws NumeroNegativoExcepcion {
        if (kilometraje < 0)
            throw new NumeroNegativoExcepcion("El kilometraje no puede ser negativo");
        this.kilometraje=kilometraje;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getColor() {
        return color;
    }

    public String getPlaca() {
        return placa;
    }

    public double getKilometraje() {
        return kilometraje;
    }
    
    //Otros metodos
    public void ImprimirInfo(){
        System.out.println("Marca: "+marca);
        System.out.println("Modelo: "+modelo);
        System.out.println("Color: "+color);
        System.out.println("Placa: "+placa);
        System.out.println("Kilometraje: "+kilometraje);
    }
    
    public void ImprimirPlaca(){
        System.out.print(" Placa: "+placa);
    }
    
    @Override
    public String toString(){
        return "Carro: "+marca+" "+modelo+" Color: "+color+" Placa: "+placa+" Kilometraje: "+kilometraje;
    }
}
