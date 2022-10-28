import java.util.*;

public class CaesarCipher{
    public static void main(String[] args){
        Scanner console = new Scanner(System.in);
        introduction();
        String text = getMessage(console);
        int key = getEncodingKey(console);
        String enconded_text = encode(text.split(" "), key);
        printResults(enconded_text);
    }

    public static void introduction(){
        System.out.print("This program will encode the message of your choice ");
        System.out.println("by using a Caesar cipher.");
    }

    public static String getMessage(Scanner console){
        System.out.print("What's your message? ");
        String text = console.nextLine();
        return text;
    }

    public static int getEncodingKey(Scanner console){
        System.out.print("Encoding key? ");
        int key = console.nextInt();
        return key;
    }


    public static String encode(String[] text, int key){
        String[] alphabet = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X" , "Y", "Z"};
        String enconded_text = "";

        //it loops word by word in the text
        for (int j = 0; j < text.length; j++){
            String word = text[j];

             //then letter by letter in the word
            for (int i = 0; i < word.length(); i++){

                //determines the corresponding letter on the alphabet
                int index = determineIndex(word, i, key);

                //adds the converted letter to the new text
                enconded_text += alphabet[index];
            }
            //readds the space between words
            enconded_text += " ";
        }
        return enconded_text;
    }


    //if we exceed the range of alphabet by adding index, this method restarts the counting
    //e.g. "Z" is letter 26, index 25
    //if the key is 3
    //I get an index of 29, which is out of range of my String array "alphabet"
    // so, this method returns 25+3-26 (i.e. 2) which is the index for letter "C"
    public static int determineIndex(String word, int i, int key){
        int index = Character.getNumericValue(word.charAt(i))-10+key;
        if (index >= 26){
            return index - 26;
        }
        return index;
    }

    public static void printResults(String enconded_text){
        System.out.println("Your message was encoded as: ");
        System.out.println(enconded_text);
    }
}
