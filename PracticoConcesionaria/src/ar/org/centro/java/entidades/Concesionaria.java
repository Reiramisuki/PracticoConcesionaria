package ar.org.centro.java.entidades;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Collections;
/*@author Belen*/
public class Concesionaria  {
    int i;
    String patron = " $###,###,###.00";
    DecimalFormat formateo = new DecimalFormat(patron);
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    public void listar() {
        Auto auto = new Auto("Peugeot", "206", 200000.00,"4");
        Moto moto = new Moto("Honda","Titan",60000.00,"125c");
        Auto auto1 = new Auto("Peugeot","208",250000.00,"5");
        Moto moto1 = new Moto("Yamaha","YBR",80500.50,"160c");
        
        vehiculos.add(auto);
        vehiculos.add(moto);
        vehiculos.add(auto1);
        vehiculos.add(moto1);
        
    }
    public void mostrar(){
         for (i=0; i<vehiculos.size(); i++){
            String precioAMostrar = formateo.format(vehiculos.get(i).getPrecio());
            System.out.println (vehiculos.get(i).toString() + "Precio:" + precioAMostrar);
            }
         }
    public void mostratMasCaro() {
        Vehiculo mayorPrecio = null;
        if (!vehiculos.isEmpty()) {
            mayorPrecio = vehiculos.get(0);
        }
        for (int i = 1; i < vehiculos.size(); i++) {
            if (mayorPrecio.getPrecio() < vehiculos.get(i).getPrecio()) {
                mayorPrecio = vehiculos.get(i);
            }
        }
        System.out.println("Vehículo más caro: " + mayorPrecio.getMarca() + " " + mayorPrecio.getModelo());
    }
    public void mostrarMasBarato() {
        Vehiculo menorPrecio = null;
        if (!vehiculos.isEmpty()) {
            menorPrecio = vehiculos.get(0);
        }
        for (int i = 1; i < vehiculos.size(); i++) {
            if (menorPrecio.getPrecio() > vehiculos.get(i).getPrecio()) {
                menorPrecio = vehiculos.get(i);
            }
        }
        System.out.println("Vehículo más barato: " + menorPrecio.getMarca() + " " + menorPrecio.getModelo());
    }
     
    public void mostrarConY() {
        String patron = " $###,###,###.00";
        DecimalFormat formateo = new DecimalFormat(patron);
        for (int i = 1; i < vehiculos.size(); i++) {
            if (vehiculos.get(i).getModelo().contains("Y")) {
            String precioAMostrar = formateo.format(vehiculos.get(i).getPrecio());
            System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo() + " " +  precioAMostrar);
            }
        }
    }  
        
    public void mostrarOrdenMayorAMenor() {
          Collections.sort(vehiculos);
          System.out.println("Vehiculos ordenados por precio de Mayor a Menor: ");
          for (i = 0; i < vehiculos.size(); i++) {
          System.out.println(vehiculos.get(i).getMarca() + " " + vehiculos.get(i).getModelo());
        }
        
    }      
    public void mostrarOrdenNatural(){
        System.out.println("Vehículos ordenados por orden natural:");
        vehiculos.stream().sorted().forEach(System.out::println);
    }
       
}
