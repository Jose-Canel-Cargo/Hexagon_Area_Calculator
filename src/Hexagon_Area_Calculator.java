import java.util.Scanner;

public class Hexagon_Area_Calculator {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.print("Input the side of the hexagon: ");

        double side = input.nextDouble();

        double Area = (6 * (side * side)) / (4 * Math.tan(Math.PI / 6));
        
        input.close();
        System.out.printf("\nThe area of the hexagon is %.2f", Area);
        
    }
}
