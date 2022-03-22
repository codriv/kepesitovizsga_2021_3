package hu.nive.ujratervezes.kepesitovizsga.army;

import java.util.ArrayList;
import java.util.List;

public class Army {

    private List<MilitaryUnit> army = new ArrayList<>();

    public void addUnit(MilitaryUnit militaryUnit) {
        army.add(militaryUnit);
    }

    public void damageAll(int damage) {
        army.forEach(unit -> unit.sufferDamage(damage));
        army.removeIf(unit -> unit.getHitPoints() < 25);
    }

    public int getArmyDamage() {
        return army.stream().mapToInt(MilitaryUnit::doDamage).sum();
    }

    public int getArmySize() {
        return army.size();
    }

}
