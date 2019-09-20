package com.astracodes;
import java.util.Scanner;

class Credit {
  float balance;

  void credit(int x) {
    this.balance = this.balance + x;
  }
}

class Balance {
  public static void main(String[] args) {
    Credit myCredit = new Credit();
    Scanner myinput;
    myinput = new Scanner(System.in);
    System.out.print("Enter credit amount:");
    int mycredit = myinput.nextInt();
    myCredit.credit(mycredit); 
    System.out.println("The new balance is "+myCredit.balance);
  }
}

