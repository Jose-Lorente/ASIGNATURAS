import java.util.Scanner; 

public class SegundosDias { 

    public static void main(String[] args) { 
        
        Scanner input = new Scanner(System.in);

        // Mostramos el título y decoramos con líneas
        System.out.println("SEGUNDOS QUE TIENE UN DÍA");
        System.out.println("=========================");

        // Pedimos al usuario que introduzca un número de días
        System.out.print("Introduzca un número de días: ");
        long dias = input.nextLong(); // Guardamos el número de días como un número grande (long)

        // Calculamos los segundos totales (1 día = 86400 segundos)
        long segundos = dias * 86400;

        // Mostramos el resultado
        System.out.println(dias + " días equivalen a " + segundos + " segundos.");

        
        input.close();
    }
}
