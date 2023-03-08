package Exceptions;

// 14. Write a program to generate NoSuchMethodException.

import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Exception14 {
    public static void main(String[] args) {
        Exception14 exception14 = new Exception14();
        Class class1 = exception14.getClass();
        try{
            Method method = class1.getMethod("print");
        }
        catch (NoSuchMethodException e){
            System.out.println(e.toString());
        }
    }
}
