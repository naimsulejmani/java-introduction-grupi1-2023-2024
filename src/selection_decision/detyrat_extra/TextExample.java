package selection_decision.detyrat_extra;

import java.util.Scanner;

public class TextExample {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Shkruaj nje tekst: ");
        String text = reader.nextLine();
        System.out.printf("Teksti permban %d karaktere.%n", text.length());

        System.out.printf("Shkruaj nje index nga 0 deri ne %d: ", text.length() - 1);
        int startIndex = reader.nextInt();

        System.out.println(text.substring(startIndex));

        System.out.printf("Shkruaj indeksin e mbarimit nga %d deri me %d: ",
                startIndex, text.length() - 1);

        int endIndex = reader.nextInt();

        System.out.println(text.substring(startIndex, endIndex));
        System.out.print("Shkruaj tekstin te cilin ti po e kerkon: ");
        reader.nextLine();
        String searchText = reader.nextLine();
        if (text.contains(searchText)) {
            System.out.printf(
                    "Fjala \"%s\" gjendet ne tekst dhe fillon ne indeksin %d %n",
                    searchText, text.indexOf(searchText)
            );
        } else {
            System.out.printf(
                    "Fjala \"%s\" nuk gjendet ne tekst  %n",
                    searchText);

        }

        System.out.print("Shkruaj fjalen qe deshironi te zavendsoni: ");
        searchText = reader.nextLine();
        if (text.contains(searchText)){
            System.out.print("Shkruani tekstin zevendesues: ");
            String replaceText = reader.nextLine();

            System.out.println("Paraqitni tekstin me ndryshime?");

            System.out.println(text.replace(searchText, replaceText));
        }


    }
}













