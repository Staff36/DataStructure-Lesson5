package com.company.Task2;

public class Item {
    int weight;
    int price;
    String name;

    public Item(String name, int weight, int price ) {
        this.weight = weight;
        this.price = price;
        this.name = name;
    }
    public int getWeight() {
        return weight;
    }
    public int getPrice() {
        return price;
    }
    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return  "{Name: " + name+
                ", weight: " + weight +
                ", price: " + price+"}";
    }
}
