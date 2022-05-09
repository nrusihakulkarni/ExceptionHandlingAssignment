package ExceptionHandling;

public class InvalidCitizenshipException extends RuntimeException{
    InvalidCitizenshipException(){
        System.out.println("Default constructor");
    }
    InvalidCitizenshipException(String msg){
        System.out.println("InvalidCitizenshipException occurred:You are not Indian::"+msg);
    }
    InvalidCitizenshipException(Throwable cause){
        System.out.println("InvalidCitizenshipException occurred:due to cause::"+cause);
    }
    InvalidCitizenshipException(String msg,Throwable cause){
        System.out.println("InvalidCitizenshipException occurred::"+msg+" "+cause);
    }
}
