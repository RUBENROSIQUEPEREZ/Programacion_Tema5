import java.util.Scanner;
/*
Crea la clase Estudiante, con los siguientes atributos

nombre
dirección
edad
nre
En la clase principal solicita por teclado dicha información y muestra sus datos con método toString de Estudiante
 */
public class Ejericicios_Pregunta9 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);

        Estudiante estudiante = new Estudiante(scanner.nextLine(), scanner.nextLine(), scanner.nextInt(), scanner.nextInt());
        System.out.println(estudiante);

    }
}
class Estudiante {
    String nombre;
    String direccion;
    int edad;
    int nre;

    public Estudiante(){
        this.nombre = "Ruben Rosique";
        this.direccion = "Mulhacen";
        this.edad = 23;
        this.nre = 551938;
    }
    public Estudiante (String nombre, String direccion, int edad, int nre){
        this.nombre =nombre;
        this.direccion = direccion;
        this.edad = edad;
        this.nre = nre;
    }

    @Override
    public String toString() {
        return "Estudiante: Nombre: "+ nombre + ", direccion: " + direccion + ", edad: " + edad + ", nre: " + nre;
    }
}
