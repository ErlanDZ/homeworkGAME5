package com.company;

public class Main {


    public static void main(String[] args) {
        createHeroes();
        for (HERO heroes : createHeroes()) {
            System.out.println("Здоровье героя = " + heroes.getHealth() + "," + "Удар героя = " +
                    heroes.getDamage() + "," + " Способность героя =  " + heroes.getSuperPowers());
        }
        BOSS b1 = new BOSS();
        b1.setHealth(500);
        b1.setDamage(100);
        b1.setProtectionType("Telepath");
        System.out.println("Boss Life = " + b1.getHealth() + ", " + "Boss Strike = " + b1.getDamage() +
                ", " + "Boss Defense = " + b1.getProtectionType() + ".");

    }

    public static HERO[] createHeroes() {
        HERO ironMen = new HERO(200, 30, "impenetrable suit");
        HERO captainAmerica = new HERO(150, 20, "0");
        HERO tor = new HERO(250, 40, "lord of thunder");

        HERO[] create = {ironMen, captainAmerica, tor};

        return create;

    }
}
