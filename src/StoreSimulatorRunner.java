import java.util.Scanner;
public class StoreSimulatorRunner {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome to Sifat's Marketplace! What is your budget for today?");
        int b = s.nextInt();
        StoreSimulator TripOne = new StoreSimulator(b);
        System.out.println("Your budget is $" + b);

        System.out.println("How many apples would you like to buy? Each apple costs $0.99");
        int a = s.nextInt();
        TripOne.buyApples(a);


    }


}
