package Day38.Task1;

import java.util.ArrayList;

public class Product {
    String productName;
    int productQty;
    double productPrice;

    public Product getProductDetails(String productName, int qty, double price) {
        Product product = new Product();
        product.productName = productName;
        product.productQty = qty;
        product.productPrice = price < 0 ? 0 : price;

        return product;
    }

    public void print(ArrayList<Product> cart){
        System.out.println("Items in the cart : ");
        for(Product product : cart){
            System.out.println(product.productName + " : "
                    + product.productQty + " * $"
                    + product.productPrice + "; ");
        }
    }
}
