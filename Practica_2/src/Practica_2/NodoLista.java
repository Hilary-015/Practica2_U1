package Practica_2;

/**
 *
 * @author HMCC
 */
public class NodoLista <E>{
    private E dato;
    private NodoLista <E> siguiente;

    public E getDato() {
        return dato;
    }

    public void setDato(E dato) {
        this.dato = dato;
    }

    public NodoLista <E> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoLista <E> siguiente) {
        this.siguiente = siguiente;
    }

    public NodoLista() {
        this.dato = null;
        this.siguiente = null;
    }

    public NodoLista(E dato, NodoLista<E> siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
    }
    
    
    
}
