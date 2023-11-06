package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class SyprinaERrethit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.print("Sheno rrezen e rrethit: ");
        double radius = reader.nextDouble();

        //double area = Math.PI * (radius * radius);
        double area = Math.PI * Math.pow(radius, 2);
        System.out.printf("Syprina e rrethit me rreze %.2f eshte : %.2f %n", radius, area);


    }
}
