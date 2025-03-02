import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/*
Creamos la clase Paciente con los atributos Número Seguridad Social, nombre, edad, direccion

Crea su constructor por defecto, y constructor con todos sus parámetros
Crea sus metodos publicos para actualizar los valores de sus atributos, así como los métodos públicos para obtener sus valores
Crea un método que devuelva un boolean en función de si es válido o no el NSS
A partir de una clase principal crea un objeto Paciente(con constructor por defecto) y pide por teclado sus atributos para después mostrarlos por pantalla.
Si el NSS es válido asignaremos dicho valor al atributo del objeto paciente
Si el NSS no es válido, indicarlo
 */
public class Ejercicios_Pregunta3 {
    public static void main (String []args){
        Scanner entrada = new Scanner(System.in);

        String numSS = entrada.nextLine();
        String name = entrada.nextLine();
        String years = entrada.nextLine();
        String direccion = entrada.nextLine();

        Paciente paciente1 = new Paciente(numSS, name, years, direccion);
        paciente1.mostrarInformacion();
    }
}
class Paciente{
    //Atributos
    private String numeroSeguridadSocial;
    private String nombre;
    private String edad;
    private String direccion;

    //Constructor
    public Paciente (String numeroSeguridadSocial, String nombre, String edad, String direccion){
        this.numeroSeguridadSocial = numeroSeguridadSocial;
        this.nombre = nombre;
        this.edad = edad;
        this.direccion=direccion;
    }

    //Metodos
    public void mostrarInformacion (){
        if (!numSegSocValido(numeroSeguridadSocial)){
            System.out.println("NSS no valido");
            System.out.println("NSS: "+
                    ", nombre: "+nombre+
                    ", edad: " + edad +
                    " dirección: " + direccion);
        }else{
            System.out.println(
                    "NSS: "+numeroSeguridadSocial+
                            ", nombre: "+nombre+
                            ", edad: "+edad +
                            " dirección: " + direccion
            );
        }
    }

    private boolean numSegSocValido (String numeroSeguridadSocial){
        Pattern pattern = Pattern.compile("^[a-z]{4}[0-9]{12}$");
        Matcher matcher = pattern.matcher(numeroSeguridadSocial);
        return matcher.matches();
    }
}