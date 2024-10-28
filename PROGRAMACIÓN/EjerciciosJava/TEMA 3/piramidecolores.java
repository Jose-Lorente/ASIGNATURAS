public class piramidecolores {
    public static void main(String[] args) {
        
        String[] colores = {
            "\033[31m", // Rojo
            "\033[32m", // Verde
            "\033[33m", // Amarillo
            "\033[34m", // Azul
            "\033[35m", // Magenta
            "\033[36m", // Cian
            "\033[91m", // Rojo claro
            "\033[92m", // Verde claro
            "\033[93m", // Amarillo claro
            "\033[0m"   // Reset (para restablecer el color después de cada línea)
        };

        // Mostrar el título de la pirámide
        System.out.println("\033[1mPIRÁMIDE DE COLORES\033[0m");
        System.out.println("====================");

        // Dibujar la pirámide de colores
        int filas = 5;  // Altura de la pirámide (5 niveles)
        int colorIndex = 0;  // Índice para recorrer los colores

        for (int i = 1; i <= filas; i++) {
            // Espacios iniciales para centrar la pirámide
            for (int j = 1; j <= (filas - i); j++) {
                System.out.print(" ");
            }

            // Dibujar los asteriscos en negritas y color
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("\033[1m" + colores[colorIndex % colores.length] + "*" + "\033[0m");
                colorIndex++;
            }
            System.out.println();
        }
    }
}
