package Day38.Task3;

public class Shirt {

    public static String color;
    public static char size;
    void putOn(){
        System.out.println("Shirt is On");
    }
    void putOff(){
        System.out.println("Shirt is off");
    }
    void setColor(String newColor){
        color = newColor;
    }
    void  setSize(char newSize){
        size = newSize;
    }
}
