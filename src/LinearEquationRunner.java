import java.util.Scanner;

public class LinearEquationRunner {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Welcome!");
        System.out.println("Enter coordinate 1: ");
        String coordinate1 = Scan.nextLine();

        Scanner Scans = new Scanner(System.in);
        System.out.println("Enter coordinate 2: ");
        String coordinate2 = Scans.nextLine();
        System.out.println();
        System.out.println("The two points are: " + coordinate1 + " and " + coordinate2 );

        LinearEquation linearEquation = new LinearEquation();
        linearEquation.lineInfo();

        Scanner x = new Scanner(System.in);
        System.out.println("Enter a value for x: ");
        String value = Scan.nextLine();
        double xValue = Double.valueOf(value);

        System.out.println();
        System.out.println("The point on the line is: " + linearEquation.coordinateForX(xValue));




    }

}
