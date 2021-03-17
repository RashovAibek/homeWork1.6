package com.GeekTek;

public class Main {

    public static void main(String[] args) {
        Boss bear = new Boss();
        bear.setHealth(200);
        bear.setDamage(50);
        Weapon Beretta = new Weapon("огнестрельное","Beretta ");
        bear.setWeapon(new Weapon("огнестрельное", "Beretta"));
        System.out.println("здоровье - " + bear.getHealth() + "\n" + " Урон - " + bear.getDamage() + "\n" + "оружия - " +
                bear.getWeapon().getPistol() + "\n" + "названия оружия - " + bear.getWeapon().getName());
    }
}
