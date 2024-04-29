package probaprobinha;

/** start 
 * 
*/
public class Estudiante {

    private String nombre;
    private int edad;
    private double calificacion;

     public Estudiante(){}
    /**
     * Parametrized constructor
     * @param nombre sets the name of the student
     * @param edad sets the age of the student
     */
    public Estudiante(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificacion = 0.0;
    }
/**
 * this setter set the value of the grade
 * @param calificacion sets the value of calificacion
 */
    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
/**
 * this getter gets the value of the name
 * @return the value of the name
 */
    public String getNombre() {
        return nombre;
    }
/**
 * this setter sets the value of the name
 * @param nombre sets the value of nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 * this getter gets the value of the age
 * @return the value of the age
 */
    public int getEdad() {
        return edad;
    }
/**
 * this setter set the age
 * @param edad sets the value of age
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }
/**
 * this getter gets the grade
 * @return the value of the grade
 */
    public double getCalificacion() {
        return calificacion;
    }

    /**
     * this method checks if an student pass
     * @return the minimum qualification to pass 
     * setting it higher or equals 5 to return true
     */
    public boolean aprobo() {
        return calificacion >= 5.0;
    }
    /**
     * this method divides age by 12
     * @return the age divided by 12
     */
    public int edadEscolar() {
        return edad / 12;
    }
    /**
     * this method check if an students is on university
     * @return the value of the age to 
     * be an universitary, setting it to be 
     * higher or equals to 18 
     */
    public boolean esUniversitario() {
        return edad >= 18;
    }
    /**
     * this method do not return nothing 
     * but print the values of nombre, edad and calificacion
     * 
     */
    public void imprimirInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Calificación: " + calificacion);
    }
}