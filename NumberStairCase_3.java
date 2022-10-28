public class NumberStairCase_3{
    public static void main(String[] args){
        int number = 1;
        for (int i=4; i>=0; i--){
            String number_2 = Integer.toString(number);
            System.out.println(" ".repeat(i) + number_2.repeat(number));
            number+=1;
        }
    }
}
