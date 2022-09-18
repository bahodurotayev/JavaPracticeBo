package Day17.Practice.Bahodur;

public class Task2 {
    public static void main(String[] args) {
        /*
    utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang
    print every character and count how many times it appears in the string
     */
        String str = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang";
        String duplicate = "";
        for (int i = 0; i <str.length() ; i++) {
            char current =(str.charAt(i));
            if(duplicate.contains(String.valueOf(current))){
                continue;
            }
            duplicate +=current;

            int count = 0;
            for (int j = 0; j <str.length() ; j++) {

                if (current == str.charAt(j)){
                    count++;
                }
            }
            System.out.println(current + " = " + count);
        }

    }
}
