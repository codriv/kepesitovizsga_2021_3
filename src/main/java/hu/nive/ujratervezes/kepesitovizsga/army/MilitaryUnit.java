package hu.nive.ujratervezes.kepesitovizsga.army;

public abstract class MilitaryUnit {

    protected int hitPoints;
    protected int damage;
    protected boolean hasArmour;

    public int doDamage() {
        return damage;
    }

    public void sufferDamage(int damage) {
        hitPoints -= hasArmour ? damage / 2 : damage;
    }

    public int getHitPoints() {
        return hitPoints;
    }
}
