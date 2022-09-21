package Day23.Practice.Bahodur;

public class Task2 {
    public static void main(String[] args) {
        // create a method. return type is boolean. takes one String parameter.
        // Validate if a given String has at least 8 characters.

        Task2 t2 = new Task2();
        String str = "Bahodur111";
        System.out.println("str = " + str.length());
        System.out.println(t2.validateString(str));

    }
    boolean validateString(String str){
          boolean check = false;
          if(str.length() >=8){
              check = true;
          }
          return check;
    }
}
