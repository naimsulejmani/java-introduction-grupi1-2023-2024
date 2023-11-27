package selection_decision;

import java.util.Scanner;

public class IfElse1 {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println(
                "Shkruaj gjinine (f/F per gjinine femrore, tjerat per mashkullore:");
        //lexo rreshtin dhe kthe ne shkronja te vogla dhe merre shkronjen e pare
        char gender = reader.nextLine().toLowerCase().charAt(0);

        if (gender == 'f') {
            System.out.println("Keni drejte me shku workshop dy ditor ne Peje");
        }
        else {
            System.out.println("Ndjeki ushtrimet/ligjeratat me profen!");
        }
        System.out.println(
                "Percjellna ne tiktok/linkedin/instagram per me te rejat rreth workshopit");
    }
}














