package ar.org.centro.java.test;
import ar.org.centro.java.entidades.Concesionaria;
/* @author Belen*/
public class TestConcecionaria {
    public static void main(String[] args) {
        Concesionaria testC= new Concesionaria();
        
        testC.listar();
        testC.mostrar();
        
        System.out.println("=============================");
        
        testC.mostratMasCaro();
        testC.mostrarMasBarato();
        testC.mostrarConY();
        
        System.out.println("=============================");
   
        testC.mostrarOrdenMayorAMenor();
        
        System.out.println("=============================");
   
        testC.mostrarOrdenNatural();
    }
}
