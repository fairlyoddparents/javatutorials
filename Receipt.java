// This program computes the total amount owed for a meal,
// assuming 8% tax and a 15% tip.

public class Receipt {
    public static void main(String[] args){
        double subtotal = 38+40+30;
        double tax = 0.08;
        double tip = 0.15;
        double totalAmount = (subtotal*tax) + (subtotal*tip);

        System.out.println("Subtotal:");
        System.out.println(subtotal);
        System.out.println("Tax");
        System.out.println(tax);
        System.out.println("Tip:");
        System.out.println("Total:");
        System.out.println(totalAmount);
    }
}
