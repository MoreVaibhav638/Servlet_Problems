package exception;

import java.util.Scanner;

class InvalidCharacterException extends Exception {
    public InvalidCharacterException(String message) {
        super(message);
    }
}

public class Vowel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 Scanner sc= new Scanner(System.in);
        System.out.println("Enter a vowel character: ");
        char character = sc.next().charAt(0);
        sc.close();

        try {
            if (!(character == 'a' || character == 'e' || character == 'i' || character == 'o' || character == 'u')) {
                throw new InvalidCharacterException("Invalid character: not a vowel");
            }
            System.out.println("Valid character: " + character);
        } catch (InvalidCharacterException e) {
            System.out.println(e.getMessage());
        }

	}

}
