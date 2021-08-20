//this program repeats an concatenates a string a n number of times
//then it prints the result

public class Repeat{
    public static void main(String[] args){
        String text = "hello";
        int n = 3;
        String concatenated_text = repl(text, n);
        System.out.print(concatenated_text);
    }

    public static String repl(String text, int n){
        String concatenated_text = "";
        for (int i=1; i<=n; i++){
            concatenated_text += text;
        }
        return concatenated_text;
    }
}
