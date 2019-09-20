
package com.astracodes;
import java.util.Scanner;

class TestMessage2 {
  public static void main(String args[]) {
    Scanner myInput;

    myInput = new Scanner(System.in);
    System.out.print("Enter a String:");
    String myStr = myInput.nextLine();

    Message2 myMessage;
    myMessage = new Message2();
    myMessage.printMessage(myStr);
  }

}
