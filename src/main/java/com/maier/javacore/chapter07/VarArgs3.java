<<<<<<< HEAD
package com.maier.javacore.chapter07;

class VarArgs3 {
 
  static void vaTest(int ... v) { 
    System.out.print("vaTest(int ...): " + 
                     "Number of args: " + v.length + 
                     " Contents: "); 
 
    for(int x : v) 
      System.out.print(x + " "); 
 
    System.out.println(); 
  } 
 
  static void vaTest(boolean ... v) { 
    System.out.print("vaTest(boolean ...) " + 
                     "Number of args: " + v.length + 
                     " Contents: "); 
 
    for(boolean x : v) 
      System.out.print(x + " "); 
 
    System.out.println(); 
  } 
 
  static void vaTest(String msg, int ... v) { 
    System.out.print("vaTest(String, int ...): " + 
                     msg + v.length + 
                     " Contents: "); 
 
    for(int x : v) 
      System.out.print(x + " "); 
 
    System.out.println(); 
  } 
 
  public static void main(String args[])  
  { 
    vaTest(1, 2, 3);  
    vaTest("Testing: ", 10, 20); 
    vaTest(true, false, false); 
  } 
}

=======
package com.maier.javacore.chapter07;

class VarArgs3 {
 
  static void vaTest(int ... v) { 
    System.out.print("vaTest(int ...): " + 
                     "Number of args: " + v.length + 
                     " Contents: "); 
 
    for(int x : v) 
      System.out.print(x + " "); 
 
    System.out.println(); 
  } 
 
  static void vaTest(boolean ... v) { 
    System.out.print("vaTest(boolean ...) " + 
                     "Number of args: " + v.length + 
                     " Contents: "); 
 
    for(boolean x : v) 
      System.out.print(x + " "); 
 
    System.out.println(); 
  } 
 
  static void vaTest(String msg, int ... v) { 
    System.out.print("vaTest(String, int ...): " + 
                     msg + v.length + 
                     " Contents: "); 
 
    for(int x : v) 
      System.out.print(x + " "); 
 
    System.out.println(); 
  } 
 
  public static void main(String args[])  
  { 
    vaTest(1, 2, 3);  
    vaTest("Testing: ", 10, 20); 
    vaTest(true, false, false); 
  } 
}

>>>>>>> 14106646e2c2880ee80f2cdfe1c68370e7618f78
