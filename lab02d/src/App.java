import java.util.Scanner;

/**
 * Lab02d 
 * @author Mohammed Sohail
 * @version 11/11/2020
 */ 

public class App {
    public static void main(String[] args) throws Exception {
        
        double  a, b, c;            // Coordinates
        double semiPerimeter;       // Semi-perimeter of the triangle
        double gardenArea;          // Heron's formula
        int numOfFlowers;           // Plants that can be planted
        int flowerPerSqrMtr = 17;   // Flowers that can be planted per square meter 
        
        // Initialize scanner instance
        Scanner scan = new Scanner( System.in);

        // Prompt for Values
        System.out.println("Enter Value 1");
        a = scan.nextDouble();
        System.out.println("Enter Value 2");
        b = scan.nextDouble();
        System.out.println("Enter Value 3");
        c = scan.nextDouble();

        // Close Scanner Instance
        scan.close();

        // Calculate semiperimeter
        semiPerimeter = (a+b+c)/2;

        // Print out calculated values
        System.out.println("Value 1: " + a);
        System.out.println("Value 2: " + b);
        System.out.println("Value 3: " + c);
        System.out.println("semiPerimeter: " + semiPerimeter);

        // Calculate Garden Area
        gardenArea= (int) Math.sqrt(
            (semiPerimeter * (semiPerimeter-a) * (semiPerimeter-b) * (semiPerimeter-c))
            );

        System.out.println("semiPerimeter-a: " + (semiPerimeter-a));
        System.out.println("semiPerimeter-b: " + (semiPerimeter-b));
        System.out.println("semiPerimeter-c: " + (semiPerimeter-c));
        System.out.println("gardenArea: " + gardenArea);
        
        numOfFlowers = (int) gardenArea * flowerPerSqrMtr;

        // Print out Garden Area and Number of Flowers
        System.out.println("Area: " + gardenArea);
        System.out.println("Numbers of flowers that can be planted: " + numOfFlowers);
    }
}
