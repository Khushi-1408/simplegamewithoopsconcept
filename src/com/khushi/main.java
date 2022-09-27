package com.khushi;

public class main {
    public static void main(String[] args) {
     player1 player = new player1("harshita","sword",100);
      System.out.println(player.getName());
       System.out.println(player.getWeapon());
    System.out.println(player.getHealth());
       player.damagebygun1();
      player.damagebygun1();
        player.damagebygun2();
      player.heal();
        player.damagebygun2();
        player2 betterplayer = new player2("khushi","machinegun", 80, false);
       betterplayer.damagebygun1();
    }
}
