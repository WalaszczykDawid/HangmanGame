package pl.pg.pibz;

import java.util.List;

public class Hangman {

    public static List<String> dictionary = Dictionary.loadDictionary();
    public static String word = dictionary.get((int)(Math.random() * dictionary.size()));
    public static String bars = new String(new char[word.length()]).replace("\0","*");
    public static int count = 0;

    public void hang (String guess){
        String newbars = "";
    }

    private void hangmanImage(){
        if (count == 1){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("__ _ _ _");
        }
        if (count == 2){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_ _ _ _");
        }
        if (count == 3){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |------");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_ _ _ _");
        }
        if (count == 4){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |-----|-");
            System.out.println(" |     |");
            System.out.println(" |");
            System.out.println(" |");
            System.out.println("_|_ _ _ _");
        }
        if (count == 5){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |-----|-");
            System.out.println(" |     |");
            System.out.println(" |    \\/");
            System.out.println(" |");
            System.out.println("_|_ _ _ _");
        }
        if (count == 6){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |-----|-");
            System.out.println(" |     |");
            System.out.println(" |   \\o/");
            System.out.println(" |");
            System.out.println("_|_ _ _ _");
        }
        if (count == 7){
            System.err.println("Incorrect. Wrong letter!");
            System.out.println(" |-----|-");
            System.out.println(" |     |");
            System.out.println(" |   \\o/");
            System.out.println(" |     /\\");
            System.out.println("_|_ _ _ _");
        }

    }


}
