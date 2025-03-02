import java.util.Scanner;
/*
Tenemos la siguiente clase Coche:

class Coche{
    private int velocidad;
    Coche() {velocidad = 0;}
}

Añade a la clase Coche los siguientes métodos:

int getVelocidad(). Devuelve la velocidad actual.
void acelera (int mas). Actualiza la velocidad a mas km más.
void frena (int menos). Actualiza la velocidad a menos km menos.


Creamos una clase principal, donde solicitamos si desea acelerar o frenar (A o F) y cuantos km más.
Cada caso de prueba empezará indicando un número, que indica el número de frenadas y aceleraciones totales.
A continuación aparecerá una 'A' o una 'F', y en la línea siguiente el número de kms/h que se acelera o frena.
 */
public class Tareas_Pregunta2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner (System.in);
        Coche coche = new Coche();
        char opcion;
        int velocidad;
        int num, cont=0;

        num = teclado.nextInt();

        while (cont < num)
        {

            opcion = teclado.next().toUpperCase().charAt(0);
            velocidad = teclado.nextInt();

            if (opcion == 'A')
                coche.acelera(velocidad);
            else if (opcion == 'F')
                coche.frena(velocidad);

            cont++;
        }

        System.out.println("La velocidad actual es: "+ coche.getVelocidad()+" KM/H");
    }
}
class Coche{

    private int velocidad;

    Coche() {
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


}
