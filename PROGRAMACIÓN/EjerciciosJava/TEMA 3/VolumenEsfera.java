import java.util.Scanner; 

import java.text.DecimalFormat; // Importamos DecimalFormat para limitar los decimales

public class VolumenEsfera { // Definimos la clase principal llamada VolumenEsfera
    public static void main(String[] args) { 
       
        Scanner input = new Scanner(System.in);

        // Creamos un formato para que el resultado tenga 5 decimales
        DecimalFormat df = new DecimalFormat("#.#####");

        // Mostramos el título en negrita
        System.out.println("\033[1mVOLUMEN DE UNA ESFERA\033[0m");
        System.out.println("=======================");

        // Pedimos el radio de la esfera al usuario
        System.out.print("Introduzca el radio de la esfera (cm): ");
        double radio = input.nextDouble(); // Guardamos el radio introducido por el usuario

        // Calculamos el volumen de la esfera usando la fórmula
        double volumen = (4.0/3.0) * Math.PI * Math.pow(radio, 3);

        // Mostramos el resultado en color rojo y en negrita
        System.out.println("\033[1mEl volumen del toroide es de \033[31m" + df.format(volumen) + " cm\033[0;33m\u00B3\033[0m.");

       
        input.close();
    }
}
