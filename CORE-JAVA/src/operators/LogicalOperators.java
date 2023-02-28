package operators;

// 5. Programs on Logical AND,OR operator and Logical NOT

public class LogicalOperators {
    public static void main(String[] args) {

        // Logical OR Operator.
        if(5 == 5 || 2 == 4) System.out.println("Logical OR operator statement executing...");

        // Logical AND Operator.
        if(5 == 5 && 2 == 4) System.out.println("AND Operator statement executed.");
        else System.out.println("AND Operator condition not satisfied this is why I'm executing...");

        // Logical NOT operator.
        if(!false) System.out.println("NOT operator statement executing...");
    }
}
