package main;

/**
 *
 * @author Rafael
 */

public class Main {

   public static void main(String[] args) {
       //Creación de objetos
        Polinomio p1 = new Polinomio();
        Polinomio p2 = new Polinomio();
        
        p1.agregarMonomio(new Monomio("-5", "2"));
        p1.agregarMonomio(new Monomio("-1", "2"));
        p1.agregarMonomio(new Monomio("2", "1"));
        p1.agregarMonomio(new Monomio("-5", "1"));
        p1.agregarMonomio(new Monomio("-12", "2"));
        
        p2.agregarMonomio(new Monomio("-5", "2"));
        p2.agregarMonomio(new Monomio("-1", "2"));
        p2.agregarMonomio(new Monomio("2", "1"));
        p2.agregarMonomio(new Monomio("-5", "1"));
        p2.agregarMonomio(new Monomio("-12", "2"));
        
        p2.ordenarPorExponente();
        p2.simplificar();
        p2.recorrerLista();
        
        System.out.println("Polinomio");
        p1.recorrerLista();
        System.out.println("***********************");
        System.out.println("Polinomio Ordenado Por Exponentes");
        p1.ordenarPorExponente();
        p1.recorrerLista();
        System.out.println("***********************");
        System.out.println("Polinomio Simplificado");
        p1.simplificar();
        p1.recorrerLista();
        System.out.println("************************");
        System.out.println("Suma de polinomios");
        p1.sumarPolinomios(p2);
        p1.recorrerLista();
        System.out.println("************************");
//PARA LA RESTA DA EL VALOR INICIAL YA QUE SE LE ESTÁ RESTANDO EL VALOR 
//SIMPLIFICADO AL QUE RECIÉN SUMAMOS, ES DECIR 1+1=2 Y DESPUES A ESE 2 RESTARLE 1 
        System.out.println("Resta de polinomios");
        p1.restarPolinomios(p2);
        p1.recorrerLista();
        System.out.println("************************");
        System.out.println("Multiplicacion de polinomios");
        p1.multiplicarPolinomios(p2);
        p1.simplificar();
        p1.recorrerLista();
        System.out.println("************************");
        //System.out.println("Division de polinomios");
        //p1.dividirPolinomios(p2);
        //System.out.println("************************");
        //System.out.println("Los valores de X son: ");
        
    }
    
}
