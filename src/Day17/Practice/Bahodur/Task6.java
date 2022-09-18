package Day17.Practice.Bahodur;

public class Task6 {
    public static void main(String[] args) {

    // return how many x, y and z appears in that string.
        String str = "xyz";
        String str2 = "utsuyajtdxkygzmegxydzipyhdmghzhdcxbxlzygjtxzqmgyahmxyugmvbzwang";

        String duplicate = "";

        for (int i = 0; i <str.length() ; i++) {
            int count = 0;
            for (int j = 0; j <str2.length() ; j++) {
                if(str.charAt(i) == str2.charAt(j)) {
                    count++;
                }
            }
            System.out.println(str.charAt(i) + " = " + count);
        }
    }
}
