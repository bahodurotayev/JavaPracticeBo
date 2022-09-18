package Day19.Practice.Bahodur;

public class Task1 {
    public static void main(String[] args) {
        // Task1 Create integer array 12, 10, 23, 5, 0, 87
        // Print each element of the array
        // Print the total of the numbers in array

        int numArr[] = {12, 10, 23, 5, 0, 87};
        int total = 0;
        for (Integer echNum:numArr
             ) {
            System.out.print(echNum + " ");
            total +=echNum;
        }
        System.out.println("\ntotal = " + total);
    }
}
