
package listadeestudiantesypersonas;


    
public class Profesor extends Persona {
    String materia;
    
    public Profesor(String nombre, int edad, String materia) {
        super(nombre, edad);
        this.materia = materia;
    }
    
    public void ensenar() {
        System.out.println(this.nombre + " es profesor de: " + this.materia);
    }
    
}
    

