package operatoret_aritmetik.ushtrimet;

import java.util.Scanner;

public class SyprinaEDrejtkendeshit {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Shkruaj gjatesine e drejtekendeshit: ");
        double length = reader.nextDouble();
        System.out.print("Shkruaj gjeresine e drejtekendeshit: ");
        double width = reader.nextDouble();
        double area = length * width;
        System.out.printf(
        "Syprina e drejtekendshit me gjatesi %.2f dhe gjeresi %.2f eshte %.2f %n",
           length, width, area);
    }
}


