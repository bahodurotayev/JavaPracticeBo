package Day53.Bahodur.Task1;

public class App {
    public static void main(String[] args) {
        Fruit fruit = new Fruit();
        fruit.setName("Fruit");
        fruit.setPrice(200);
        fruit.setColor("Any color");

        System.out.println(fruit);

        Apple apple = new Apple();
        apple.setName("Red Apple");
        apple.setColor("RED");
        apple.setDiscount(15);
        apple.setPrice(100); // 100 - 100*0/100
        System.out.println(apple);

        Banana banana = new Banana();
        banana.setName("Baby Banana");
        banana.setColor("Yelow");
        banana.setPrice(80);
        banana.setStoreAddress("Key Food 123 st");
        System.out.println(banana);

        Strawberry strawberry = new Strawberry();
        strawberry.setName("organic Strawberry");
        strawberry.setColor("REd");
        strawberry.setPrice(30);
        strawberry.setBrand("Discount");
        strawberry.setOwner("Rafik");
        System.out.println(strawberry);

    }
}
