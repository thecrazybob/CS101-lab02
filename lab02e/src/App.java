import java.util.Scanner;

/**
 * Lab02e 
 * @author Mohammed Sohail
 * @version 01/11/2020
 */ 

public class App {
    public static void main(String[] args) throws Exception {

        // Variables
        String name = "";
        int age = 0;
        int salary = 0;
        String comments = "";

        // Prompt for Values - COMMENT THESE OUT FOR HTML OUTPUT
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type the name of the employee: ");
        name = scan.nextLine();
        System.out.println("Please type the age of the employee: ");
        age = scan.nextInt();
        System.out.println("Please type the salary of the employee: ");
        salary = scan.nextInt();
        System.out.println("Please type comments about the employee: ");
        comments = scan.next();
        
        scan.close();

        String newLine = System.getProperty("line.separator");

        // Print out HTML result
        System.out.println("<!DOCTYPE html>"
        +"<html>"
        + newLine
        +"<head>"
        + newLine
        +"<title>" + name + "'s Home Page</title>"
        + newLine
        +"</head>"
        + newLine
        +"<body>"
        + newLine
        +"<hr>"
        + newLine
        +"<h1>" + name + "</h1>"
        + newLine
        +"<p>Age: " + age + "</p>"
        + newLine
        +"<p>Salary: " + salary + "</p>"
        + newLine
        +"<p>Comments: " + comments + "</p>"
        + newLine
        +"<hr>"
        + newLine
        +"</body>"
        + newLine
        +"</html>"
        + newLine
        );

    }
}
