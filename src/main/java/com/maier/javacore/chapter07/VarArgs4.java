<<<<<<< HEAD
package com.maier.javacore.chapter07;

class VarArgs4 {
 
  static void vaTest(int ... v) { 
    System.out.print("vaTest(Integer ...): " + 
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
 
 
  public static void main(String args[])  
  { 
    vaTest(1, 2, 3);  // OK 
    vaTest(true, false, false); // OK 
 
    vaTest(); // Error: Ambiguous! 
  } 
}
=======
package com.maier.javacore.chapter07;

class VarArgs4 {
 
  static void vaTest(int ... v) { 
    System.out.print("vaTest(Integer ...): " + 
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
 
 
  public static void main(String args[])  
  { 
    vaTest(1, 2, 3);  // OK 
    vaTest(true, false, false); // OK 
 
    vaTest(); // Error: Ambiguous! 
  } 
}
>>>>>>> 14106646e2c2880ee80f2cdfe1c68370e7618f78
