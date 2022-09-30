package Day38.Task1;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {

        Consumer consumerObject = new Consumer();
        Product product = new Product();

        ArrayList<Product> cart = new ArrayList<>();
        Product phone = product.getProductDetails("phone", 2, 500);
        Product laptop = product.getProductDetails("MacBook Pro", 1, 1700);
        Product tv = product.getProductDetails("LG", 1, 500);
        Product tablet = product.getProductDetails("IPad", 2, 850);
        cart.add(phone);
        cart.add(laptop);
        cart.add(tv);
        cart.add( tablet);

        ArrayList<Product> cart2 = new ArrayList<>();
        cart2.add(phone);
        cart2.add(laptop);



        Consumer consumer = consumerObject.getConsumerDetails("Ali",cart);
        consumerObject.print(consumer);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        Consumer consumer2 = consumerObject.getConsumerDetails("John",cart2);
        consumer2.print(consumer2);


    }

}
