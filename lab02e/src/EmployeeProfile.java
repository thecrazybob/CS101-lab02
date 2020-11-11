import java.util.Scanner;

/**
 * Lab02e 
 * Instructions for Lab02e are in INSTRUCTIONS.md file located in the root directory of lab02e
 * Revisions can be seen on the following GitHub URL: https://github.com/thecrazybob/CS101-lab02
 * Style Guidelines: http://www.cs.bilkent.edu.tr/~david/cs101/practicalwork/2010/styleguidelines.htm
 * Lab Page: http://www.cs.bilkent.edu.tr/~david/cs101/assignments/lab02/
 * 
 * @author Mohammed Sohail
 * @version 11/11/2020
 */ 

public class EmployeeProfile {
    public static void main(String[] args) throws Exception {

        Scanner scan = new Scanner(System.in);

        // constants
        final String NEWLINE = System.getProperty("line.separator");
        final String START_HTML = "<html>";
        final String CLOSE_HTML = "</html>";
        final String START_HEAD = "<head>";
        final String CLOSE_HEAD = "</head>";
        final String START_TITLE = "<title>";
        final String CLOSE_TITLE = "</title>";
        final String START_BODY = "<body>";
        final String CLOSE_BODY = "</body>";
        final String HR = "<hr>";
        final String START_H1 = "<h1>";
        final String CLOSE_H1 = "</h1>";
        final String START_P = "<p>";
        final String CLOSE_P = "</p>";

        // variables
        String name = "";
        int age = 0;
        int salary = 0;
        String comments = "";

        // Prompt for Values - COMMENT THESE OUT FOR HTML OUTPUT
        System.out.println("Please type the name of the employee: ");
        name = scan.nextLine();
        System.out.println("Please type the age of the employee: ");
        age = scan.nextInt();
        System.out.println("Please type the salary of the employee: ");
        salary = scan.nextInt();
        System.out.println("Please type comments about the employee: ");
        comments = scan.next();
        
        scan.close();

        // Print out HTML result
        System.out.println("<!DOCTYPE html>"
        + START_HTML
        + NEWLINE
        + START_HEAD
        + NEWLINE
        + START_TITLE + name + "'s Home Page" + CLOSE_TITLE
        + NEWLINE
        + CLOSE_HEAD
        + NEWLINE
        + START_BODY
        + NEWLINE
        + HR
        + NEWLINE
        + START_H1 + name + CLOSE_H1
        + NEWLINE
        + START_P + "Age: " + age + CLOSE_P
        + NEWLINE
        + START_P + "Salary: " + salary + CLOSE_P
        + NEWLINE
        + START_P + "Comments: " + comments + CLOSE_P
        + NEWLINE
        + HR
        + NEWLINE
        + CLOSE_BODY
        + NEWLINE
        + CLOSE_HTML
        + NEWLINE
        );

    }
}
