package ExceptionHandling;

public class InvalideAgeExceptaion extends Exception {

    InvalideAgeExceptaion(){
        System.out.println("Default constructor");
    }

    InvalideAgeExceptaion(String msg){
        System.out.println("InvalidAgeException occurred:due to age criteria "+msg);
    }
    InvalideAgeExceptaion(Throwable cause){
        System.out.println("InvalidAgeException occurred:due to cause::"+cause);
    }
    InvalideAgeExceptaion(String msg, Throwable cause){
        System.out.println("InvalidAgeException occurred::"+msg+" "+cause);
    }
}
