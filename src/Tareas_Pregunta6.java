import java.util.Scanner;
/*
Crea la clase Numeros, que incluirá dos métodos estáticos llamados ambos sumar():

El primero de ellos, realiza la suma de dos números enteros (int)
El segundo de ellos, realiza la suma de dos números reales (double)

 */
public class Tareas_Pregunta6 {

    public static void main(String[] args)
    {
        Scanner teclado = new Scanner (System.in);
        double a, b;
        int c, d;
        char tipo;

        tipo = teclado.nextLine().charAt(0);

        if (tipo == 'D')
        {
            a = teclado.nextDouble();
            b = teclado.nextDouble();
            System.out.println(Numeros.sumar(a, b));
        }
        else
        {
            c = teclado.nextInt();
            d = teclado.nextInt();
            System.out.println(Numeros.sumar(c, d));
        }

    }
}
class Numeros
{
    public static double sumar(double a, double b)
    {
        return a + b;
    }
    public static int sumar(int a, int b)
    {
        return a + b;
    }
}