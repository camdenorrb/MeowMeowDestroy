package me.midnight.meow.katmikanics;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;


//Meow
/**
 * Created by camdenorrb on 5/30/16.
 */
public class Gang {

    private final Set<Kat> kats = new HashSet<>();
    private final String name;

    private long totalFish = 0;
    private long totalMilk = 0;

    public Gang(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public long getTotalMilk() {
        return totalMilk;
    }

    public long getTotalFish() {
        return totalFish;
    }

    public Set<Kat> getKats() {
        return Collections.unmodifiableSet(kats);
    }

    public void setTotalMilk(long totalMilk) {
        this.totalMilk = totalMilk;
    }

    public void setTotalFish(long totalFish) {
        this.totalFish = totalFish;
    }

    public void claw(Kat kat) {
        System.out.println(kat.getName() + " got scratched");
    }

    public void destroyPlanet(Planet planet) {
        if (!planet.isAlive()) { System.out.println("Pwanet is already destwoyd :C"); return; }
        totalMilk += planet.getAvailableMilk();
        totalFish += planet.getFishPopulation();
        planet.setAlive(false);
        System.out.println(planet.getName() + " HAS BEEN DESTWOYD KILLED " + planet.getPopulation() + " MORTALS  Stole: " + planet.getFishPopulation() + " Fish  Stole: " + planet.getAvailableMilk() + " Gallons of Milk");
    }

    public void remove(Kat kat) {
        if (!kats.remove(kat)) { System.out.println(kat.getName() + " is not in this gang."); return; }
        kat.setFish(0);
        kat.setGallonsOfMilk(0);
        System.out.println(kat.getName() + " Was kicked from " + name + " and got all his resources stolen >;3");
    }

    public void add(Kat kat) {
        if (kat.getFish() < 1000 || kat.getGallonsOfMilk() < 100000) { System.out.println(kat.getName() + " Was rejected from " + name + " Gang!"); return; }
        totalFish += kat.getFish();
        totalMilk += kat.getGallonsOfMilk();
        kats.add(kat);
    }
}
