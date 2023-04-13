package coffeemachine;
public class CoffeeMachine {
    private int water;
    private int milk;
    private int beans;
    private int money;

    public CoffeeMachine() {
        this.water = 0;
        this.milk = 0;
        this.beans = 0;
        this.money = 0;
    }

    public void fill(int water, int milk, int beans) {
        this.water += water;
        this.milk += milk;
        this.beans += beans;
    }
    public int takeMoney() {
        int money = this.money;
        this.money = 0;
        return money;
    }
    public boolean canMakeCoffee(int water, int milk, int beans) {
        return this.water >= water && this.milk >= milk && this.beans >= beans;
    }

    public void makeCoffee(int water, int milk, int beans, int price) {
        if (canMakeCoffee(water, milk, beans)) {
            System.out.println("Dispensing coffee. Enjoy!");
            this.water -= water;
            this.milk -= milk;
            this.beans -= beans;
            this.money += price;
        } else {
            System.out.println("Sorry, not enough ingredients to make coffee.");
        }
    }

    public void showIngredients() {
        System.out.println("Water: " + this.water + " ml");
        System.out.println("Milk: " + this.milk + " ml");
        System.out.println("Beans: " + this.beans + " g");
    }

    public void showMoney() {
        System.out.println("Money: $" + this.money);
    }

    public void showAnalytics(int espressoCount, int latteCount, int cappuccinoCount) {
        int totalCups = espressoCount + latteCount + cappuccinoCount;
        int totalEarned = 4 * espressoCount + 7 * latteCount + 6 * cappuccinoCount;
        int totalWater = 250 * espressoCount + 350 * latteCount + 200 * cappuccinoCount;
        int totalMilk = 0 * espressoCount + 75 * latteCount + 100 * cappuccinoCount;
        int totalBeans = 16 * espressoCount + 20 * latteCount + 12 * cappuccinoCount;

        System.out.println("Total cups sold: " + totalCups);
        System.out.println("Total money earned: $" + totalEarned);
        System.out.println("Total water consumed: " + totalWater + " ml");
        System.out.println("Total milk consumed: " + totalMilk + " ml");
        System.out.println("Total beans consumed: " + totalBeans + " g");
    }

}
