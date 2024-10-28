import java.util.Scanner;

public class TangoModas {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Titulo
        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("==============================");

        // Solicitamos datos al usuario
        System.out.print("Introduce código de artículo: ");
        String codigoArticulo = scanner.nextLine();

        System.out.print("Introduce precio: ");
        double precio = scanner.nextDouble();

        System.out.print("Introduce unidades vendidas: ");
        int unidades = scanner.nextInt();

        System.out.print("Introduce descuento (%): ");
        double descuentoPorcentaje = scanner.nextDouble();

        // Calcular el total sin descuento
        double subtotal = precio * unidades;

        // Calcular el descuento
        double descuento = subtotal * (descuentoPorcentaje / 100);

        // Calcular el subtotal con descuento
        double subtotalConDescuento = subtotal - descuento;

        // Calcular el IVA (16%)
        double iva = subtotalConDescuento * 0.16;

        // Calcular el total final
        double total = subtotalConDescuento + iva;

        // Mostrar el ticket
        System.out.println();
        System.out.println("Su ticket:\n");
        System.out.println("\033[1mTANGO MODAS\033[0m");
        System.out.println("==============================");

        // Codigo de artículo y precio
        System.out.printf("%-13s %10s€%n", codigoArticulo, precio);

        // Unidades vendidas y subtotal 
        System.out.printf("%-13s %10s€%n", unidades + " unidades",subtotal);

        // Descuento y descuento
        System.out.printf("%-13s %10s€%n", "-" + (int)descuentoPorcentaje + "%", "-" + descuento);

        // IVA y su monto alineados
        System.out.printf("%-13s %10s€%n", "16% IVA", "+" + iva);

        // Total en negrita con fondo gris
        System.out.printf("\033[1m%-13s \033[47m%10s€\033[0m%n", "TOTAL", total);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
