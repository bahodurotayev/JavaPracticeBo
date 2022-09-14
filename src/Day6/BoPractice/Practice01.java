package Day6.BoPractice;

public class Practice01 {
    public static void main(String[] args) {
        //    TASK1: Write a program, which prints out the text, its length and char representation of the length
        //TEXT:  ASCII stands for American Standard Code for Information Interchange.
        //      NOTE: Text should be in double quotes. Character should be in single quotes.

        String str = "Bahodur";
        int textLength = str.length();

        System.out.println(str);
        System.out.println("Text length = " + textLength);

        char lengthToChar = (char) textLength;

        System.out.println(lengthToChar);

        StringLengthValue("ASCII stands for American Standard Code for Information Interchange.");
        StringLengthValue("Dushanbe is very beautiful city");
        StringLengthValueConcat("ASCII stands for American Standard Code for Information Interchange.");

    }
    public static void StringLengthValue (String name){
        int nameLength = name.length();
        System.out.println(nameLength);
        char charValue =(char) nameLength;

        System.out.println(charValue);

    }

    public  static void StringLengthValueConcat (String name){
        //  TASK2: Write a program, which adds to the text, its length and char representation of the length (use String method: concat())
//      TEXT:  Computers can only understand numbers, so an ASCII code is the numerical representation of a characters.
//      NOTE: Print out each value in separate line. Character should be in single quotes.
        int nameLength = name.length();
       // System.out.println("Text Length is ->" + nameLength);
        char ch1 = (char)nameLength;



        System.out.println(""+name.concat(""+nameLength) .concat(""+ch1));


    }
}
