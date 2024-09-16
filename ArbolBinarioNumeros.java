package arbol;

public class ArbolBinarioNumeros {
    private NodoArbol inicial;

    public ArbolBinarioNumeros() {
        this.inicial = null;
    }

    public void insertar(int valor) {
        if (this.inicial == null) {
            this.inicial = new NodoArbol(valor);
        } else {
            this.inicial.insertar(valor);
        }
    }

    public void dispararPreorden() {
        this.preorden(this.inicial);
    }

    private void preorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        System.out.println(nodo.getValor());
        preorden(nodo.getNodoIzq());
        preorden(nodo.getNodoDerecho());
    }

    public void dispararInorden() {
        this.inorden(this.inicial);
    }

    private void inorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        inorden(nodo.getNodoIzq());
        System.out.println(nodo.getValor());
        inorden(nodo.getNodoDerecho());
    }

    public void dispararPostorden() {
        this.postorden(this.inicial);
    }

    private void postorden(NodoArbol nodo) {
        if (nodo == null) {
            return;
        }
        postorden(nodo.getNodoIzq());
        postorden(nodo.getNodoDerecho());
        System.out.println(nodo.getValor());
    }
}

