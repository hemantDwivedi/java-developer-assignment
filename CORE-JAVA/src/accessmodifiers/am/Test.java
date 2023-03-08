package accessmodifiers.am;

import accessmodifiers.AccessModifier03;

public class Test {
    public static void main(String[] args) {
        AccessModifier03 am3 = new AccessModifier03();

        // am3.printId();
        // printId() has protected access in AccessModifier03.
    }
}

class child extends Test{
    AccessModifier03 am = new AccessModifier03();
    // am.printId();
    // Error: cannot find printId()
}
