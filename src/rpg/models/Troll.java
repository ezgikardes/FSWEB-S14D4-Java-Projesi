package rpg.models;

import rpg.util.Constant;

public class Troll extends Monster implements Bleedable, Poisonable{
    public Troll(String name, int hitPoints, double damage) {
        super(name, hitPoints, damage);
    }


    @Override
    public double attack() {
        return getDamage() + poison() + bleed();
    }

    @Override
    public double poison() {
        return getDamage() * Constant.POISON_PERCENTAGE;
    }

    @Override
    public double bleed() {
        return getDamage() * Constant.BLEED_PERCENTAGE;
    }

}
