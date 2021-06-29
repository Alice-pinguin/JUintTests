package goit.homework.client;

import goit.homework.shop.ShopStorage;

public class Main {
    public static void main(String[] args) {
ShopStorage shopStorage = new ShopStorage();
double costBucket = shopStorage.calculateTotalCost("gh jd a");

        System.out.println(costBucket);
    }
}
