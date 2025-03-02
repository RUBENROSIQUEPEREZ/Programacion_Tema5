import java.util.Scanner;

public class Tareas_Pregunta8 {
    public static void main (String []args){
        Scanner scanner = new Scanner(System.in);

        // Validar entrada de numero1
        if (!scanner.hasNextDouble()) {
            System.out.print("Dato introducido erróneo\nResultado 0,00");
            return;
        }
        double numero1 = scanner.nextDouble();

        // Validar entrada de numero2
        if (!scanner.hasNextDouble()) {
            System.out.print("Dato introducido erróneo\nResultado 0,00");
            return;
        }
        double numero2 = scanner.nextDouble();

        // Leer el operador
        String operacion = scanner.next();
        if (operacion.length() != 1) {
            System.out.println("Dato introducido erróneo");
            System.out.println("Resultado 0,00");
            return;
        }
        char operador = operacion.charAt(0);
        Calculadora calculadora = new Calculadora(numero1, numero2, operador);

        calculadora.ResultadoFinal();

    }
}
class Calculadora {
    double operador1;
    double operador2;
    char signo;


    public Calculadora (double operador1, double operador2, char signo){
        this.operador1 = operador1;
        this.operador2 = operador2;
        this.signo = signo;
    }

    public double division (){
        return operador1 / operador2;
    }
    public double sumar (){
        return operador1 + operador2;
    }
    public double restar (){
        return operador1 - operador2;
    }
    public double multiplicar (){
        return operador1 * operador2;
    }

    public void ResultadoFinal (){
        switch (signo){
            case '+': System.out.printf("Resultado %.2f", sumar()); break;
            case '-': System.out.printf("Resultado %.2f",  restar()); break;
            case 'x': System.out.printf("Resultado %.2f", multiplicar()); break;
            case ':': System.out.printf("Resultado %.2f", division()); break;
            default: System.out.println("\"Dato introducido erróneo \\n Resultado: 0,00\"");

        }
    }

}
