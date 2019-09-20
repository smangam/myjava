package com.astracodes;

class MaximumFinder {

  public static void main(String args[]) {
    System.out.println("This gives you the maximum of 3 numbers");
    int max = maximum(10,11,200);
    System.out.println("Tha max number is "+max);
  }

  public static int maximum(int x, int y, int z) {
     int max_number = x;

     if ( y > max_number) {
       max_number = y;
     }

     if ( z > max_number) {
       max_number = z;
     }
     return max_number;
  }
}
