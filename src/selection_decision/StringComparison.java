package selection_decision;

public class StringComparison {
    public static void main(String[] args) {
        String emri1 = "Naim";
        String emri2 = "naim";
        String emri3 = "Naimi";
        String emri4 = "Z";
        String emri5 = "Z1";

        System.out.println(emri1.equals(emri1));
        System.out.println(emri1.equals(emri2));
        System.out.println(emri1.equalsIgnoreCase(emri2));
        System.out.println(emri1.equals(emri3));
        System.out.println(!emri2.equals(emri3));

        System.out.println(emri1.compareTo(emri2)); // N=78, n=110
        System.out.println(emri2.compareTo(emri1));
        System.out.println(emri1.compareToIgnoreCase(emri2));

        System.out.println("a".compareTo("b"));
        System.out.println("b".compareTo("a"));


        System.out.println("aa".compareTo("ac"));
        System.out.println("ac".compareTo("aa"));
        System.out.println("NAIM SULJEMNAASDA DSJAKDJ KSADJ KAFKJADJSAGDkjsagd".compareTo("Z"));

        if("a".compareTo("b")<0) {
            System.out.println("a eshte me vogel se b");
        } else {
            System.out.println("a nuk eshte me vogel se b");
        }
    }
}
















