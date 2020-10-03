package com.company;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setBossHealth(270);
        boss.setBossDamage(50);
        boss.setBossProtectionType("Magical");

        System.out.println("Boss health's " + boss.getBossHealth() + ";\n" + "Boss damage's "
                + boss.getBossDamage() + ";\n" + "Boss protection type is " +
                boss.getBossProtectionType() + ";\n");

        for (Hero h : createHeroes()) {
            System.out.println("Hero health is " + h.getHeroesHealth() + ";\n" +
                    "Hero super power is " + h.getHeroesSuperPower() + ";\n" +
                    "Hero damage is " + h.getHeroesDamage() + ";\n");
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(260, 60,
                "Telekinesis");
        Hero hero2 = new Hero(250, 30);
        Hero hero3 = new Hero(240, 40,
                "Energy Attack");
        return new Hero[] {hero1, hero2, hero3};
    }
}
