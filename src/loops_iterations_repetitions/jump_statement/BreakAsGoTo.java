package loops_iterations_repetitions.jump_statement;

public class BreakAsGoTo {
    public static void main(String[] args) {
        boolean t = true;
        first:
        {
            second:
            {
                third:
                {
                    System.out.println("Entering on Third Scope!");
                    if(t) break first;
                    System.out.println("Exiting Third Scope!");
                }
                System.out.println("Exiting Second Scope!");
            }
            System.out.println("Exiting First Scope!");
        }
        System.out.println("Exiting Main Scope");
    }
}














