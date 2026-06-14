package io.github.worldscapesuitemc_byte.worldscape_core.java;

public class Alien extends Entity{

    public Alien(double initialHealth) {
        super(initialHealth);
    }

    @Override
    void doSomething(double amount) {
        this.health += amount;
        System.out.println(this.health);
    }
}
