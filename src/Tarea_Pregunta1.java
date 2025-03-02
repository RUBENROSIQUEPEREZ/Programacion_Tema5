import java.util.Scanner;

public class Tarea_Pregunta1 {


    public static void main(String[] args) {

        //Constructor por defecto
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
class Cliente{
    String nombre;
    String direccion;
    String email;
    int edad;

    public Cliente(){
        this.nombre = "";
        this.direccion = "";
        this.email = "";
        this.edad = 0;
    }

    public Cliente (String nombre, String direccion, String email, int edad ){
        this.nombre = nombre;
        this.direccion = direccion;
        this.email = email;
        this.edad = edad;
    }
    public Cliente (Cliente copia){
        this.nombre = copia.nombre;
        this.direccion = copia.direccion;
        this.email = copia.email;
        this.edad = copia.edad;
    }

    /*GETTERS*/
    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    /*SETTERS*/

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}