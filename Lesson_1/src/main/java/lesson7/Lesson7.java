package lesson7;

public class Lesson7 {
    public static void main(String[] args) {
        System.out.println("List of cats:");
        Cat[] x = {new Cat("Cat1", 3), new Cat("Cat2", 7), new Cat("Cat3", 23)};
        Plate plate = new Plate(10);
        for (Cat c : x) {
            System.out.println(c);
        }
        System.out.println("\n" + plate);
        System.out.println("increase food by 20");
        plate.increaseFood();
        System.out.println(plate);
        System.out.println("Cats eats:");
        for (Cat c : x) {
            c.eat(plate);
            System.out.println(c);
            System.out.println(plate);
        }
    }

    public static class Cat {
        private final String name;
        private final int satiety;
        private boolean isLoadUp;

        Cat(String name, int satiety) {
            this.name = name;
            this.satiety = satiety;
            this.isLoadUp = false;
        }

        @Override
        public String toString() {
            return "CAT: " + name + " SATIETY: " + satiety + " LOADUP: " + isLoadUp;
        }

        void eat(Plate plate) {
            if (plate.getAmountOfFood() > satiety) {
                plate.decreaseFood(satiety);
                isLoadUp = true;
            }
        }
    }

    public static class Plate {
        private int amountOfFood;

        Plate(int amountOfFood) {
            this.amountOfFood = amountOfFood;
        }

        @Override
        public String toString() {
            return "PLATE: " + amountOfFood;
        }

        void decreaseFood(int satiety) {
            if (amountOfFood >= satiety) {
                amountOfFood -= satiety;
            }
        }

        int getAmountOfFood() {
            return amountOfFood;
        }

        void increaseFood() {
            amountOfFood += 20;
        }
    }
}
