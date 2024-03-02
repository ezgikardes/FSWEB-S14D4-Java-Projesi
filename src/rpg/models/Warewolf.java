package rpg.models;

import rpg.util.Constant;

public class Warewolf extends Monster implements Bleedable{

    public Warewolf(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }

    @Override
    public double bleed() {
        return getDamage() * Constant.BLEED_PERCENTAGE;
    }

    @Override
    public double attack() {
        return getDamage() + bleed();
    }
}
