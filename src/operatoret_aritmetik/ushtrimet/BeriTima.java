package operatoret_aritmetik.ushtrimet;

public class BeriTima {
    public static void main(String[] args) {
        int eurot = 33;
        int centat = 16;
        int parate = eurot * 100 + centat;
        System.out.println("20-centshe = " + parate / 20);
        parate = parate % 20;
        System.out.println("10-centshe = " + parate / 10);
        parate = parate % 10;
        System.out.println("5-centshe = " + parate / 5);
        parate = parate % 5;
        System.out.println("1-centshe = " + parate);
    }
}
