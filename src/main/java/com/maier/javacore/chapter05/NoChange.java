<<<<<<< HEAD
package com.maier.javacore.chapter05;

class NoChange {
  public static void main(String args[]) {   
    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };   
  
    for(int x : nums) {   
      System.out.print(x + " ");  
      x = x * 10; // no effect on nums 
    }   
    
    System.out.println(); 
 
    for(int x : nums)  
      System.out.print(x + " ");  
 
    System.out.println(); 
  }   
}

=======
package com.maier.javacore.chapter05;

class NoChange {
  public static void main(String args[]) {   
    int nums[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };   
  
    for(int x : nums) {   
      System.out.print(x + " ");  
      x = x * 10; // no effect on nums 
    }   
    
    System.out.println(); 
 
    for(int x : nums)  
      System.out.print(x + " ");  
 
    System.out.println(); 
  }   
}

>>>>>>> 14106646e2c2880ee80f2cdfe1c68370e7618f78
