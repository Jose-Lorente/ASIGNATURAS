import java.util.Scanner;

public class CalculadoraTiempo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //título del ejercicio en negrita
        System.out.println("\033[1mCALCULADORA DE TIEMPO\033[0m");
        System.out.println("========================");

        // solicitamos la cantidad de segundos al usuario
        System.out.print("Introduce una cantidad de segundos: ");
        int segundosTotales = scanner.nextInt();

        // Calcular horas, minutos y segundos
        int horas = segundosTotales / 3600;
        int minutos = (segundosTotales % 3600) / 60;
        int segundos = segundosTotales % 60;

        
        String formatoHoras = "\033[43m" + horas + " horas\033[0m";
        String formatoMinutos = "\033[41m" + minutos + " minutos\033[0m";
        String formatoSegundos = "\033[42m" + segundos + " segundos\033[0m";

        
        System.out.println(segundosTotales + " segundos son " + formatoHoras + ", " + formatoMinutos + " y " + formatoSegundos + ".");

        // Cerrar el Scanner
        scanner.close();
    }
}
