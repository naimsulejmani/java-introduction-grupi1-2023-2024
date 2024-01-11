package methods;

public class Matematika {
    public static void main(String[] args) {
        System.out.println(mbledhja(100, 200));
        System.out.println(zbritja(300, 100));
    }

    static int mbledhja(int nr1, int nr2) {
        return nr1 + nr2;
    }

    static int zbritja(int nr1, int nr2) {
        return nr1 - nr2;
    }
}
