package machine;

public class Espresso implements Coffee{

        private int coffee;
        private int water;
        private int price;
        private String name;
        private int milk;

        public Espresso(){
            this.water = 250;
            this.coffee = 16;
            this.price = 4;
            this.name = "espresso";
            this.milk = 0;
        }

        public String getName(){
            return this.name;
        }

        public int getMilk(){
            return this.milk;
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
