package com.khushi;

public class player2 extends player1 {
    private int health;
    private boolean armour;

    public player2(String name, String weapon, int health, boolean armour) {
        super(name, weapon, health);
        this.health = health;
        this.armour = armour;
    }

    @Override
    public void damagebygun1() {
        if (armour) {
            this.health -= 20;
            if (this.health <= 0) this.health = 0;

            System.out.println("armour is on .got hit by 1.health is reduced by 20" + "New health is " + this.health);


        }
        if (!armour) {
            this.health -= 30;
            if (this.health <= 0) this.health = 0;

            System.out.println("armour is off .got hit by 1.health is reduced by 30" + "New health is " + this.health);


        }
        if(this.health==0){
            System.out.println(getName() + "is dead");
        }
    }

    @Override
    public void damagebygun2() {
        if (armour) {
            this.health -= 40;
            if (this.health <= 0) this.health = 0;

            System.out.println("armour is on .got hit by 1.health is reduced by 40" + "New health is " + this.health);


        }
        if (!armour) {
            this.health -= 50;
            if (this.health <= 0) this.health = 0;

            System.out.println("armour is not off .got hit by 1.health is reduced by 50" + "New health is " + this.health);


        }
        if(this.health==0){
            System.out.println(getName() + "is dead");
        }

    }

    @Override
    public void heal() {
        super.heal();
    }
}