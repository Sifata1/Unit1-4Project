import java.util.Scanner;
public class StoreSimulator {
    private double cost;
    private double tax;
    private double netCost;
    private int items;
    private double budget1;
    private int apples;
    private int bananas;
    private int watermelons;
    private double costOfApple;
    private double costOfWatermelons;
    private double costOfBanana;

    Scanner s = new Scanner(System.in);

    public StoreSimulator(double budget) {
        budget1 = budget;
    }

    public void buyApples(int a) {
        apples = a;
        costOfApple = 0.99;
        if (a == 0) {
            System.out.println("You have bought 0 apples.");
        } else {
            if (a* costOfApple > budget1) {
                System.out.println( "This will exceed your budget! You can only buy up to " + (int)(budget1/0.99) + " apples." + "\n" + "Would you like to still buy apples? Enter 2 for yes or 1 for no.");
                int answer1 = s.nextInt();
                if (answer1 == 2) {
                    System.out.println("Enter the number of apples you wish to buy");
                    int ap = s.nextInt();
                    if (ap * costOfApple > budget1) {
                        System.out.println("You can not buy that many apples");
                    } else {
                        System.out.println( "You have bought " + ap + "\n" + "Your budget is now $" + (budget1 - (ap*costOfApple)));
                        budget1 = budget1 - (ap*costOfApple);
                    }
                }

            } else {
                System.out.println( "You have bought " + a + "\n" + "Your budget is now $" + (budget1 - (a*costOfApple)));
                budget1 = budget1 - (a*costOfApple);
            }
            items = items + apples;

        }

    }

    public void buyBananas(int ban) {
        bananas = ban;
        costOfBanana = 0.75;
        if (ban == 0) {
            System.out.println("You have bought 0 bananas.");
        } else {
            if (ban* costOfBanana > budget1) {
                System.out.println( "This will exceed your budget! You can only buy up to " + (int)(budget1/0.75) + " bananas. " + "\n" + "Would you like to still buy bananas? Enter 2 for yes or 1 for no.");
                int answer1 = s.nextInt();
                if (answer1 == 2) {
                    System.out.println("Enter the number of bananas you wish to buy");
                    int ba = s.nextInt();
                    bananas = ba;
                    if (ba * costOfBanana > budget1) {
                        System.out.println("You can not buy that many bananas");
                    } else {
                        System.out.println( "You have bought " + ba + "\n" + "Your budget is now $" + (budget1 - (ba*costOfBanana)));
                        budget1 = budget1 - (ba*costOfBanana);
                        items = items + bananas;
                    }
                }

            } else {
                System.out.println( "You have bought " + ban + "\n" + "Your budget is now $" + (budget1 - (ban*costOfBanana)));
                items = items + bananas;
                budget1 = budget1 - (ban*costOfBanana);
            }

        }

    }

    public void buyWatermelons(int wa) {
        watermelons = wa;
        costOfWatermelons = 0.75;
        if (wa == 0) {
            System.out.println("You have bought 0 watermelons.");
        } else {
            if (wa* costOfWatermelons > budget1) {
                System.out.println( "This will exceed your budget! You can only buy up to " + (int)(budget1/0.75) + " watermelons. " + "\n" + "Would you like to still buy watermelons? Enter 2 for yes or 1 for no.");
                int answer1 = s.nextInt();
                if (answer1 == 2) {
                    System.out.println("Enter the number of watermelons you wish to buy");
                    int wat = s.nextInt();
                    watermelons = wat;
                    if (wat * costOfWatermelons > budget1) {
                        System.out.println("You can not buy that many watermelons");
                    } else {
                        System.out.println( "You have bought " + wat + "\n" + "Your budget is now $" + (budget1 - (wat*costOfWatermelons)));
                        budget1 = budget1 - (wat*costOfWatermelons);
                        items = items + watermelons;
                    }
                }

            } else {
                System.out.println( "You have bought " + wa + "\n" + "Your budget is now $" + (budget1 - (wa*costOfWatermelons)));
                items = items + watermelons;
                budget1 = budget1 - (wa*costOfWatermelons);
            }

        }

    }



}
