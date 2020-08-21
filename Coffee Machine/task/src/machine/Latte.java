package machine;

public class Latte implements Coffee{

        private int milk;
        private int coffee;
        private int water;
        private int price;
        private String name;

        public Latte(){
            this.water = 350;
            this.milk = 75;
            this.coffee = 20;
            this.price = 7;
            this.name = "latte";
        }

        public String getName() {
            return name;
        }

    public Latte(int water, int milk, int coffee, int price){
            this.water = water;
            this.milk = milk;
            this.coffee = coffee;
            this.price = price;
            this.name = "latte";
        }

        public int getMilk() {
            return milk;
        }

        public int getCoffee() {
            return coffee;
        }

        public int getWater() {
            return water;
        }

        public int getPrice() {
            return price;
        }
}
