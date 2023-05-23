<<<<<<< HEAD
package com.maier.javacore.chapter09;

class Balance {
  String name;
  double bal;

  public Balance(String n, double b) {
    name = n;
    bal = b;
  }

  public void show() {
    if(bal<0) 
      System.out.print("-->> ");
    System.out.println(name + ": $" + bal);
  }
}

=======
package com.maier.javacore.chapter09;

class Balance {
  String name;
  double bal;

  public Balance(String n, double b) {
    name = n;
    bal = b;
  }

  public void show() {
    if(bal<0) 
      System.out.print("-->> ");
    System.out.println(name + ": $" + bal);
  }
}

>>>>>>> 14106646e2c2880ee80f2cdfe1c68370e7618f78
