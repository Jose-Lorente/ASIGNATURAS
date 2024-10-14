import java.util.Scanner;

public class AreaRectangulo {
    public static void main (String[] args) {
    Scanner input = new Scanner(System.in);

    // Titulo en la pantalla de lo que vamos a hacer
    System.out.println("Área de un restángulo");
    System.out.println("---------------------");

    // Base del rextángulo
    System.out.print("Introduzca la longitud de la base (cm): ");
    double base = input.nextDouble();

    // Altura del rectángulo
    System.out.print("Introduzca la altura (cm): ");
    double altura = input.nextDouble();

    // Cálculo del área
    double area = base * altura;

    // Mostramos el resultado
    System.out.println("El área del rectágulo es " + area + " cm²");

    input.close();

    }
}

