package TDAA;

public class Cola<T> {
    private Nodo<T> frente;
    private Nodo<T> ultimo;

    public Cola() {
        frente = null;
        ultimo = null;
    }

    public boolean esVacia() {
        return frente == null;
    }

    public void encolar(T pElemento) {
        Nodo<T> nuevoNodo = new Nodo<>(pElemento, null);
        if (esVacia()) {
            frente = nuevoNodo;
            ultimo = nuevoNodo;
        } else {
            ultimo.setSgteNodo(nuevoNodo);
            ultimo = nuevoNodo;
        }
    }

    public T desencolar() {
        if (!esVacia()) {
            T x = frente.getElemento();
            frente = frente.getSgteNodo();
            return x;
        } else {
            throw new RuntimeException("ERROR: no es posible desencolar");
        }
    }

    public T frente() {
        if (!esVacia()) {
            return frente.getElemento();
        } else {
            throw new RuntimeException("ERROR: no es posible devolver frente");
        }
    }

    public int longitud() {
        int i = 0;
        Nodo<T> aux = frente;
        while (aux != null) {
            aux = aux.getSgteNodo();
            i++;
        }
        return i;
    }
}
