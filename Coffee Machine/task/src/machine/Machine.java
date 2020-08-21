package machine;

import java.util.ArrayList;

public class Machine {

    private int money;
    private int water;
    private int milk;
    private int coffee;
    private int disposableCups;
    ArrayList<Coffee> coffeeAvailable;

    public Machine(int money, int water, int milk, int coffee, int disposableCups){
        this.money = money;
        this.water = water;
        this.milk = milk;
        this.coffee = coffee;
        this.disposableCups = disposableCups;
        this.coffeeAvailable = new ArrayList<>();
    }

    public void addCoffee(Coffee coffee){
        this.coffeeAvailable.add(coffee);
    }

    public void prepareCoffee(int position){

        position -=1;
        Coffee coffee = this.coffeeAvailable.get(position);
        if(canMake(position) && this.disposableCups>=1){
            this.water  = this.water - coffee.getWater();
            this.milk = this.milk - coffee.getMilk();
            this.coffee = this.coffee - coffee.getCoffee();
            this.disposableCups--;
            this.money += coffee.getPrice();
            System.out.println("I have enough resources, making you a coffee!");
        }else{
            int missingWater = this.water - coffee.getWater();
            int missingMilk = this.milk - coffee.getMilk();
            int missingCoffee = this.coffee - coffee.getCoffee();
            if(missingCoffee< 0){
                System.out.println("Sorry, not enough coffee!");
            }else if(missingMilk<0){
                System.out.println("Sorry, not enough milk!");
            }else if(missingWater < 0){
                System.out.println("Sorry, not enough water!");
            }
        }
    }

    public boolean canMake(int position){
        Coffee coffee = this.coffeeAvailable.get(position);
        boolean checkWater  = this.water - coffee.getWater() >= 0;
        boolean checkMilk = this.milk - coffee.getMilk() >= 0;
        boolean checkCoffee = this.coffee - coffee.getCoffee() >= 0;

        return checkCoffee && checkCoffee && checkWater;
    }

    public void machineStatus(){

        System.out.println("The coffee machine has:");
        System.out.println(this.water + " of water");
        System.out.println(this.milk + " of milk");
        System.out.println(this.coffee + " of coffee beans");
        System.out.println(this.disposableCups + " of disposable cups");
        System.out.println(this.money + " of money");
    }

    public void takeMoney(){
        System.out.println("I gave you $" + this.money);
        this.money = 0;
    }

    public void fillMachine(int water, int milk, int coffee, int disposableCups){
        this.water += water;
        this.milk += milk;
        this.coffee += coffee;
        this.disposableCups += disposableCups;
    }


}
