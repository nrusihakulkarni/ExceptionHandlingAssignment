package ExceptionHandling;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Your country ");
        String country = scanner.next( );
        System.out.println("Enter Your age");
        int Age = scanner.nextInt();
        scanner.close();

        Register register = new Register();
        try {
            try {
                    register.Validate(country);
            } catch (InvalidCitizenshipException e) {
                e.printStackTrace();
            }
            register.Validate(Age);
        }
        catch (InvalideAgeExceptaion e) {
            e.printStackTrace();

        }


        /*catch (InvalidCitizenshipException e) {
            e.printStackTrace();
        } */

    }
}


