import java.util.Scanner;
public class Tarea_Pregunta2 {
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
