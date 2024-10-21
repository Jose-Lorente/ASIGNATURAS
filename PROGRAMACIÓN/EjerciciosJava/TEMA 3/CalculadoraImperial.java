import java.util.Scanner;

public class CalculadoraImperial {
   public static void main(String[] args) {
    Scanner input = new Scanner (System.in);

    // Pedimos al usuario que introduzca la longitud en metros
    System.out.println("CALCULADORA DE MEDIDAS IMPERIALES");
    System.out.println("==================================");

    System.out.println("Introduce una longitud en metros: ");
    double metros = input.nextDouble(); //de esta forma guardamos la longitud en metros

    //Hacemos las distintas conversiones al sistema imperial
    double pulgadas = metros * 39.3701; // esto multiplica lo que equivale 1 metro en pulgadas
    double pies = metros * 3.28084; 
    double yardas = metros * 1.09361;

    //Muetra de los resultados al usuario
    System.out.println(metros + " metros son:");
    System.out.println("\033[48;5;11m" + String.format("%.3f", pulgadas) + " pulgadas" + "\033[0m");
    System.out.println("\033[48;5;10m" + String.format("%.3f", pies) + " pies" + "\033[0m");
    System.out.println("\033[48;5;9m" + String.format("%.3f", yardas) + " yardas" + "\033[0m");

input.close();

   }

}
