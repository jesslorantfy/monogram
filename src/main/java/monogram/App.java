/*
 * Monogram.java
 * String Practice
 * Jess L
 * January 18th, 2018
 */
package monogram;
import java.util.Scanner;

/**
 *
 * @author jessica.lorantfy
 */
public class App {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName, lastName, middleName, firstNameInitial, middleNameInitial, lastNameInitial;
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter your first name");
        firstName = input.nextLine();
        
        System.out.println("Enter your middle name");
        middleName = input.nextLine();
        
        System.out.println("Enter your last name");
        lastName = input.nextLine();
        
        firstNameInitial = (firstName.substring(0,1));
        middleNameInitial = (middleName.substring(0,1));
        lastNameInitial = (lastName.substring(0,1));

        System.out.print(firstNameInitial.toLowerCase());
        System.out.print(lastNameInitial.toUpperCase());
        System.out.print(middleNameInitial.toLowerCase());
        System.out.println("");
    }
}