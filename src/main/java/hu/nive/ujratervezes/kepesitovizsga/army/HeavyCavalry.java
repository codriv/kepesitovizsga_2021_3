package hu.nive.ujratervezes.kepesitovizsga.army;

public class HeavyCavalry extends MilitaryUnit{

    private boolean firstAttack = true;

    public HeavyCavalry() {
        hitPoints = 150;
        damage = 20;
        hasArmour = true;
    }

    @Override
    public int doDamage() {
        if (firstAttack) {
            firstAttack = false;
            return damage * 3;
        } else {
            return damage;
        }
    }
}
