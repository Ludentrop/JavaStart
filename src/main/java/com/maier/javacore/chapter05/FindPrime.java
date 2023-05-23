<<<<<<< HEAD
package com.maier.javacore.chapter05;

class FindPrime {
  public static void main(String args[]) {
    int num;
    boolean isPrime;

    num = 14; 

    if(num < 2) isPrime = false;
    else isPrime = true;

    for(int i=2; i <= num/i; i++) {
      if((num % i) == 0) {
        isPrime = false;
        break;
      }
    }

    if(isPrime) System.out.println("Prime");
    else System.out.println("Not Prime");
  }
}

=======
package com.maier.javacore.chapter05;

class FindPrime {
  public static void main(String args[]) {
    int num;
    boolean isPrime;

    num = 14; 

    if(num < 2) isPrime = false;
    else isPrime = true;

    for(int i=2; i <= num/i; i++) {
      if((num % i) == 0) {
        isPrime = false;
        break;
      }
    }

    if(isPrime) System.out.println("Prime");
    else System.out.println("Not Prime");
  }
}

>>>>>>> 14106646e2c2880ee80f2cdfe1c68370e7618f78
