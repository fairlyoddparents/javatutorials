public class ComputePay {
    public static void main (String[] args){
        //Calculate pay at work based on hours worked ae
        int hoursWorked = 4 + 5 + 8 + 4;
        double salary = 8.75;
        double tax = 0.20;

        System.out.println("My total hours worked;");
        System.out.println(hoursWorked);

        System.out.println("My hourly salary");
        System.out.prinln("$" + salary);

        System.out.println("My total pay:");
        System.out.println(hoursWorked*salary);

        System.out.println("My taxes owed:");
        System.out.println(hoursWorked*salary*taxes);
    }
}
