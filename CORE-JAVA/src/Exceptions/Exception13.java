package Exceptions;

// 13. Write a program to generate NoSuchFieldException.

import java.lang.reflect.Field;

public class Exception13 {
    public static void main(String[] args) {
        Exception13 exception13 = new Exception13();
        Class class1 = exception13.getClass();
        try{
            Field field = class1.getField("id");
        }
        catch (NoSuchFieldException e){
            System.out.println(e.toString());
        }
    }
}
