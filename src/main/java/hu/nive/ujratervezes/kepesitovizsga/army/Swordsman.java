package hu.nive.ujratervezes.kepesitovizsga.army;

public class Swordsman extends MilitaryUnit{

    private boolean hasShell = true;

    public Swordsman(boolean hasArmour) {
        hitPoints = 100;
        damage = 10;
        this.hasArmour = hasArmour;
    }

    @Override
    public void sufferDamage(int damage) {
        if (hasShell) {
            hasShell = false;
        } else {
            super.sufferDamage(damage);
        }
    }
}
