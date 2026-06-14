package io.github.worldscapesuitemc_byte.worldscape_core.java;

public abstract class Entity {

    public double health = 20.0D;

    public Entity(double initialHealth) {
        this.health = initialHealth;
    }

    void doSomething(double amount) {
        System.out.println("entityDidSomething");
    }
}
