package com.company;

public class HERO {
    private int health ;
    private int damage;
    private String superPowers;

    public HERO (int health, int damage, String superPowers){
        this.health = health;
        this.damage = damage;
        this.superPowers = superPowers;
    }

    public HERO (int health, int damage){
        this.health = health;
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getSuperPowers() {
        return superPowers;
    }
}
