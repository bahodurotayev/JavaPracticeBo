package Day23.Practice.Bahodur;

public class Task1 {
    public static void main(String[] args) {
        // create a method, which will take int[] and return the maxNum
        // create a method, which will take int[] and return the minNum
        // create a method, which will take two int parameters and calculate total of maxNum and minNum

        Task1 t1 = new Task1();
        int[] arr = new int[]{1, 5, 6, 23, 56};
        System.out.println(t1.maxNumber(arr));
        System.out.println(t1.minNumber(arr));

    }
    int maxNumber(int[] arr){
       int max = Integer.MIN_VALUE;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }

    int minNumber(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] < min){
                min = arr[i];
            }
        }
        return min;
    }
}
