/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Rafael
 */
public class Monomio {
     private String coeficiente;
    private String exponente;

    public Monomio(String coeficiente, String exponente) {
        this.coeficiente = coeficiente;
        this.exponente = exponente;
    }


    public String getCoeficiente() {
        return coeficiente;
    }

    public void setCoeficiente(String coeficiente) {
        this.coeficiente = coeficiente;
    }

    public String getExponente() {
        return exponente;
    }

    public void setExponente(String exponente) {
        this.exponente = exponente;
    }
//Formato de muestra
    @Override
    public String toString() {
        return coeficiente + " x^" + exponente;
    }
}
