package Practica_7_2;

public class Exercitiul_7_2 {
    public static void main(String[] args) {
        String custName = "Steve Smith";
        String firstName;
        int spaceIdx;
        spaceIdx=custName.indexOf(' ');
        System.out.println(spaceIdx);

        firstName=custName.substring(0,spaceIdx);
        System.out.println(firstName);
        StringBuilder sb=new StringBuilder(firstName);
        sb.append(" Smith");
        System.out.println(sb);
        //sb.append(custName+firstName);
        //System.out.println(sb);
    }}

