import java.util.Scanner;
/*
Realiza una clase Temperatura que convierta grados Celsius a Farenheit y viceversa. Para ello crea dos métodos estáticos:

public static double celsiusToFarenheit(double )
public static double farenheitToCelsius(double)


En la construcción ten en cuenta las siguientes fórmulas:

C = (F - 32)/1,8
F = (1,8) C + 32


El valor 32 se guardará en un atributo estático llamada diferencia.

El valor 1.8 se guardará en un atributo estático llamada division.
 */
public class Tareas_Pregunta3 {
    public static void main (String []args){
        Scanner teclado = new Scanner (System.in);

        Temperatura temperatura = new Temperatura(teclado.next().charAt(0), teclado.nextDouble());

        System.out.println(temperatura.toString());

    }
}

class Temperatura {
    private char unidadTemperatura;
    private double temperatura;

    public Temperatura(char unidadTemperatura, double temperatura){
        this.unidadTemperatura = unidadTemperatura;
        this.temperatura = temperatura;
    }

    public static double celsiusToFarenheit(double  temperatura){
        return (temperatura * 1.8) + 32;
    }

    public static double farenheitToCelsius(double  temperatura){
        return (temperatura - 32) / 1.8;
    }
// 6 grados centigrados a farenheit
// 6 * 1.8 + 32 = 42.8

// 42.8 grados farenheit a centigrados
// (42.8 - 32) / 1.8 = 6
    @Override
    public String toString() {
         if(unidadTemperatura == 'C' || unidadTemperatura == 'c'){
             return String.format("%.1f", Temperatura.celsiusToFarenheit(temperatura));

         }else {
            return String.format("%.1f", Temperatura.farenheitToCelsius(temperatura));
         }

    }
}