import java.util.Scanner;

public class VolumenToroide {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\033[1mVOLUMEN DE UN TOROIDE\033[0m");
        System.out.println("=====================");

        // Solicitamos el radio mayor al usuario
        System.out.print("Introduzca el radio mayor (cms): ");
        double radioMayor = scanner.nextDouble();

        // Solicitamos el radio menor al usuario
        System.out.print("Introduzca el radio menor (cms): ");
        double radioMenor = scanner.nextDouble();

        // Calcular el volumen del toroide usando la fórmula V = 2 * π^2 * R * r^2
        double volumen = 2 * Math.PI * Math.PI * radioMayor * Math.pow(radioMenor, 2);

        // Resultado
        System.out.printf("El volumen del toroide es de \033[1m\033[31m%.4f cm\u00B3\033[0m.%n", volumen);

        scanner.close();
    }
}
