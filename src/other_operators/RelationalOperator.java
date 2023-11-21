package other_operators;

public class RelationalOperator {
    public static void main(String[] args) {
        int notaAgonit = 9;
        int notaOltit = 10;
        boolean oltiKaNoteMeTeMadheSeAgoni = notaOltit > notaAgonit;
        System.out.println(oltiKaNoteMeTeMadheSeAgoni);

        int realMadrid = 14;
        final int BARCELONA = 5;
        System.out.println(realMadrid > BARCELONA);


        System.out.println(
                !((notaOltit != notaAgonit) & (notaAgonit++ == notaAgonit))
        );

        System.out.println();

    }
}



















