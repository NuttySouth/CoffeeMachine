package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Machine machine = new Machine(550, 400, 540, 120, 9);
        Cappuccino cappuccino = new Cappuccino();
        Latte latte = new Latte();
        Espresso espresso = new Espresso();

        machine.addCoffee(espresso);
        machine.addCoffee(latte);
        machine.addCoffee(cappuccino);
        UserInterface ui = new UserInterface(scanner, machine);
        ui.start();
    }
}
