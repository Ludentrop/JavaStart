<<<<<<< HEAD
package com.maier.javacore.chapter07;

class VarArgs2 {
 
  // Here, msg is a normal parameter and v is a 
  // varargs parameter. 
  static void vaTest(String msg, int ... v) { 
    System.out.print(msg + v.length + 
                       " Contents: "); 
 
    for(int x : v) 
      System.out.print(x + " "); 
 
    System.out.println(); 
  } 
 
  public static void main(String args[])  
  { 
    vaTest("One vararg: ", 10); 
    vaTest("Three varargs: ", 1, 2, 3);  
    vaTest("No varargs: ");  
  } 
}

=======
package com.maier.javacore.chapter07;

class VarArgs2 {
 
  // Here, msg is a normal parameter and v is a 
  // varargs parameter. 
  static void vaTest(String msg, int ... v) { 
    System.out.print(msg + v.length + 
                       " Contents: "); 
 
    for(int x : v) 
      System.out.print(x + " "); 
 
    System.out.println(); 
  } 
 
  public static void main(String args[])  
  { 
    vaTest("One vararg: ", 10); 
    vaTest("Three varargs: ", 1, 2, 3);  
    vaTest("No varargs: ");  
  } 
}

>>>>>>> 14106646e2c2880ee80f2cdfe1c68370e7618f78
