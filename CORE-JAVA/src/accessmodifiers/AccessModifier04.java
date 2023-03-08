package accessmodifiers;

/*4. Create a class with PUBLIC fields and methods.
Access the public methods and fields from any class in the same package or different
package.*/

public class AccessModifier04 {
    public int i = 10;
    public String string = "Hello";

    public void print(){
        System.out.println(i + string);
    }
}
