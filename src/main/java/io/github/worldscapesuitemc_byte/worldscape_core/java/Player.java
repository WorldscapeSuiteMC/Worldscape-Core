package io.github.worldscapesuitemc_byte.worldscape_core.java;

public class Player extends Entity {

    public Player(double initialHealth) {
        super(initialHealth);
    }

    @Override
    void doSomething(double amount) {
        this.health += amount;
        System.out.println(this.health);
        super.doSomething(0.0D);

    }

    static void main() {
        new Player(100.0D).doSomething(-3.0D);
    }
}