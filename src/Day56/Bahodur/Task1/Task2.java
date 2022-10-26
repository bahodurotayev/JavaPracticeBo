package Day56.Bahodur.Task1;

public class Task2 {
    public static void main(String[] args) {
        System.out.println("Hello" + new StringBuilder("Java 8"));
        System.out.println("Hello" + new MyString("Java 8"));
    }
}
class MyString{
    String str;

    public MyString(String s){
        this.str = s;
    }

    @Override
    public String toString() {
        return "MyString{" +
                "str='" + str + '\'' +
                '}';
    }
}
