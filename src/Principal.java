
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
       
       //Programa que sirva para saludar con el nombre que ingresemos por consola.
       String nombre;
       Scanner lector=new Scanner(System.in);
       System.out.print("Hola! ¿cuál es tu nombre? ");
       nombre=lector.next();
       System.out.print("\nHola "+nombre+"!");
    }
    
}
