public class NumberStairCase{
    public static void main(String[] arg){
        for (int i=1; i<=7; i++){
            String number = Integer.toString(i);
            System.out.println(number.repeat(i));
        }
    }
}
