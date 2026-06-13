package io.github.worldscapesuitemc_byte.worldscape_avp.java;

public class Player extends Entity {
    void doSomething(double amount) {
        this.health += amount;
        System.out.println(this.health);
    }

    static void main() {
        new Player().doSomething(-3.0D);
    }
}