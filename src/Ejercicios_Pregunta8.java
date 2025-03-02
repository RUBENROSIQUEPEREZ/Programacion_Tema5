import java.util.Scanner;

public class Ejercicios_Pregunta8 {
    public static void main (String []args){
        Scanner teclado = new Scanner(System.in);
        Fecha f = new Fecha(teclado.nextInt(), teclado.nextInt(), teclado.nextInt());

        if (f.fechaCorrecta()) {
            f.diaSiguiente();
            System.out.println(f);
        } else {
            System.out.println("Fecha incorrecta");
        }
    }
    }
class Fecha {

    private int dia;
    private int mes;
    private int anyo;

    Fecha (int dia, int mes, int anyo){
        this.dia = dia;
        this.mes = mes;
        this.anyo = anyo;
    }

    public boolean fechaCorrecta (){

        if (mes < 1 || mes > 12 || dia < 1) {return false;}

        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        return dia <= diasPorMes[mes];
    }

    public void diaSiguiente (){
        int[] diasPorMes = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        dia++;
        if (dia > diasPorMes[mes]) {
            dia = 1;
            mes++;
            if (mes > 12) {
                mes = 1;
                anyo++;
            }
        }
    }

    @Override
    public String toString() {
        return dia + " de " + mes + " de " + anyo;
    }
}