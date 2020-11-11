import java.util.Scanner;

/**
 * Lab02c 
 * Instructions for Lab02c are in INSTRUCTIONS.md file located in the root directory of lab02c
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab02
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/
 * 
 * @author Mohammed Sohail
 * @version 11/11/2020
 */ 
public class MathProblems {
    public static void main(String[] args) throws Exception {
        
        Scanner scan = new Scanner(System.in);

        // variables
        int value1, value2, sum, product, difference, quotient, remainder, max, min;        
        
        // program code

        // Prompt for Value 1
        System.out.println("Enter Value 1");
        value1 = scan.nextInt();

        // Prompt for Value 2
        System.out.println("Enter Value 2");
        value2 = scan.nextInt();

        // Close Scanner Instance
        scan.close();

        // Calculate Values
        sum = value1 + value2;
        difference = value1 - value2;
        product = value1 * value2;
        quotient = value1 / value2;
        remainder = value1 % value2;
        max =  Math.max(value1, value2);
        min = Math.min(value1, value2);

        // Print out calculated values
        System.out.println("The sum is " + sum);
        System.out.println("The difference is " + difference);
        System.out.println("The product is " + product);
        System.out.println("The quotient is " + quotient);
        System.out.println("The reminder is " + remainder);
        System.out.println("The Maximum is " + max);
        System.out.println("The Minimum is " + min);
    }
}
