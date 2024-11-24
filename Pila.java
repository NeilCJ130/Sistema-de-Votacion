package TDAA;

public class Pila<T> {
    private Nodo<T> top;

    public Pila() {
        top = null;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void push(T elemento) {
        Nodo<T> nuevoNodo = new Nodo<>(elemento, null);
        if (isEmpty()) {
            top = nuevoNodo;
        } else {
            nuevoNodo.setSgteNodo(top);
            top = nuevoNodo;
        }
    }

    public T pop() {
        if (!isEmpty()) {
            T elemento = top.getElemento();
            top = top.getSgteNodo();
            return elemento;
        } else {
            throw new RuntimeException("ERROR: no es posible desapilar");
        }
    }

    public T top() {
        if (!isEmpty()) {
            return top.getElemento();
        } else {
            throw new RuntimeException("ERROR: no es posible devolver cima");
        }
    }

    public int longitud() {
        int i = 0;
        Nodo<T> aux = top;
        while (aux != null) {
            aux = aux.getSgteNodo();
            i++;
        }
        return i;
    }
}

