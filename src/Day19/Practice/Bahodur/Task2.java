package Day19.Practice.Bahodur;

public class Task2 {
          /*Task2

        Write a Java program to test if an array contains a specific value.
        int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
                1458, 2458, 1254, 1472, 2365,
                1456, 2265, 1457, 2456};
                int n = 1789;
                Output: true
        * */
          public static void main(String[] args) {
              int[] my_array1 = {1789, 2035, 1899, 1456, 2013,
                      1458, 2458, 1254, 1472, 2365,
                      1456, 2265, 1457, 2456};
              int n = 1456;
              boolean bl = false;

              for (int i = 0; i <my_array1.length ; i++) {
                  if (n != my_array1[i]) {
                      continue;
                  }else {
                      bl = true;
                  }
              }
              System.out.println(bl);
          }
}
