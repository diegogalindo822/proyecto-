
package listadeestudiantesypersonas;


public class Estudiante extends Persona {
    String carrera;
    
    public Estudiante(String nombre, int edad, String carrera) {
        super(nombre, edad);
        this.carrera = carrera;
    }
    
    public void estudiar() {
        System.out.println(this.nombre + " está estudiando " + this.carrera);
    }
    
}

