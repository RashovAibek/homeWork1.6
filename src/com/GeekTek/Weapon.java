package com.GeekTek;

public class Weapon {
    private String pistol;
    private String name;

    public Weapon(String pistol, String name) {
        this.pistol = pistol;
        this.name = name;
    }

    public String getPistol() {
        return pistol;
    }

    public String getName() {
        return name;
    }

    public void setPistol(String pistol) {
        this.pistol = pistol;
    }

    public void setName(String name) {
        this.name = name;
    }
}
