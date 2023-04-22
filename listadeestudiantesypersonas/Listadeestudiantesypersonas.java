
package listadeestudiantesypersonas;
public class Listadeestudiantesypersonas {

    
    public static void main(String[] args) {
         ListaEnlazada lista = new ListaEnlazada();
        
        Persona persona1 = new Persona("Juan", 30);
        Persona persona2 = new Estudiante("Maria", 20, "Ingenieria");
        Persona persona3 = new Profesor("Pedro", 40, "Matematicas");
        Persona persona4 = new Profesor("samuel", 39, "geometria");
        Persona persona5 = new Trabajador("Maria",50,"Restaurante","Mesera");
        lista.agregarElemento(27,"mateo");
        lista.imprimirLista();
        
        persona1.saludar();
        ((Estudiante) persona2).estudiar();
        ((Profesor) persona3).ensenar();
        ((Profesor)persona4).ensenar();
        ((Trabajador)persona5).Trabajar();
    }
    }
