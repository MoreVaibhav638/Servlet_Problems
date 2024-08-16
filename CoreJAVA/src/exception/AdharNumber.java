

/*Write a program to create user-defined un-checked exception which will accept an aadhar Number 
 * from the user String, if the aadhar Number length is less than 12 then
 *  throw the user-defined exception that is InvalidAadharException with proper message
 */

package exception;

import java.util.Scanner;

class InvalidAadharException extends RuntimeException {
    public InvalidAadharException(String message) {
        super(message);
    }
}

public class AdharNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Aadhar Number: ");
        String aadharNumber = scanner.nextLine();
        scanner.close();

        try {
            if (aadharNumber.length() < 12) {
                throw new InvalidAadharException("Invalid Aadhar number: length should be 12 digits");
            }
            System.out.println("Valid Aadhar number: " + aadharNumber);
        } catch (InvalidAadharException e) {
            System.out.println(e.getMessage());
        }
    }
}
