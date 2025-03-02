import java.util.Scanner;
/*
Crea la clase Cliente con los atributos --> nombre , direccion, email, edad (String, String, String, int)

Crea el constructor por defecto, el constructor con todos sus parámetros y el constructor de copia
Crea los métodos públicos para actualizar los valores de los atributos y los métodos públicos para obtener sus valores (Setters and Getters)
 */
public class Tareas_Pregunta1 {
    public static void main(String[] args) {
        Cliente cliente1 = new Cliente ();
        Scanner teclado = new Scanner (System.in);

        cliente1.setNombre(teclado.nextLine());
        cliente1.setDireccion(teclado.nextLine());
        cliente1.setEmail(teclado.nextLine());
        cliente1.setEdad(teclado.nextInt());
        System.out.println("C1: Nombre "+cliente1.getNombre()+", dirección: "+cliente1.getDireccion()+", email: "+cliente1.getEmail()+", edad: "+cliente1.getEdad());

        //Constructor con parámetros
        Cliente cliente2 = new Cliente(cliente1.getNombre(), cliente1.getDireccion(), cliente1.getEmail(), cliente1.getEdad());
        System.out.println("C2: Nombre "+cliente2.getNombre()+", dirección: "+cliente2.getDireccion()+", email: "+cliente2.getEmail()+", edad: "+cliente2.getEdad());

        //Constructor de copia
        Cliente cliente3 = new Cliente(cliente2);
        System.out.println("C3: Nombre "+cliente3.getNombre()+", dirección: "+cliente3.getDireccion()+", email: "+cliente3.getEmail()+", edad: "+cliente3.getEdad());
    }
}
class Cliente {
    //Atributos que le damos a la clase
    private String nombre;
    private String direccion;
    private String email;
    private int edad;


    //Constructor con parametros por defecto
    Cliente (){
        this.nombre = "Ruben";
        this.direccion = "paraiso";
        this.email = "ruben@gmail.com";
        this.edad = 10;
    }

    //Constructor por defecto
    Cliente (String nombre, String direccion, String email, int edad){
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.edad = edad;
    }

    //Constructor de copia
    Cliente (Cliente c){
        this.nombre = c.nombre;
        this.direccion = c.direccion;
        this.email = c.email;
        this.edad = c.edad;
    }

    //Setters
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setDireccion(String direccion){
        this.direccion = direccion;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }

    //Getters
    public String getNombre(){
        return nombre;
    }
    public String getDireccion(){
        return direccion;
    }
    public String getEmail(){
        return email;
    }
    public int getEdad(){
        return edad;
    }
}