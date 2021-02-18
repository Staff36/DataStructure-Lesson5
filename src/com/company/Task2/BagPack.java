package com.company.Task2;

import java.util.ArrayList;
import java.util.List;

public class BagPack {
    private List<Item> betterList;
    private int capacity;
    private int bestPrice;

    public int getCapacity() {
        return capacity;
    }

    public BagPack(int capacity){
        this.capacity = capacity;
    }

    public List<Item> getBestSet(List<Item> items){
        int sumWeight = 0;
        int sumPrice = 0;
        if (items.size() > 0) {
            for (Item i : items) {
                sumWeight += i.getWeight();
                sumPrice += i.getPrice();
            }
        }
        if (betterList == null) {
            if (sumWeight <= capacity) {
                betterList = items;
                bestPrice = sumPrice;
            }
        }else {
            if (sumWeight <= capacity && sumPrice > bestPrice) {
                betterList = items;
                bestPrice = sumPrice;
            }
        }

        for (int i = 0; i < items.size(); i++){
            List<Item> newSet = new ArrayList<Item>(List.copyOf(items));
            newSet.remove(i);
            getBestSet(newSet);
        }
        return betterList;
    }
}


