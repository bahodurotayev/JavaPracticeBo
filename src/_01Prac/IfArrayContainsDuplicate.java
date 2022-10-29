package _01Prac;

public class IfArrayContainsDuplicate {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 0, 5, 6, 7};
        Boolean aBoolean = ifArrayContainsDuplicateElement(arr);
        System.out.println(aBoolean);
    }
    static Boolean ifArrayContainsDuplicateElement (int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i] == arr[j] && i != j){
                    return false;
                }
            }
        }
        return true;
    }
}
