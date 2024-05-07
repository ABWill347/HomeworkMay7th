package Homework;


import java.util.Date;

public class YardSale {

    public void yardSaleWholeSale(String name, int quantity,double price ){
            double total =quantity*price;
            Date today= new Date();

        String t = "%-10s %-10s %-10s %-10s%n";
        System.out.printf(t,"Name","Qty","Price","Total");
        System.out.printf(t,"---- ","---","------","-----" );

    String l="$%.1f";
    String p="$%.2f";
        System.out.printf(t, name, quantity, String.format(l, price), String.format(p, total));
        String n="%30s%n";
        System.out.println(" ");
        System.out.printf(n,"Thank you come again !!!");
        System.out.println(" ");
        System.out.println("Purchased on: " +today );



    }
}
