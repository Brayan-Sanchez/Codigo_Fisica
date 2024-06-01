import java.util.Scanner;

public class Convertidor {
    public static void main(String[] args) { 
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú de opciones:");
            System.out.println("1. Convertir de kilogramos a newtons");
            System.out.println("2. Calcular velocidad");
            System.out.println("3. Calcular el coseno de un ángulo en grados");
            System.out.println("4. Calcular el seno de un ángulo en grados");
            System.out.println("5. Calcular la tangente de un ángulo en grados");
            System.out.println("6. Calcular la presión");
            System.out.println("7. Calcular la energía potencial");
            System.out.println("8. Calcular la energía cinética con la masa");
            System.out.println("9. Calcular la energía cinética con la velocidad");
            System.out.println("10. Convertir de newtons a pascals");
            System.out.println("11. Salir");
            System.out.print("Ingrese una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el valor en kilogramos: ");
                    double kilogramos = scanner.nextDouble();
                    double newtons = kilogramos * 9.8;
                    System.out.println(kilogramos + " kilogramos equivale a " + newtons + " newtons");
                    break;
                case 2:
                    System.out.print("Ingrese la distancia en metros: ");
                    double distancia = scanner.nextDouble();
                    System.out.print("Ingrese el tiempo en segundos: ");
                    double tiempo = scanner.nextDouble();
                    double velocidad = distancia / tiempo;
                    System.out.println("La velocidad es " + velocidad + " m/s");
                    break;
                case 3:
                    System.out.print("Ingrese el ángulo en grados: ");
                    double angulo = scanner.nextDouble();
                    double coseno = Math.cos(Math.toRadians(angulo));
                    System.out.println("El coseno de " + angulo + " grados es " + coseno);
                    break;
                case 4:
                    System.out.print("Ingrese el ángulo en grados: ");
                    double angulo1 = scanner.nextDouble();
                    double seno = Math.sin(Math.toRadians(angulo1));
                    System.out.println("El seno de " + angulo1 + " grados es " + seno);
                    break;
                case 5:
                    System.out.print("Ingrese el ángulo en grados: ");
                    double angulo2 = scanner.nextDouble();
                    double tangente = Math.tan(Math.toRadians(angulo2));
                    System.out.println("La tangente de " + angulo2 + " grados es " + tangente);
                    break;
                case 6:
                    System.out.print("Ingrese la fuerza en newtons: ");
                    double fuerza = scanner.nextDouble();
                    System.out.print("Ingrese el área en metros cuadrados: ");
                    double area = scanner.nextDouble();
                    double presion = fuerza / area;
                    System.out.println("La presión es " + presion + " newtons/metros cuadrados");
                    break;
                case 7:
                    System.out.print("Ingrese la masa en kilogramos: ");
                    double masa = scanner.nextDouble();
                    System.out.print("Ingrese la altura en metros: ");
                    double altura = scanner.nextDouble();
                    double energiaPotencial = masa * 9.8 * altura;
                    System.out.println("La energía potencial es " + energiaPotencial + " joules");
                    break;
                case 8:
                    System.out.print("Ingrese la masa en kilogramos: ");
                    double masa1 = scanner.nextDouble();
                    double energiaCinetica = 0.5 * masa1 * Math.pow(9.8, 2);
                    System.out.println("La energía cinética es " + energiaCinetica + " joules");
                    break;
                case 9:
                    System.out.print("Ingrese la masa en kilogramos: ");
                    double masa2 = scanner.nextDouble();
                    System.out.print("Ingrese la velocidad en m/s: ");
                    double velocidad1 = scanner.nextDouble();
                    double energiaCinetica1 = 0.5 * masa2 * Math.pow(velocidad1, 2);
                    System.out.println("La energía cinética es " + energiaCinetica1 + " joules");
                    break;
                case 10:
                    System.out.print("Ingrese el valor en newtons: ");
                    double newtons2 = scanner.nextDouble();
                    double pascal = newtons2 / 1e-5;
                    System.out.println(newtons2 + " newtons equivale a " + pascal + " pascals");
                    break;
                case 11:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, ingrese una opción válida.");
                    break;

            }
        } while (opcion != 11);

        scanner.close();
    }
}