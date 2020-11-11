import java.util.Scanner;

/**
 * Lab02a 
 * Instructions for Lab02a are in INSTRUCTIONS.md file located in the root directory of lab02a
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab02
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * 
 * @author Mohammed Sohail
 * @version 11/11/2020
 */ 

public class Welcome {

    public static void main(String[] args) throws Exception {

        /*
        ---
        WARM-UP EXERCISE 1
        ---
        */

        // program code
        System.out.println("Hello Mohammed, welcome to Java!");

        /*
        ---
        WARM-UP EXERCISE 2
        ---
        */

        // program code

        // Print out strings
        System.out.println("Hello");
        System.out.println("yourname");
        System.out.println("welcome to Java!");

        /*
        ---
        WARM-UP EXERCISE 3
        ---
        */

        // constants
        final String YOURNAME;

        YOURNAME = "Mohammed";

        // program code

        // Print out strings with constant YOURNAME
        System.out.println("Hello");
        System.out.println(YOURNAME);
        System.out.println("welcome to Java!");

        /*
        ---
        WARM-UP EXERCISE 4
        ---
        */

        // variables
        String yourname;

        // Constant name
        yourname = "Mohammed";

        // program code

        // Print out var yourname
        System.out.println("Hello");
        System.out.println(yourname);
        System.out.println("welcome to Java!");

        /*
        ---
        WARM-UP EXERCISE 5
        ---
        */

        Scanner scan = new Scanner(System.in);

        // variables

        // User's name
        String username;

        // program code

        // Ask for username
        System.out.println("Please enter your name:");
        username = scan.nextLine();

        // Print out username
        System.out.println("Hello");        
        System.out.println(username);
        System.out.println("welcome to Java!");

        /*
        ---
        WARM-UP EXERCISE 6
        ---
        */

        // variables

        // Age of user
        int age;

        // program code

        // Ask for username
        System.out.println("Please enter your name:");
        username = scan.nextLine();

        // Ask for age
        System.out.println("Please enter your age:");
        age = scan.nextInt();

        // Print out var username and var age
        System.out.println("Hello");
        System.out.println(username);
        System.out.println(age);
        System.out.println("welcome to Java!");

        // Close scanner
        scan.close();
    }
}
