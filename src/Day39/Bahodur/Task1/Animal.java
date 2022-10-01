package Day39.Bahodur.Task1;

public class Animal {
    String name;
    int speedInKilo;
    int speedInMile;
    char shortName;

    public void createAnimal(String name, int speedInMile){
        this.name = name.substring(0, 1).toUpperCase().concat(name.substring(1).toLowerCase());
        this.speedInMile = speedInMile;
    }

    public void setShortName(){
        this.shortName = this.name.charAt(0);
    }

    public void convertMile(){
        this.speedInKilo = (int)(this.speedInMile * 1.6);
    }

    @Override
    public String   toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", speedInKilo=" + speedInKilo +
                ", speedInMile=" + speedInMile +
                ", shortName=" + shortName +
                '}';
    }
}
