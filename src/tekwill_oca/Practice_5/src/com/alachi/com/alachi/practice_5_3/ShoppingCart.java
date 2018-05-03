package com.alachi.com.alachi.practice_5_3;

public class ShoppingCart {
    public static void main(String[] args) {
        String custName="Mary Smith";
        String message;
                String[]
items=new String[4];
    items[0]="Shirt";
    items[1]="trousers";
    items[2]="skirt";
    items[3]="socks";
    message=custName+"wants to purchase"+items.length+"items.";
        System.out.println(message);
        System.out.println("Items purchased: ");
        for(String item:items){
            System.out.println(item+",");
        };

    }
}
