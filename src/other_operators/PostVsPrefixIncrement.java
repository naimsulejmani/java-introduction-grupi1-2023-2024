package other_operators;

public class PostVsPrefixIncrement {
    public static void main(String[] args) {
        int c = 5;
        // System.out.println(c++);
        System.out.println(c);
        c = c + 1;



        // System.out.println(++c);
        c = c + 1;
        System.out.println(c);

    }
}
