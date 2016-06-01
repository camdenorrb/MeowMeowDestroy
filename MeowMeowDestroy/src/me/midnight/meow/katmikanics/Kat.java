package me.midnight.meow.katmikanics;

/**
 * Created by camdenorrb on 5/30/16.
 */
public abstract class Kat {

    private final String name;
    private long gallonsOfMilk;
    private long fish;

    public Kat(String name, int gallonsOfMilk, int fish) {
        this.name = name;
        this.fish = fish;
        this.gallonsOfMilk = gallonsOfMilk;
    }

    public abstract void meow();

    public long getFish() {
        return fish;
    }

    public String getName() {
        return name;
    }

    public void setFish(long fish) {
        this.fish = fish;
    }

    public long getGallonsOfMilk() {
        return gallonsOfMilk;
    }

    public void setGallonsOfMilk(long gallonsOfMilk) {
        this.gallonsOfMilk = gallonsOfMilk;
    }

}
