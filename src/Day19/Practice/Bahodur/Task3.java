package Day19.Practice.Bahodur;

public class Task3 {
        /*Task3
        //Task2 Write a Java program to calculate the average value of array elements.
        int [] numArr = {12, 35, 58, 78, 96, 12};
        * */
        public static void main(String[] args) {
            int [] numArr = {12, 35, 58, 78, 96, 12};
            int total = 0;

            for (int i = 0; i <numArr.length ; i++) {
                 total = total + numArr[i];
            }
            double avg = (double)total/numArr.length;
            System.out.println(avg);
        }
}
