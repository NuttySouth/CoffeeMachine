package machine;

public class Cappuccino implements Coffee {

    private int water;
    private int milk;
    private int coffee;
    private int price;
    private String name;

    public Cappuccino(){
        this.water = 200;
        this.milk = 100;
        this.coffee = 12;
        this.price = 6;
        this.name = "cappuccino";
    }

    public int getWater() {
        return water;
    }

    public String getName() {
        return name;
    }

    public int getMilk() {
        return milk;
    }

    public int getCoffee() {
        return coffee;
    }

    public int getPrice() {
        return price;
    }
}
