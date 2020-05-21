package ar.org.centro.java.entidades;
/* @author Belen*/
public class Moto extends Vehiculo{
    private String cilindrada;

    public Moto(String marca, String modelo, double precio,String cilindrada ) {
        super(marca, modelo, precio);
        this.cilindrada=cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + "Cilindrada: " + cilindrada + " // ";
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public int compareTo(Vehiculo v) {
        return this.compare().compareTo(v.compare());
    }
     
}
