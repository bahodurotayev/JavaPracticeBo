package Day17.Practice.Bahodur;

public class Task3 {

    public static void main(String[] args) {

        String str = "utsuajtdxkgmegdziphdmghhdcbxlzgjtxqmgahmugmvbzwang";
        String avoidDup = "";

        for (int i = 0; i < str.length(); i++) {
            char current = str.charAt(i);
            if (avoidDup.contains(String.valueOf(str.charAt(i)))){
                continue;
            }
            avoidDup += current;

            String tem = str.replace(String.valueOf(current), "");
            System.out.println(current + " = " + (str.length() - tem.length()));
        }
    }
}
