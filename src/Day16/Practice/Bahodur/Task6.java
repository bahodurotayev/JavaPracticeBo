package Day16.Practice.Bahodur;

public class Task6 {
    public static void main(String[] args) {
        /*
    String str = "Java is Fun";
    print all characters. if character is F, break the loop. don print F
     */
        String str = "Java is Fun";

        for (int i = 0; i <str.length() ; i++) {

            if(str.charAt(i) == 'F') {
                continue;
            }
            System.out.print(str.charAt(i));
        }
    }
}
