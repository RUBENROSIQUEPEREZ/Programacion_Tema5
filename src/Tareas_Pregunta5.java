import java.util.Scanner;
/*
La tarea a realizar, consiste en añadir el método equals a la clase Cliente.

Usa la siguiente clase para probar tu solución:
 */
public class Tareas_Pregunta5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);

        Cliente cliente1 = new Cliente ();
        cliente1.setNombre(teclado.nextLine());
        cliente1.setDireccion(teclado.nextLine());
        cliente1.setEmail(teclado.nextLine());
        cliente1.setEdad(teclado.nextInt());
        teclado.nextLine();

        Cliente cliente2 = new Cliente();
        cliente2.setNombre(teclado.nextLine());
        cliente2.setDireccion(teclado.nextLine());
        cliente2.setEmail(teclado.nextLine());
        cliente2.setEdad(teclado.nextInt());

        System.out.println(cliente1);
        System.out.println(cliente2);
        if ((cliente1.equals(cliente2)))
        {
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }
}