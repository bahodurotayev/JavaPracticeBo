package Day56.Bahodur.Task1;

public class Task3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Java");
        String str = "Java";

        if(sb.toString().equals(str)){
            System.out.println("Match1");
        }else if (sb.equals(str)){
            System.out.println("match2");
        }else {
            System.out.println("No match");
        }
    }
}
