package io.github.worldscapesuitemc_byte.worldscape_avp.java;

public class Alien extends Entity{

    @Override
    void doSomething(double amount) {
        this.health += amount;
        System.out.println(this.health);
    }
}
