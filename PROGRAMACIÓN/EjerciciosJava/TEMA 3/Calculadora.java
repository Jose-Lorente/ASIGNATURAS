import java.util.Scanner; // Importamos una herramienta para leer datos del teclado

public class Calculadora {
    public static void main(String[] args) {
        // Creamos un objeto "Scanner" para leer los números que introduce el usuario
        Scanner input = new Scanner(System.in);

        // Pedimos al usuario que introduzca el primer número
        System.out.print("Introduzca el primer número: ");
        double x = input.nextDouble(); // Guardamos el número como una variable llamada "x"

        // Pedimos al usuario que introduzca el segundo número
        System.out.print("Introduzca el segundo número: ");
        double y = input.nextDouble(); // Guardamos el segundo número como una variable llamada "y"

        // Realizamos las operaciones matemáticas:
        // 1. Mostramos los valores de x e y
        System.out.println("x = " + x);
        System.out.println("y = " + y);

        // 2. Suma de x e y
        double suma = x + y;
        System.out.println("x + y = " + suma);

        // 3. Resta de x menos y
        double resta = x - y;
        System.out.println("x - y = " + resta);

        // 4. División de x entre y
        if (y != 0) { // Nos aseguramos de que el segundo número no sea 0 (para evitar división por cero)
            double division = x / y;
            System.out.println("x / y = " + division);
        } else {
            System.out.println("No se puede dividir por 0");
        }

        // 5. Multiplicación de x por y
        double multiplicacion = x * y;
        System.out.println("x * y = " + multiplicacion);

        // Cerramos el Scanner
        input.close();
    }
}

