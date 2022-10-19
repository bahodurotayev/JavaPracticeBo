package Day51.Bahodur.Task1;

public class Travel {
    public static void travelToOcean(Weather weather){
        if(weather != Weather.HOT){
            throw new RuntimeException("Bad weather for ocean");
        }
        System.out.println("Good weather for ocean");
    }
    public static void travelToMountains(Weather weather) throws Exception {
        if(weather != Weather.WARM){
            throw new Exception("Bad weather for Mountain");
        }
        System.out.println("Good weather for Mountain");
    }

    public static void main(String[] args) throws Exception {

        //travelToMountains(Weather.HOT);

        try {
            travelToOcean(Weather.HOT);
        }catch (Exception e){
            System.out.println(e);
        }
    }
}
