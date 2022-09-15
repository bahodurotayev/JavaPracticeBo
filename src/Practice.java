public class Practice {
    public static void main(String[] args) {


      //  System.out.println(createVarargs("10", "asd", "10"));
        int count = (countString("baha", "baha", "baha", "baha"));
        System.out.println(count);

    }
   static double returnToDouble(String str){
        return Double.parseDouble(str);
    }

    static String removeChar(String str){
        return str.replaceAll("^[\\d.]", "");
    }
    static boolean ifStringEmpty(String str){
        if(str.isEmpty())
            return true;
        return false;
    }
//    static double createVarargs(String... str){
//        double total = 0;
//
//
//        for (int i = 0; i <str.length ; i++) {
//            removeChar(str[i]);
//            if(str[i].equals("")){
//                str[i] = "-10";
//            }
//            returnToDouble(str[i]);
//            double dl =returnToDouble(str[i]);
//            total+=dl;
//        }
//
//        return total;
//    }

    static boolean isEqual(String str2, String str){

        return str2.toLowerCase().equals(str.toLowerCase());
    }

  static  int countString(String str, String... str2) {
      int count = 0;
      for (int i = 0; i < str2.length; i++) {
          if (isEqual(str, str2[i])) {
              count = count+1 ;
          }

      }
      return count;
  }
}
