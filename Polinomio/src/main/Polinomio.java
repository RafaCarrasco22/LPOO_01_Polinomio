
package main;

/**
 *
 * @author Rafael
 */

public class Polinomio {
    private Nodo inicio;
    //Se inicializa la lista en 0
    public Polinomio() {
        inicio = null;
    }
//Se llama al nodo para que este agregue un monomio, siendo este segundo el que
//recibe coeficientes y exponentes
    public void agregarMonomio (Monomio m) {
        Nodo nuevo = new Nodo(m);

        if (ListaVacia()) {
            inicio = nuevo;
        } else {
            Nodo aux = inicio;

            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
    }
    //Verifica si la lista está vacía
    private boolean ListaVacia() {
        return inicio == null;
    }
    //recorrido de la lista y muestra de resultados
    public void recorrerLista() {
        Nodo aux = inicio;
        while (aux != null) {
            System.out.println(aux.getMonomio());
            aux = aux.getSiguiente();
        }
    }
    
    public void ordenarPorExponente() {
        Nodo aux1 = inicio;
        Nodo aux2 = inicio;

        while (aux2 != null) {
            aux1 = aux2.getSiguiente();

            while (aux1 != null) {
                if (aux1.getMonomio().getExponente().compareTo(aux2.getMonomio().getExponente()) > 0) {
                    Monomio temporal = aux2.getMonomio();
                    aux2.setMonomio(aux1.getMonomio());
                    aux1.setMonomio(temporal);
                } else {
                }
                aux1 = aux1.getSiguiente();
            }
            aux2 = aux2.getSiguiente();
        }
    }
    
    
    public void simplificar() {
        Nodo aux1 = inicio;
        Nodo aux2 = aux1.getSiguiente();

        while (aux2 != null) {
            if ((aux1.getMonomio().getExponente()).equals(aux2.getMonomio().getExponente())) {
                int coeficiente = Integer.parseInt(aux1.getMonomio().getCoeficiente()) + Integer.parseInt(aux2.getMonomio().getCoeficiente());
                aux1.getMonomio().setCoeficiente("" + coeficiente);
                aux2 = aux2.getSiguiente();
                aux1.setSiguiente(aux2);
            } else {
                aux1.setSiguiente(aux2);
                aux1 = aux2;
                aux2 = aux2.getSiguiente();
            }
        }
    }

    
     public void sumarPolinomios(Polinomio lista) {
        Polinomio nueva = new Polinomio();
        Nodo aux = inicio;
        Nodo aux2 = lista.inicio;

        while (aux != null) {
            Monomio n = aux.getMonomio();
            nueva.agregarMonomio(n);
            aux = aux.getSiguiente();
        }

        while (aux2 != null) {
            Monomio n = aux2.getMonomio();
            nueva.agregarMonomio(n);
            aux2 = aux2.getSiguiente();
        }

        nueva.ordenarPorExponente();
        nueva.simplificar();

        inicio = nueva.inicio;
    }

    public void restarPolinomios(Polinomio lista){
        Polinomio nueva = new Polinomio();
        Nodo aux = inicio;
        Nodo aux2 = lista.inicio;

        while (aux != null) {
            Monomio n = aux.getMonomio();
            nueva.agregarMonomio(n);
            aux = aux.getSiguiente();
        }

        while (aux2 != null) {
            Monomio n = aux2.getMonomio();
//cambio de signo para que cuando se vaya a agregarMonomio ya se haga la adición
//y evidentemente al ser de signo contrario esto será restado
            Integer coeficiente = Integer.parseInt(n.getCoeficiente());
            Integer c = -coeficiente;
            nueva.agregarMonomio(new Monomio((String.valueOf(c)), n.getExponente()));
            aux2 = aux2.getSiguiente();
        }

        nueva.ordenarPorExponente();
        nueva.simplificar();

        inicio = nueva.inicio;
    }
    
    
    
    public void multiplicarPolinomios(Polinomio lista) {
        Polinomio nueva = new Polinomio();
        Nodo aux = inicio;
        Nodo aux2;
//Se recorre a la lista para hacer la multiplicación
//*String.valueOf onvierte valor u objeto a tipo String
        while (aux != null) {
            aux2 = lista.inicio;
            while (aux2 != null) {
                int coe = Integer.parseInt(aux.getMonomio().getCoeficiente()) * Integer.parseInt(aux2.getMonomio().getCoeficiente());
                int exp = Integer.parseInt(aux.getMonomio().getExponente()) + Integer.parseInt(aux2.getMonomio().getExponente());
                Monomio m = new Monomio(String.valueOf(coe),String.valueOf(exp));
                nueva.agregarMonomio(m);
                aux2 = aux2.getSiguiente();
            }
            aux = aux.getSiguiente();
        }
        //Ordenamiento y simplificaión de la expresión
        nueva.ordenarPorExponente();
        nueva.simplificar();
        inicio = nueva.inicio;
        
    }    
//División por Ruffini 
    //No salió
    public void dividirPolinomios(Polinomio lista){
        Polinomio nueva = new Polinomio();
        Nodo aux = inicio;
        Nodo aux2;
        
        while (aux != null) {
            aux2 = lista.inicio;
            while (aux2 != null) {
                int a = Integer.parseInt(aux.getMonomio().getExponente());
                int b = Integer.parseInt(aux2.getMonomio().getExponente());
                while(a>=b){
                    
                }
                
                
                aux2 = aux2.getSiguiente();
            }
            aux = aux.getSiguiente();
        }
        
        nueva.ordenarPorExponente();
        nueva.simplificar();
        inicio = nueva.inicio;
    }

    @Override
    public String toString() {
        return inicio.toString();
    }
}
