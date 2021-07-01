package goit.homework.client;

import goit.homework.shop.ShopStorage;

public class Main {
    public static void main(String[] args) {
ShopStorage shopStorage = new ShopStorage();
double costBucket = shopStorage.calculateTotalCost("A A A");

        System.out.println(costBucket);
    }
}
