/* Copyright © 2016 Oracle and/or its affiliates. All rights reserved. */

package practice_04_1;

public class ShoppingCart {
    public static void main(String[] args){
        // Declare and initialize String variables.  Do not initialize message yet.
      String custName="Mary Smith",itemDesc="wants to purchase=",message;
      double price=20.53,tax=3.90,total;
      int quantity=5;
      total=quantity*20.53*3.90;

        // Assign the message variable

        message=custName+" "+itemDesc;
        // Print and run the code
System.out.print(message);
System.out.print(total);
    }
}
