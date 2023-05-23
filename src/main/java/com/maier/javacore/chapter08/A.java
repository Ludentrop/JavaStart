<<<<<<< HEAD
package com.maier.javacore.chapter08;

class A {
  final void meth() {
    System.out.println("This is a final method.");
  }
}

class B extends A {
  void meth() { // ERROR! Can't override.
    System.out.println("Illegal!");
  }
}

=======
package com.maier.javacore.chapter08;

class A {
  final void meth() {
    System.out.println("This is a final method.");
  }
}

class B extends A {
  void meth() { // ERROR! Can't override.
    System.out.println("Illegal!");
  }
}

>>>>>>> 14106646e2c2880ee80f2cdfe1c68370e7618f78
