package Day16.Practice.Bahodur;

public class Task7 {
    /*
    Hello World
    print each character, but 'l'
     */
    public static void main(String[] args) {

    String str = "Hello World";
        for (int i = 0; i <str.length() ; i++) {

            if(str.charAt(i) == 'l'){
                continue;
            }
            System.out.print(str.charAt(i));
        }
        System.out.println();

        int count = 0;
        while (count < str.length()){
            if (str.charAt(count) == 'l'){
                count++;
                continue;
            }

            System.out.print(str.charAt(count));
            count++;
        }
    }
}
