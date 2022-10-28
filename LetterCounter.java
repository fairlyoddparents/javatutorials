//this program determines how many letters in a string
//come from the second half of the alphabet (n or subsequent letters)
//in a given string

public class LetterCounter{
  public static void main(String[] args){
      String text = "With its gas-like body, it can sneak into any place it desires. However, it can be blown away by wind.";
      int lettersAfterM = countLettersAfterM(text.toLowerCase());
      printResults(lettersAfterM);
  }

  public static int countLettersAfterM(String text){
      int lettersAfterM = 0;
      for (int i = 0; i < text.length(); i++){
          if (text.charAt(i)>'m'){
              lettersAfterM++;
          }
      }
      return lettersAfterM;
  }

  public static void printResults(int number){
      System.out.print("The number of letters that come from the second ");
      System.out.printf("half of the alphabet is %d.", number);
  }
}
