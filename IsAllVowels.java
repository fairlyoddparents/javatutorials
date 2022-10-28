import java.util.*;

public class IsAllVowels{
    public static void main(String[] args){
        introduction();
        Scanner console = new Scanner(System.in);
        String s = getText(console);
        isAllVowels(s);
    }

    public static void introduction(){
        System.out.print("This program tells you if a string consist entirely ");
        System.out.println("of vowels (i.e., it contains no consonants). ");
    }

    public static String getText(Scanner console){
        System.out.print("Write your text: ");
        String s = console.nextLine();
        return s.toLowerCase();
    }

    public static boolean isAllVowels(String s){
        boolean result = true;
        for (int i = 0; i < s.length(); i++){
            if (s.charAt(i) != 'a' && s.charAt(i) != 'e' && s.charAt(i) != 'i' && s.charAt(i) != 'o' && s.charAt(i) != 'u'){
                result = false;
            }
        }
        System.out.printf("The text you entered contains no consonants: %b.%n", result);
        return result;
    }
}
