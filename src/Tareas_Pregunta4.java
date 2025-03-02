import java.util.Scanner;
/*
La tarea a realizar consiste en añadir a la clase Coche, el método toString().

Usa la siguiente clase para probar tu solución:
 */
public class Tareas_Pregunta4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        CocheV2 c = new CocheV2();
        char opcion;
        int velocidad;
        int num, cont=0;

        num = teclado.nextInt();

        while (cont < num)
        {
            opcion = teclado.next().toUpperCase().charAt(0);
            velocidad = teclado.nextInt();

            if (opcion == 'A')
                c.acelera(velocidad);
            else if (opcion == 'F')
                c.frena(velocidad);

            cont++;
        }
        System.out.println(c.toString());
    }
}
class CocheV2{

    private int velocidad;

    CocheV2() {
        velocidad = 0;
    }

    public void acelera(int velocidad) {
        this.velocidad += velocidad;
    }

    public void frena (int velocidad){
        this.velocidad -= velocidad;
    }

    /*GETTER*/
    public int getVelocidad() {
        return velocidad;
    }

    @Override
    public String toString() {
        return "Coche{" +
                "velocidad=" + velocidad +
                '}';
    }
}