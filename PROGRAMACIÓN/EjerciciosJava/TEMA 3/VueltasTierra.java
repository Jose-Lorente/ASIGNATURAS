import java.util.Scanner;

public class VueltasTierra {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("\033[1mVUELTAS DE LA TIERRA\033[0m");
        System.out.println("====================");

        // Solicitar el número de años al usuario
        System.out.print("Introduzca un número de años: ");
        int anos = scanner.nextInt();

        // Calcular las vueltas que da la Tierra
        int vueltasPorAno = 365;
        int vueltasTotales = anos * vueltasPorAno;

        // Resultado
        System.out.println("La tierra habrá dado un total de " + vueltasTotales + " vueltas en " + anos + " años.");

       
        scanner.close();
    }
}
