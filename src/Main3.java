import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        double primoRettangolo = perimetroRettangolo(5.4, 2.5);
        System.out.println("primoRettangolo :" + primoRettangolo);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Inzerisci un numero: ");
        int numero = Integer.parseInt(scanner.nextLine());
        System.out.println("Se il numero è pari sarà 0 altrimenti 1: è " + pariDispari(numero));

        System.out.println("Fornisci i lati del Triangolo :");
        double latoA = Double.parseDouble(scanner.nextLine());
        double latoB = Double.parseDouble(scanner.nextLine());
        double latoC = Double.parseDouble(scanner.nextLine());
        System.out.println(perimetroTriangolo(latoA, latoB, latoC));
        scanner.close();
    }

    public static double perimetroRettangolo(double a, double b) {
        return (a + b) * 2;
    }

    public static int pariDispari(int a) {
        if (a % 2 == 0) {
            return 0;
        } else {
            return 1;
        }
    }

    public static double perimetroTriangolo(double a, double b, double c) {
        double perimeter =( a + b + c) / 2;
        return Math.sqrt(perimeter * (perimeter - a) * (perimeter - b) * (perimeter - c));
    }
}
