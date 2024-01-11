package methods;

public class TestMethod1 {
    public static void main(String[] args) {
        System.out.println("Para metodes");
        testMethod();
        System.out.println("Pas metodes");

        myMethod("Naimi");
        myMethod("Naimi", 37);
    }

    static void testMethod() {
        System.out.println("Une jam testMethod()");
    }

    static void myMethod(String fname) {
        System.out.printf("Une jam %s%n", fname);
    }

    static void myMethod(String fname, int age) {
        System.out.printf("Une jam %s  dhe i kam %d vjet!%n", fname, age);
    }
}
