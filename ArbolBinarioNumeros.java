package arbol;

public class ArbolBinarioNumeros {
    private NodoArbol inicial;//nodo privado de instancia inicial = raíz del arbol binario
    
    public ArbolBinarioNumeros() { //constructor de la clase
        this.inicial = null; //inicializamos atributo .inicial para crear nueva instancia de la clase actual
    }
    public void insertar(int valor) {//método insertar
        if (this.inicial == null) { //si el arbol esta vacío ->
            this.inicial = new NodoArbol(valor);//creamos la raíz con el valor proporcionado
        } else { //si no esta vacío
            this.inicial.insertar(valor); //llamamos método insertar para agregar el valor
        }
    }
    public void dispararPreorden() { //inicializar recorrido preorden
        this.preorden(this.inicial); //llamar método preorden
    } 
    private void preorden(NodoArbol nodo) { //método preorden
        if (nodo == null) { //si es null termina la recursión
            return;}
        System.out.println(nodo.getValor());//raiz
        preorden(nodo.getNodoIzq());//izquierda
        preorden(nodo.getNodoDerecho());//derecha
    }
    
    public void dispararInorden() { //inicializar recorrido preorden inorden
        this.inorden(this.inicial);
    }
    private void inorden(NodoArbol nodo) {
        if (nodo == null) {//si es null termina la recursión
            return;}
        inorden(nodo.getNodoIzq());//izquierda
        System.out.println(nodo.getValor());//raiz
        inorden(nodo.getNodoDerecho());//derecho
    }
    
    public void dispararPostorden() { //inicializar recorrido preorden postorden
        this.postorden(this.inicial);
    }
    private void postorden(NodoArbol nodo) {
        if (nodo == null) {//si es null termina la recursión
            return;}
        postorden(nodo.getNodoIzq());//izquierda
        postorden(nodo.getNodoDerecho());//derecha
        System.out.println(nodo.getValor());//raiz
    }
}

