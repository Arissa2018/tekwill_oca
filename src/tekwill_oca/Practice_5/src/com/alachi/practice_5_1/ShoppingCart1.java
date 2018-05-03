package com.alachi.practice_5_1;



public class ShoppingCart1{
    public static void main(String[] args) {
       String custName="Mary Smith";
       String itemDesc="Shirt";
       String message;

       double price=2.3;
       int quantity=2;
       double tax=1.04;
       double total;

       total=price*quantity*tax;
       message=custName+" wants to purchase "+quantity+" "+itemDesc;
        if (quantity>1){
           message=message+"s";}
boolean OutOfStocks=false;
        if(OutOfStocks){
            System.out.println(itemDesc+ "is out of stock." );
        }
        else {
            System.out.println(message);
            System.out.println("Total cost is"+total);
        }


    }
}
