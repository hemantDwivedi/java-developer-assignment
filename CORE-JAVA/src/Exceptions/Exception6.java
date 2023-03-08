package Exceptions;

// 6. Write a program to create your own exception.

class CustomException extends Exception{
    String msg;

    CustomException(String string){
        msg = string;
    }

    public String toString(){
        return ("Exception: " + msg);
    }
}

public class Exception6 {
    public static void main(String[] args) {
        try{
            throw new CustomException("An error occurred.");
        }
        catch (CustomException e){
            System.out.println(e);
        }
    }
}
