package Day16.Practice.Bahodur;

public class Task1 {
    public static void main(String[] args) {
         /*
    When a break statement is
    encountered inside a loop, the loop
    is immediately terminated and the
    program control resumes at the next
    statement following the loop.
     */
        int num = 10;
        for (int i = 0; i <num ; i++) {
            System.out.println(i);
            if(i==6){
                break;
            }
        }
        System.out.println();
        for (int i = 0; i <10 ; i++) {
            System.out.print(i);
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                System.out.print(i);
            }
        }

        System.out.println();

        for (int i = 0; i < 10; i++) {
            if(i%2==0){
                continue;
            }
            System.out.print(i);
        }

         /*
        return new string which is reversed of str
         */
        System.out.println("\n");

        String str = "Java";
        String newStr="";

        for (int i = str.length()-1; i >=0 ; i--) {
             newStr +=str.charAt(i);

        }
        System.out.print(newStr);
    }
}
