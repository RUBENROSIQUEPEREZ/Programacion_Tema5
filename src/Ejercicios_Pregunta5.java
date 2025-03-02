/*
Crea una clase Empleado (dni, nombre, sueldo). La clase contendrá un atributo estático o atributo de clase  (numEmpleados)

Constructor por defecto, setters y getters.

Crear la clase principal, donde crearemos un empleado con constructor por defecto, y mostraremos el número de empleados.
A continuación creamos otros dos empleados y volvemos a mostrar cuantos empleados hay
*/

public class Ejercicios_Pregunta5 {
    public static void main (String []args){

        Empleado empleado1 = new Empleado();
        System.out.println("Número empleados:"+Empleado.getNumEmpleados());

        Empleado empleado2 = new Empleado();
        Empleado empleado3 = new Empleado();

        System.out.println("Número empleados:"+Empleado.getNumEmpleados());
    }
}
class Empleado{
    //Atributos
    private String dni;
    private String nombre ;
    private double sueldo ;
    private static int numEmpleados = 0;

    //Constructor
    public Empleado (){
        this.dni ="88888888X";
        this.nombre = "Ruben";
        this.sueldo = 2000;
        numEmpleados++;
    }

    //Getter
    public static int getNumEmpleados(){
        return numEmpleados;
    }
    //Setter

    public void setDni(String dni) {
        this.dni = dni;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setSueldo(double sueldo){
        this.sueldo=sueldo;
    }

    //Metodos
    public void informacionEmpleados(){
        System.out.println("Empleado: " + nombre
        + ", dni: " + dni
        + ", sueldo: " + sueldo);
    }
}
