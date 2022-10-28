

public class bankInterestCalculator{
    public static void main(String[] args){
        calculateInterest();
    }

    public static void calculateInterest(){
        int initial_investment = 1000;
        double interest = 6.5;
        int annual_deposit = 100;
        double total = initial_investment;
        for(int i=1; i<=25; i++){
            System.out.println("YEAR " + i);
            System.out.println("Current balance: " + trimNumber(total));
            double myInterest = total*.065;
            System.out.println("Interest: " + trimNumber(myInterest));
            total+=myInterest;
            total+=100;
            System.out.println("New deposit: " + annual_deposit);
            System.out.println("New balance: " + trimNumber(total));
            System.out.println("");
        }

        System.out.print("The total after 25 years is " + trimNumber(total));
    }

    public static double trimNumber(double number){
        return (((double)((int)(number*100)))/100);
    }
}
