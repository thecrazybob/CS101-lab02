import java.util.Scanner;

/**
 * Lab02d 
 * Instructions for Lab02d are in INSTRUCTIONS.md file located in the root directory of lab02d
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab02
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/
 * 
 * @author Mohammed Sohail
 * @version 11/11/2020
 */ 

public class Flowers {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        // constants

        // Flowers that can be planted per square meter 
        final int FLOWER_PER_SQUARE_METER = 17;

        // variables
        
        // Length of triangle's sides
        double length_side_a, length_side_b, length_side_c;
        
        // Semi-perimeter of the triangle
        double semi_perimeter;
        
        // Heron's formula
        double garden_area;

        // Plants that can be planted          
        double number_of_flowers;
        
        // program code

        // Prompt for Values
        System.out.println("Enter Value 1");
        length_side_a = scan.nextDouble();

        System.out.println("Enter Value 2");
        length_side_b = scan.nextDouble();

        System.out.println("Enter Value 3");
        length_side_c = scan.nextDouble();

        // Close Scanner Instance
        scan.close();

        // Calculate semiperimeter
        semi_perimeter = (length_side_a+length_side_b+length_side_c)/2;

        // Print out calculated values
        System.out.println("Value 1: " + length_side_a);
        System.out.println("Value 2: " + length_side_b);
        System.out.println("Value 3: " + length_side_c);
        System.out.println("semi_perimeter: " + semi_perimeter);

        // Calculate Garden Area using Heron's formula
        garden_area= Math.sqrt((semi_perimeter * (semi_perimeter-length_side_a) * (semi_perimeter-length_side_b) * (semi_perimeter-length_side_c)));

        // Print out individual variables used in Heron's formula
        System.out.println("semi_perimeter - length_side_a: " + (semi_perimeter-length_side_a));
        System.out.println("semi_perimeter - length_side_b: " + (semi_perimeter-length_side_b));
        System.out.println("semi_perimeter - length_side_c: " + (semi_perimeter-length_side_c));
        System.out.println("garden_area: " + garden_area);
        
        // Calculate number of flowers
        number_of_flowers = Math.floor(garden_area * FLOWER_PER_SQUARE_METER);

        // Print out Garden Area and Number of Flowers
        System.out.println("Area: " + garden_area);
        System.out.println("Numbers of flowers that can be planted: " + number_of_flowers);
    }
}
