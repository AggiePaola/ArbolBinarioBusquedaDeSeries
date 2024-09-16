package arbol;
/* Actividad: Se tiene almacenado en un árbol binario de búsqueda una serie
de números ordenados de menor a mayor. Diseñe un procedimiento que devuelva los números, 
pero ordenados de mayor a menor. Los números almacenados son definidos por
los estudiantes. */
public class Arbol {
    public static void main(String[] args) {
        ArbolBinarioNumeros arbol = new ArbolBinarioNumeros();
        arbol.insertar(100);
        arbol.insertar(96);
        arbol.insertar(84);
        arbol.insertar(73);
        arbol.insertar(62);
        arbol.insertar(51);
        arbol.insertar(40);
        arbol.insertar(32);
        arbol.insertar(22);
        arbol.insertar(17);
        arbol.insertar(07);
        arbol.insertar(01);
        arbol.insertar(0);
        /*System.out.println("INORDEN: ");
        arbol.dispararInorden();*/
        /*System.out.println("POSTORDEN: ");
        arbol.dispararPostorden();*/
        System.out.println("PREORDEN: "); //mayor a menor
        arbol.dispararPreorden();
    }
}
