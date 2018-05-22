package Practica_7_1;

public class Exercitiul_7_1 {

        public static void main(String[] args) {
            String custName = "Steve Smith";
            String firstName;
            int spaceIdx;
            spaceIdx=custName.indexOf(' ');
            System.out.println(spaceIdx);

            firstName=custName.substring(spaceIdx,11);
            System.out.println(firstName);
}}
