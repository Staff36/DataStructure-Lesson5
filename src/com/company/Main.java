package com.company;

import com.company.Task2.BagPack;
import com.company.Task2.Item;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//Task1
        System.out.println("Task 1:\nExample 1 (2^4):");
        System.out.println("\t"+recursionExponentiation(2,4));
        System.out.println("Example 2 (-3^-2): ");
        System.out.println("\t"+recursionExponentiation(-2,-2));
        System.out.println("Example 3 (2^0): ");
        System.out.println("\t"+recursionExponentiation(2,0));
        System.out.println("Example 4 (0^-1): ");
        System.out.println("\t"+recursionExponentiation(0,-1));
//Task2
        System.out.println("\nTask 2: ");
        BagPack bagpack= new BagPack(35);
        displayResult(bagpack.getBestSet(createListOfItems()),bagpack);
    }
//Method for Task1
    public static float recursionExponentiation(float value, float exponent){
    return exponent>=0?
          (exponent==1?value:recursionExponentiation(value,--exponent)*value):
          (exponent==-1?1/value:recursionExponentiation(value,++exponent)*1/value);
    }

//Support Methods for Task 2
    public static List<Item> createListOfItems(){
        List<Item> items = new ArrayList<>();
        items.add(new Item("Guitar",20,40));
        items.add(new Item("Piano",30,40));
        items.add(new Item("Xilophone",10,30));
        items.add(new Item("NoteBook", 10,600));
        return items;
    }

    public static void displayResult(List<Item> result, BagPack bagPack){
        int sumWeight = 0;
        int sumPrice = 0;
        for (Item item:result) {
            sumPrice+=item.getPrice();
            sumWeight+=item.getWeight();
        }
        System.out.println("\t"+result);
        System.out.println( "\n\tBackPack capacity: "+bagPack.getCapacity() +
                            "\n\tTotal cost of goods: "+sumPrice            +
                            "\n\tTotal weight of goods: "+sumWeight);
    }

}
