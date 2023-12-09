package selection_decision.string_examples;

public class StringExample {
    public static void main(String[] args) {
        String text = "Kur pranvera vie ne Prishtine!";
        char shkronjaETrete = text.charAt(2);
        System.out.println(shkronjaETrete);

        int numriShkronjave = text.length();
        System.out.println(numriShkronjave);

        String emriPlote = String.format("%s %s", "Naim", "Sulejmani");
        System.out.println(emriPlote);

        System.out.println(text.substring(3));
        System.out.println(text.substring(3).length());


        System.out.println(text.substring(4, 20));

        String joinedString = String.join(";", "Naim", "Agon", "Filan");
        System.out.println(joinedString);

        boolean iBarabarte = "Naim".equals("Filani");
        boolean joIBarabarte = !"Naim".equals("Filan");
        System.out.println(iBarabarte);
        System.out.println(joIBarabarte);

        System.out.println("".isEmpty());
        System.out.println("   ".isEmpty());
        System.out.println("".isBlank());
        System.out.println("    ".isBlank());


        System.out.println("Naim".concat(" Sulejmani").concat(" professor"));


        System.out.println(text.replace('e', 'E'));
        System.out.println(text);
        System.out.println(text.replace("pranvera", "dimri"));
        System.out.println(text.replace("pranvera1", "dimri"));
        text = text.replace("Prishtine", "Prizren");
        System.out.println(text);


        String[] vargu = text.split(" ");
        System.out.println(vargu[0]);
        System.out.println(vargu[1]);

        System.out.println(text.indexOf('p'));

        System.out.println(text.indexOf('e', 20));

        System.out.println(text.indexOf("hello"));
        System.out.println(text.indexOf("vie"));

        System.out.println(text.toLowerCase());
        System.out.println(text.toUpperCase());

        System.out.println(" KU JENI      ".trim());
        System.out.println(" KU JENI      ".trim().length());

        System.out.println("A JENI LODH \n".repeat(3));

        System.out.println(text.startsWith("Kur"));
        System.out.println(text.endsWith("!"));
        System.out.println(text.contains("vie"));

    }
}
















