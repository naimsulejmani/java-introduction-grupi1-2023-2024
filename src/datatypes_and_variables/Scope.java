package datatypes_and_variables;


class Scope {
    public static void main(String[] args) {
        int x; // i njohur per te gjithe
        x = 10;
        if (x == 10) {
            int y = 20;// i njohur vetem brenda scope te if
            System.out.println("x and y:" + x + " " + y);
            x = y * 2;

        }
        int z = 200;
        //       y = 100;
        System.out.println("x is " + x);

    }

}
