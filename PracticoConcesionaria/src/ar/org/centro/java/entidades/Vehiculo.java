package ar.org.centro.java.entidades;
/* @author Belen*/
public abstract class Vehiculo implements Comparable<Vehiculo> {
    private String marca;
    private String modelo;
    private Double precio;

    public Vehiculo(String marca,String modelo,double precio){
        this.marca=marca;
        this.modelo=modelo;
        this.precio=precio;
    }
    @Override
    public String toString() {
        return "Marca: " + marca + " // Modelo: " + modelo + " // ";
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }
    
    public String compare(){
       return marca+modelo+precio;
    }
}
