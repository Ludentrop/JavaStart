<<<<<<< HEAD
package com.maier.javacore.chapter08;

class B extends A {
  int k;

  B(int a, int b, int c) {
    super(a, b);
    k = c;
  }

  void show() {
    super.show(); // this calls A's show()
    System.out.println("k: " + k);
  }
}

=======
package com.maier.javacore.chapter08;

class B extends A {
  int k;

  B(int a, int b, int c) {
    super(a, b);
    k = c;
  }

  void show() {
    super.show(); // this calls A's show()
    System.out.println("k: " + k);
  }
}

>>>>>>> 14106646e2c2880ee80f2cdfe1c68370e7618f78
