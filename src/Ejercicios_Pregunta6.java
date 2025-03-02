import java.util.Scanner;

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
