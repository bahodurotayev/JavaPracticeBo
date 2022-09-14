package Day9.Practice;

public class Bahodur {
    public static void main(String[] args) {

        String price = "$5.25";
        String qty = "5";
        // write a java program to calculate total price

        String removeS = price.replaceAll("[^\\d.]", "");
        Double total = Double.parseDouble(removeS)+ Double.parseDouble(qty);
        System.out.println(total);

        String str = "123Bahodur123";
        int i = Integer.parseInt(str.replaceAll("[^\\d.]", ""));
        System.out.println(i);

    }
}
