package machine;

import java.util.Scanner;

public class UserInterface {

    private Machine machine;
    private Scanner scanner;

    public UserInterface(Scanner scanner, Machine machine){
        this.machine = machine;
        this.scanner = scanner;
    }

    public void start(){
        while(true){
            System.out.println("Write action (buy, fill, take):");
            String action = this.scanner.nextLine();

            if(action.equals("fill")){
                System.out.println("Write how many ml of water do you want to add:");
                int water = this.scanner.nextInt();
                System.out.println("Write how many ml of milk do you want to add:");
                int milk = this.scanner.nextInt();
                System.out.println("Write how many grams of coffee do you want to add:");
                int coffee = this.scanner.nextInt();
                System.out.println("Write how many disposable cups do you want to add:");
                int cups = this.scanner.nextInt();
                this.machine.fillMachine(water,milk, coffee, cups);
            }else if (action.equals("take")){
                this.machine.takeMoney();
            }else if (action.equals("buy")){
                System.out.println("What do yo want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                String input = scanner.nextLine();
                if(input.equals("back")){
                    continue;
                }
                this.machine.prepareCoffee(Integer.valueOf(input));
                //this.machine.machineStatus();
            }else if(action.equals("exit")){
                break;
            } else if(action.equals("remaining")){
                this.machine.machineStatus();
            }
        }

    }
}
