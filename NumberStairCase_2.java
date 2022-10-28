public class NumberStairCase_2{
    public static void main(String[] args){
        int number = 1;
        for (int i=4; i>=0; i--){
            System.out.println(" ".repeat(i) + number);
            number+=1;
        }
    }
}
