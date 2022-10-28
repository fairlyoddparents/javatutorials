import java.util.*;

public class Palindrome{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        String text = getText(console);
        String reverse = reverseString(text);
        boolean palindrome = isPalindrome(text, reverse);
        printResults(palindrome);
    }

    public static String getText(Scanner console){
        System.out.print("Write your text: ");
        String text = console.nextLine();
        return text.trim().toLowerCase();
    }

    public static String reverseString(String text){
        String reverse = "";
        for (int i=text.length()-1; i>=0; i--){
            reverse += text.charAt(i);
        }
        return reverse;
    }

    public static boolean isPalindrome(String text, String reverse){
        return text.contentEquals(reverse);
    }

    public static void printResults(boolean palindrome){
        if (palindrome){
            System.out.print("Your text is a palindrome.");
        } else {
            System.out.print("Sorry, your text is not a palindrome.");
        }
    }
}
