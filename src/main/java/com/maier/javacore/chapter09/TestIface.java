package com.maier.javacore.chapter09;

class TestIface {
  public static void main(String args[]) {
    Callback c = new Client();
    c.callback(42);
  }
}

