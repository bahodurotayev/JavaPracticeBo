package Day37.HomeWorkBahodur.Task3;

import java.util.ArrayList;

public class Shop {
    public static void main(String[] args) {

        Product product1 = createProduct("Iphone", 2, 800);
        Product product2 = createProduct("MacBook", 1, 400);
        Product product3 = createProduct("Ipad", 3, 300);
        Product product4 = createProduct("AirPod", 2, 100);

        ArrayList<Product>productList = new ArrayList<>();
        productList.add(product1);
        productList.add(product2);
        productList.add(product3);
        productList.add(product4);


        Consumer consumer1 = createConsumer("Wick", productList);
        printConsumer(consumer1);




    }
    static Product createProduct(String productName, int productQty, double productPrice){

        Product product = new Product();

        product.productName = productName;
        product.productQty = productQty;
        product.productPrice = productPrice ;
       // product.productPrice = productPrice < 0 ?  0 : product.productPrice ;

        if (product.productPrice < 0){
            product.productPrice = 0;
        }

        return product;
    }

    static double getTotal (ArrayList<Product> products){

        double getTotal = 0;

        for (int i = 0; i <products.size() ; i++) {

            getTotal += products.get(i).productQty * products.get(i).productPrice;

        }

        return getTotal;
    }

/*    static Consumer createConsumer(String name,  Product product){

        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.product = product;

        return consumer;
    }*/

    static  Consumer createConsumer (String name ,ArrayList<Product> product){

        Consumer consumer = new Consumer();
        consumer.name = name;
        consumer.products = product;
        consumer.balanceDue = getTotal(product);

        return consumer;
    }

    static void printList(ArrayList<Product> products){

        for (int i = 0; i <products.size() ; i++) {

            System.out.println(products.get(i).productName + " : " + products.get(i).productQty + " : " + products.get(i).productPrice);
        }
    }


    static void printConsumer (Consumer consumer){

        System.out.println(consumer.name);
        printList(consumer.products);

        System.out.println(consumer.balanceDue);

    }
}
