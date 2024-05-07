package Homework;

import java.util.List;

public class Main {
    public static void main(String[] args) {
    YardSale yardSale= new YardSale();
    yardSale.yardSaleWholeSale("Ball",2,5);



    List<String> items=new java.util.ArrayList<>();
        items.add("Dog");
        items.add("Cat");
        items.add("Lion");
        items.add("Tiger");

        for (String item :items){
    if (item.contains("Dog"))
        System.out.println(item);
}
        boolean removedMedium = items.remove("Cat");
        System.out.println("Removed Cat result: " + removedMedium);
        System.out.println(items);

        boolean addsnake =items.add("Snake");
        items.add("Bee");

        items.sort(null);
        System.out.println(items);


        List<String> firstTwo=items.subList(0,2);
        int remaining=items.size()-2;
        System.out.println(firstTwo);
        System.out.println("And " +remaining+ " more.");
        List<String> remainingUrls = items.subList(2, items.size());
        System.out.println(remainingUrls);


        }


    }

