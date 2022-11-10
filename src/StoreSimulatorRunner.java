import java.util.Scanner;
public class StoreSimulatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Sifat's Marketplace! What is your budget for today?");
        int b = s.nextInt();
        StoreSimulator TripOne = new StoreSimulator(b);
        System.out.println("Your budget is $" + b);
        System.out.println();

        System.out.println("How many apples would you like to buy? Each apple costs $0.99. Enter 0 if you wish to not buy any apples.");
        int a = s.nextInt();
        TripOne.buyApples(a);
        System.out.println();

        System.out.println("How many bananas would you like to buy? Each apple costs $0.75. Enter 0 if you wish to not buy any bananas.");
        int ban = s.nextInt();
        TripOne.buyBananas(ban);
        System.out.println();

        System.out.println("How many watermelons would you like to buy? Each apple costs $3.50 . Enter 0 if you wish to not buy any watermelons.");
        int wa = s.nextInt();
        TripOne.buyWatermelons(wa);
        System.out.println();


    }


}
