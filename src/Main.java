import coffeemachine.CoffeeMachine;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        CoffeeMachine coffeeMachine = new CoffeeMachine();
        int espressoCount = 0;
        int latteCount = 0;
        int cappuccinoCount = 0;

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1 - Buy coffee");
            System.out.println("2 - Fill ingredients");
            System.out.println("3 - Take money");
            System.out.println("4 - Show ingredients");
            System.out.println("5 - Show money");
            System.out.println("6 - Show analytics");
            System.out.println("0 - Exit");

            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Select a coffee:");
                    System.out.println("1 - Espresso ($4)");
                    System.out.println("2 - Latte ($7)");
                    System.out.println("3 - Cappuccino ($6)");
                    int coffeeChoice = scn.nextInt();
                    switch (coffeeChoice) {
                        case 1:
                            if(coffeeMachine.canMakeCoffee(250,0,16)) {
                                System.out.println("Enjoy your Espresso!");
                                coffeeMachine.makeCoffee(250,0,16,4);
                                espressoCount++;
                            } else {
                                System.out.println("Sorry, not enough ingredients to make Espresso!");
                            }
                            break;
                        case 2:
                            if (coffeeMachine.canMakeCoffee(350,75,20)) {
                                System.out.println("Enjoy your Latte!");
                                coffeeMachine.makeCoffee(350,75,20,7);
                                latteCount++;
                            } else {
                                System.out.println("Sorry, not enough ingredients to make Latte!");
                            }
                            break;
                        case 3:
                            if (coffeeMachine.canMakeCoffee(200,100,12)) {
                                System.out.println("Enjoy your Cappuccino!");
                                coffeeMachine.makeCoffee(200,100,12,6);
                                cappuccinoCount++;
                            } else {
                                System.out.println("Sorry, not enough ingredients to make Cappuccino!");
                            }
                            break;
                        default:
                            System.out.println("Invalid coffee selection!");
                    }
                    break;
                case 2:
                    System.out.println("Enter the amount of water to fill:");
                    int water = scn.nextInt();
                    System.out.println("Enter the amount of milk to fill:");
                    int milk = scn.nextInt();
                    System.out.println("Enter the amount of beans to fill:");
                    int beans = scn.nextInt();
                    coffeeMachine.fill(water, milk, beans);
                    System.out.println("Ingredients added successfully!");
                    break;
                case 3:
                    coffeeMachine.takeMoney();
                    break;
                case 4:
                    coffeeMachine.showIngredients();
                    break;
                case 5:
                    coffeeMachine.showMoney();
                    break;
                case 6:
                    coffeeMachine.showAnalytics(espressoCount,latteCount,cappuccinoCount);
                    break;
                case 0:
                    System.out.println("Exiting Coffee Machine Simulator...");
                    return;
                default:
                    System.out.println("Invalid choice!");
            }
        }
    }

}


