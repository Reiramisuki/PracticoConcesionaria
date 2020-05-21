package ar.org.centro.java.entidades;
/* @author Belen*/
public class Auto extends Vehiculo {
    private String puertas;

    public Auto(String marca, String modelo, double precio,String puertas) {
        super(marca, modelo, precio);
        this.puertas=puertas;
    }
    
    @Override
    public String toString() {
        return super.toString()+ "Puertas: " + puertas + " // ";
    }
    
    public String getPuertas() {
        return puertas;
    }

    public void setPuertas(String puertas) {
        this.puertas = puertas;
    }

    @Override
    public int compareTo(Vehiculo v) {
        return this.compare().compareTo(v.compare());
    }

}
