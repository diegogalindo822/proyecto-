
package listadeestudiantesypersonas;


public class Trabajador extends Persona {
        String trabajo;
        String ocupacion;
    
    public Trabajador(String nombre, int edad, String trabajo,String ocupacion) {
        super(nombre, edad);
        this.trabajo = trabajo;
        this.ocupacion = ocupacion;
    }
    
    public void Trabajar() {
        System.out.println(this.nombre + " trabaja en: " + this.trabajo+" y "+" su cargo es: "+this.ocupacion);
    }
    
}