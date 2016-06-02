package me.midnight.meow;

import me.midnight.meow.katmikanics.Gang;
import me.midnight.meow.katmikanics.Midnight;
import me.midnight.meow.katmikanics.Planet;

/**
 * Created by camdenorrb on 5/30/16.
 */
public class MeowMeowDestroy {

    private static final Planet eath = new Planet("Eath", 100, 10000, 100000);
    private static final Planet planetDogs = new Planet("Dogs Ew", 10000, 10000, 10000);
    private static final Gang katGang = new Gang("DABWASES");
    private static final Midnight kingKat = new Midnight();

    public static void main(String[] args) {
        katGang.add(kingKat);
        katGang.destroyPlanet(eath);
        katGang.destroyPlanet(planetDogs);
        System.out.println(katGang.getTotalFish());
        katGang.remove(kingKat);
        System.out.println(kingKat.getFish());
    }
}
