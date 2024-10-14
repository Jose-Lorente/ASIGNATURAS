import java.util.Scanner;

public class Calculadora2 {

public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Introduzca el primer número: ");
    double x = input.nextDouble();

    System.out.print("Introduzca el segundo número: ");
    double y = input.nextDouble();

// Mostramos los valores de x e y
System.out.println("x = " + x);
System.out.println("y = " + y);

// Suma de x e y
double suma = x + y;
System.out.println("x + y = " + suma);

// Resta
double resta = x - y;
System.out.println("x - y = " + resta);

// División (teniendo en cuenta que no se puede dividir entre 0)
if (y !=0) {
double division = x / y;
System.out.println("x / y = " + division);
} else {
    System.out.println("ERROR. No se puede dividir por 0");
}

// Multiplicación
double multiplicacion = x * y;
System.out.println("x * y = " + multiplicacion);

input.close();

}

}
