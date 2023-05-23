<<<<<<< HEAD
package com.maier.javacore.chapter09;

class TestIface2 {
  public static void main(String args[]) {
    Callback c = new Client();
    AnotherClient ob = new AnotherClient();

    c.callback(42);

    c = ob; // c now refers to AnotherClient object
    c.callback(42);
  }
}

=======
package com.maier.javacore.chapter09;

class TestIface2 {
  public static void main(String args[]) {
    Callback c = new Client();
    AnotherClient ob = new AnotherClient();

    c.callback(42);

    c = ob; // c now refers to AnotherClient object
    c.callback(42);
  }
}

>>>>>>> 14106646e2c2880ee80f2cdfe1c68370e7618f78
