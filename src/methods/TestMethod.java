package methods;

public class TestMethod {
    public static int max(int x, int y) {
        return x > y ? x : y;
    }

    public static void main(String[] args) {
//        TestMethod test = new TestMethod();
//        int max = test.max(100, 200);
        int max = max(100, 200);
        System.out.println(max);
        System.out.println(max(4, 100));
        System.out.println(TestMethod.max(300, 300));
    }


}
