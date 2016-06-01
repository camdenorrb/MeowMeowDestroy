package me.midnight.meow.katmikanics;

/**
 * Created by camdenorrb on 5/30/16.
 */
public class Planet {

    private final String name;

    private boolean isAlive = true;
    private long fishPopulation = 0;
    private long availableMilk = 0;
    private long population = 0;

    public Planet(String name, long fishPopulation, long availableMilk, long population) {
        this.name = name;
        this.fishPopulation = fishPopulation;
        this.availableMilk = availableMilk;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public long getPopulation() {
        return population;
    }

    public long getAvailableMilk() {
        return availableMilk;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public long getFishPopulation() {
        return fishPopulation;
    }

    public void setPopulation(long population) {
        this.population = population;
    }

    public void setAvailableMilk(long availableMilk) {
        this.availableMilk = availableMilk;
    }

    public void setFishPopulation(long fishPopulation) {
        this.fishPopulation = fishPopulation;
    }
}
