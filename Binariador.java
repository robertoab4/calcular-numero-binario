import java.util.Scanner;
import java.util.ArrayList;
/**
 * Recibe un numero decimal/base10 y lo convierte a binario/base2
 * 
 * @author (Roberto Alarcon Bardon) 
 * @version 0.1 (11/02/2021)
 */
public class Binariador
{
    // instance variables - replace the example below with your own
    private Scanner numeroAConvertir;
    private ArrayList<Integer> numeroBinario;

    /**
     * Crea un objeto que convierte un numero en base decimal introducido a 
     * un numero binario
     */
    public Binariador()
    {
        // initialise instance variables
        numeroAConvertir = new Scanner(System.in);
        numeroBinario = new ArrayList<>();
    }

    /**
     * Coge el numero que ha introducido el usuario para pasarlo a binario
     */
    private int numeroDecimal(){
        int numeroIntroducido = numeroAConvertir.nextInt();
        return numeroIntroducido;
    }
    
    /**
     * Convierte el numero en base decimal introducido por el usuario a
     * un numero binario
     */
    private void convertidorABinario(){
        int cociente = numeroDecimal();
        int contador = 0;
        while (cociente != 0){
            numeroBinario.add(numeroBinario.size()-contador, cociente%2);
            cociente = cociente/2;
            contador++;
        }
    }
    
    /**
     * Inicia el programa y devuelve por pantalla el Array del numero en binario.
     */
    public void calcular(){
        saludo();
        convertidorABinario();
        resultado();
    }
    
    /**
     * Imprime por pantalla un saludo y una pregunta al usuario del programa
     */
    private void saludo(){
        System.out.println("Hola calculador, ¿qué número desea convertir a binario?");
        System.out.println();
    }
    
    /**
     * Imprime el resultado del numero binario y limpia el array para poder hacer mas calculos
     */
    private void resultado(){
        System.out.println("El numero en binario es: " + numeroBinario);
        numeroBinario.clear();
    }
}