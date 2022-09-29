package Day37.HomeWorkBahodur.Task2;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {

        Product iphone = createProduct("Iphone 14proMax", 2, 1200);
        Product macBook = createProduct("MacBook", 1, 1400);
        Product ipad = createProduct("Ipad pro", 1, 800);
        Product airPod = createProduct("AirPod 2pro", 2, 300);

        ArrayList<Product> productList = new ArrayList<>();
        productList.add(ipad);
        productList.add(macBook);
        productList.add(airPod);
        productList.add(iphone);

        Consumer consumer = createConsumer("Wick", productList);
        print(consumer);
    }
    static Product createProduct(String productName, int productQty, double productPrice){
        Product product = new Product();

        product.productName = productName;
        product.productPrice = productPrice;
        product.productQty = productQty;

        return product;
    }

    static Consumer createConsumer(String name, ArrayList<Product>cart){
        Consumer consumer = new Consumer();

        consumer.name = name;
        consumer.cart = cart;
        consumer.balanceDue = getTotal(cart);

        return consumer;
    }
    static double getTotal (ArrayList<Product> products){
        double getTotal = 0;
        for (int i = 0; i < products.size(); i++) {
            getTotal += products.get(i).productPrice * products.get(i).productQty;
        }

        return getTotal;
    }
    static void print (Consumer consumer){
        System.out.print(consumer.name + " has in Cart ->\n\n");
                printCart(consumer.cart);
        System.out.println("\nBalance Due : " +consumer.balanceDue);
    }

    static void printCart(ArrayList<Product> cart){

        for (int i = 0; i < cart.size(); i++) {
            System.out.print(cart.get(i).productName + " : " + cart.get(i).productQty +" : " + cart.get(i).productPrice + "| \n");
        }
    }
}
