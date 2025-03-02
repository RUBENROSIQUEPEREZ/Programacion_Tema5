import java.util.Scanner;
/*
Crea una clase Contar (contador como atributo) con los métodos para incrementar y decrementar el contador de la clase Contar.
La clase contendrá un constructor por defecto, un constructor con parámetros, y los métodos getters y setters.

void incrementar(int incremento)--> incrementando en la cantidad indicada en "incremento" del atributo contador

void decrementar (int decremento)--> decrementando en la cantidad indicada en "decremento" del atributo contador

int suma (Contar cont1)--> devuelve la suma de nuestro contador + contador del objeto cont1

En la clase principal, crear dos objetos (c1,c2) de la clase Contar con costructor por defecto, y llamar a los métodos,
incrementar y decrementar para ambos objetos con los valores que introduzca por teclado el usuario. Para posteriormente invocar a suma y mostrar el valor de ambos objetos por pantalla.
 */
public class Ejercicios_Pregunta6 {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);

        int valor1 = entrada.nextInt();
        int valor2 = entrada.nextInt();
        Contar c1 = new Contar(valor1, valor2);

        int valor3 = entrada.nextInt();
        int valor4 = entrada.nextInt();
        Contar c2 = new Contar(valor3, valor4);

        c1.Resultado();
        c2.Resultado();
        System.out.println("suma:"+c1.getSuma(c2));
    }
}
class Contar{
    //Atributo
    private static int contador;
    private int valor1;
    private int valor2;

    //Constructor por defecto
    public Contar(int uno, int dos){
        this.valor1=uno;
        this.valor2=dos;
    }

    /*GETTER*/
    int getResta(){
        return valor1-valor2;
    }

    int getSuma(Contar otro){
        return this.getResta() + otro.getResta();
    }

    /*METODO*/
    public void Resultado(){
        contador++;
        System.out.println("c"+contador+": Contar{contador="+getResta()+"}");
    }
}
