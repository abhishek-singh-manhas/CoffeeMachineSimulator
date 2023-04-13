# Coffee Machine Simulator

This is a Java console application for simulating a coffee machine. The coffee machine can hold infinite amounts of water, milk, and coffee beans, but initially contains nothing. The machine also has a money box for storing all the money it collects through selling, which is initially empty. There are three types of coffee available for purchase, each with a different price and required amounts of ingredients:

- Espresso: $4/cup, 250ml water/cup, 0ml milk/cup, 16g beans/cup
- Latte: $7/cup, 350ml water/cup, 75ml milk/cup, 20g beans/cup
- Cappuccino: $6/cup, 200ml water/cup, 100ml milk/cup, 12g beans/cup

## The application provides the following options:
- Buy coffee: allows the user to buy a coffee of their choice. The coffee is dispensed only if the machine contains enough ingredients to make that coffee, otherwise it shows an error message.
- Fill ingredients: allows the user to add more water, milk, and/or coffee beans to the machine.
- Take money: enables the maintainer to take the money in the money box.
- Show ingredients: enables the user to check the amount of water, milk, and coffee beans left in the machine.
- Show money: enables the maintainer to check the amount of money currently in the money box.
- Show analytics: displays the count of all the coffees sold, amount earned, and ingredients consumed.

## Usage
When you run the application, you will see the following options:

### Select an option:
- 1 -> Buy coffee
- 2 -> Fill ingredients
- 3 -> Take money
- 4 -> Show ingredients
- 5 -> Show money
- 6 -> Show analytics
- 0 -> Exit
Choose an option by entering its corresponding number and pressing Enter.

## Buying coffee
If you choose option 1 to buy coffee, you will see the following options:
### Select a coffee:
- 1 -> Espresso ($4)
- 2 -> Latte ($7)
- 3 ->Cappuccino ($6)
Choose a coffee by entering its corresponding number and pressing Enter. If the machine has enough ingredients to make the selected coffee, it will dispense the coffee and update the money box and ingredient amounts accordingly. If the machine does not have enough ingredients, it will show an error message.

## Filling ingredients
If you choose option 2 to fill ingredients, you will be prompted to enter the amount of water, milk, and coffee beans to add to the machine.

## Taking money
If you choose option 3 to take money, the amount of money currently in the money box will be displayed, and you will be prompted to confirm that you want to take the money. If you confirm, the money box will be emptied.

## Showing ingredients
If you choose option 4 to show ingredients, the amount of water, milk, and coffee beans currently in the machine will be displayed.

## Showing money
If you choose option 5 to show money, the amount of money currently in the money box will be displayed.

## Showing analytics
If you choose option 6 to show analytics, the following information will be displayed:
Number of espressos sold
Number of lattes sold
Number of cappuccinos sold
Total amount earned

## Output Snapshot
![image](https://github.com/abhishek-singh-manhas/CoffeeMachineSimulator/blob/5930d89991151f2d7d0a00d2e4d4a9670952214c/Screenshots/outputCoffeeMachine.jpg)
