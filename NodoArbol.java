package arbol;

public class NodoArbol { //public = accede desde cualquier clase
    private int valor; // un enterio que almacena el valor del nodo
    private NodoArbol nodoIzq; //hijo izquierdo
    private NodoArbol nodoDerecho; //hijo derecho

    public NodoArbol(int valor) { //constructor NodoArbol
        this.valor = valor; //inicializa el atributo valor con el valor proporcionado al constructor
        this.nodoIzq = null; //no hijos
        this.nodoDerecho = null; //no hijos
    }
    public int getValor() { //método que devuelve el valor del nodo
        return valor;
    }
    public NodoArbol getNodoIzq() { //devuelve el nodo izquierdo del nodo actual
        return nodoIzq;
    }
    public NodoArbol getNodoDerecho() { //devuelve el nodo derecho del nodo actual
        return nodoDerecho;
    }
    public void insertar(int NewValor) {
        if (NewValor < this.valor) { //compara el valor nuevo con el valor nodo actual
            if (this.nodoIzq == null) { //si no hay hijo izquierdo ->
                this.nodoIzq = new NodoArbol(NewValor); // crea un hijo izquierdo
            } else { //si hay un hijo ->
                this.nodoIzq.insertar(NewValor); //llama recursividad al metodo insertar para reencontrar la ubicacion correcta
            }
        } else { //si NewValor es mayor al valor actual hace el mismo recorrido pero en el hijo derecho
            if (this.nodoDerecho == null) { //si no hay hijo derecho ->
                this.nodoDerecho = new NodoArbol(NewValor); //crea un hijo derecho
            } else { //si ya hay hijo derecho ->
                this.nodoDerecho.insertar(NewValor); //se implementa recursividad al método insertar en el hijo derecho para encontrar su ubicación
            }
        }
    }
}
