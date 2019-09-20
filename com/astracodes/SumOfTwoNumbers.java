package com.astracodes;

class SumOfTwoNumbers {

  public static void main(String args[]) {
    Sum mysum;
    int a;

    mysum = new Sum();
    a = mysum.add(10,20);
    System.out.println("sum is "+ a); 
  }
}


class Sum {
  int m = 100;
  int add(int x, int y) {
    int z;
    z = x + y + m;
    return z;
  }
}
