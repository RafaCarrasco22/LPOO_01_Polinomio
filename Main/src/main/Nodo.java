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
public class Nodo {
     private Monomio monomio;
    private Nodo siguiente;

    public Nodo (Monomio monomio) {
        this.monomio = monomio;
        siguiente = null;
    }

    public Monomio getMonomio() {
        return monomio;
    }

    public void setMonomio(Monomio monomio) {
        this.monomio = monomio;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    @Override
    public String toString() {
        return  monomio + " + " + siguiente;
    }
}
