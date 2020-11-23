package lesson6;

public class Lesson6 {

    public static void main(String[] args) {
        System.out.println("Cat");
        Cat cat = new Cat();
        cat.run(250);
        cat.jump(1);
        cat.swim(5);

        System.out.println("Dog");
        Dog dog = new Dog();
        dog.run(550);
        dog.swim(9);
        dog.jump(0.3);
    }
}

abstract class Animal {
    private final int MAX_RUN_LENGTH = 0;
    private final int MAX_SWIM_LENGTH = 0;
    private final double MAX_JUMP_HEIGTH = 0;
    abstract void run(int length);
    abstract void swim(int length);
    abstract void jump(double height);
}

class Cat extends Animal {

    @Override
    void run(int length) {
        int MAX_RUN_LENGTH = 200;
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("swim: false");
    }

    @Override
    void jump(double height) {
        double MAX_JUMP_HEIGTH = 2;
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}

class Dog extends Animal {

    @Override
    void run(int length) {
        int MAX_RUN_LENGTH = 500;
        if ((length >= 0) && (length <= MAX_RUN_LENGTH)) System.out.println("run: true");
        else System.out.println("run: false");
    }

    @Override
    void swim(int length) {
        int MAX_SWIM_LENGTH = 10;
        if ((length >= 0) && (length <= MAX_SWIM_LENGTH)) System.out.println("swim: true");
        else System.out.println("swim: false");
    }

    @Override
    void jump(double height) {
        double MAX_JUMP_HEIGTH = 0.5;
        if ((height >= 0) && (height <= MAX_JUMP_HEIGTH)) System.out.println("jump: true");
        else System.out.println("jump: false");
    }
}
