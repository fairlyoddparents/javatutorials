import java.util.*;

public class PigLatinConverter{
    public static void main(String[] args){
        introduction();
        Scanner console = new Scanner(System.in);
        String s = getText(console);
        String translated = convertToPigLatin(s.split("\\s+"));
    }

    public static void introduction(){
        System.out.print("This program translates lines of text into Pig Latin. ");
        System.out.print("Pig Latin is English with the initial consonant sound ");
        System.out.println("moved to the end of each word, followed by 'ay'.");
        System.out.printf("Type a blank line to exit. %n%n");
    }

    public static String getText(Scanner console){
        System.out.print("Write the text you want to translate to Pig Latin. ");
        String s = console.nextLine();
        return s;
    }

    public static String convertToPigLatin(String[] s){
        String translated = "";
        for (int i = 0; i < s.length; i++){
            String word = s[i];
            String consonants = "";
            int indexOfFirstVowel = findFirstVowel(word.toLowerCase());
            for (int j = 0; j < indexOfFirstVowel; j++){
                consonants += word.charAt(j);
            }
            String word2 = word.replaceFirst(consonants, "");
            translated += word2;
            translated += "-" + consonants;
            translated += "ay ";
        }
        System.out.println(translated);
        return translated;
    }

    public static int findFirstVowel(String s){
        String vowels = "aeiou";
        for (int i = 0; i < s.length(); i++){
            if (vowels.contains(String.valueOf(s.charAt(i)))){
                return i;
            }
        }
        return -1; //handle cases where a vowel is not found
    }
}
