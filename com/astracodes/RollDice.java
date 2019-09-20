// program that simulates the rolling of a dice
package com.astracodes;
import java.util.Random;

class RollDice {
  public static void main(String[] args) {
    Random myrandom;
    myrandom = new Random();

    for (int j=0; j < 20; j++) {
      int i = myrandom.nextInt(6);
      System.out.println("The random number is "+i);
    }
  }
}
