package Practica_2;

/**
 *
 * @author HMCC
 */
public class ListaEnlazada<E> {

    private NodoLista<E> cabecera;
    private Integer size;
    public ListaEnlazada() {
        this.cabecera = null;
        this.size = 0;
    }
    
    public Boolean estaVacia() {
        return cabecera == null;
    }

    public void insertar(E dato) {
        NodoLista<E> nuevo = new NodoLista<>(dato, null);
        if (estaVacia()) {
            cabecera = nuevo;
        } else {
            NodoLista<E> aux = cabecera;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        size++;
    }

    public Integer getSize() {
        return size;
    }

}
