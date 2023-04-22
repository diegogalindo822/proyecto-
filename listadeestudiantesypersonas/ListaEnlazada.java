
package listadeestudiantesypersonas;


public class ListaEnlazada {
    Nodo cabeza;
    
    public ListaEnlazada() {
        this.cabeza = null;
    }
    
    public void agregarElemento(int edad,String nombre) {
        Nodo nuevoNodo = new Nodo(edad,nombre);
        
        if (this.cabeza == null) {
            this.cabeza = nuevoNodo;
        } else {
            Nodo nodoActual = this.cabeza;
            while (nodoActual.siguiente != null) {
                nodoActual = nodoActual.siguiente;
            }
            nodoActual.siguiente = nuevoNodo;
        }
    }
    
    public void imprimirLista() {
        Nodo nodoActual = this.cabeza;
        while (nodoActual != null) {
            System.out.println("la edad es:"+nodoActual.edad+ " "+"el nombre es:"+nodoActual.nombre);
            
            nodoActual = nodoActual.siguiente;
        }
    }
}