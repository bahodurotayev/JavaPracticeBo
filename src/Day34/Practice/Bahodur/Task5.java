package Day34.Practice.Bahodur;

import java.util.*;

public class Task5 {
    /* Task 5
        Given two ArrayList<String>
        the data of the lists are as below:
        {Andrea, Bahridin, Anthony, Arthur, Ufuk, Sebahattin, Dilnoza, Tohir, Besime, Malika, Mustafa, Ibrahim, Mehmet Ali}
        {(570) 899-6329, (885) 553-4829, (677) 374-5873, (513) 224-9164, (958) 338-2735, (398) 619-7665,
        (434) 494-4764, (229) 230-5207, (463) 612-2498, (388) 829-6837, (832) 305-6110, (445) 553-6905, (490) 849-4996}

        1. Create a method which will have parameter as two ArrayList<String>`s
           Add names and phone numbers to the map and return it.
           note: the phone number of a person has been stored under the same index where the persons name is.
           Example:
           Sebahattin is in the index 5. His phone number should be also in the index 5 ( (398) 619-7665 )

        2. Create a method which will have a parameter as a HashMap<String, String> and return type is a String.
           Using Scanner class, provide the name of a Student.
           The method should return the phone number of a Student.
           If Student doesn`t exist, return "Wrong number"*/


    static String provideName(HashMap<String, String> map){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name please : ");
        String name = scan.nextLine();
        System.out.println();
        Set<String> set = map.keySet();
        for (String each: set) {
            if(name.equalsIgnoreCase(each)){
                return name + " phone number is :" + map.get(name);
            }
        }
        return "Does not exist";
    }
    static String provideName2(HashMap<String, String> map){

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter name please : ");
        String name = scan.nextLine();
        System.out.println();
        for (Map.Entry<String, String> eachName: map.entrySet()) {
            if(name.equalsIgnoreCase(eachName.getKey())){
                return name + " phone number is :" + map.get(name);
            }
        }
        return "Does not exist";
    }

    static HashMap<String, String>phoneBook(ArrayList<String> name, ArrayList<String> number ){
        HashMap<String, String> phoneBook = new HashMap<>();

        for (int i = 0; i <name.size() ; i++) {
            phoneBook.put(name.get(i), number.get(i));
        }
        return phoneBook;
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Andrea", "Bahridin", "Anthony", "Arthur", "Ufuk", "Sebahattin", "Dilnoza", "Tohir",
                "Besime", "Malika", "Mustafa", "Ibrahim", "Mehmet"));

        ArrayList<String> numbers = new ArrayList<>(Arrays.asList("(570) 899-6329", "(885) 553-4829", "(677) 374-5873", "(513) 224-9164", "(958) 338-2735", "(398) 619-7665",
                "(434) 494-4764", "(229) 230-5207", "(463) 612-2498", "(388) 829-6837", "(832) 305-6110", "(445) 553-6905", "(490) 849-4996"));

        HashMap<String, String> phoneBook = phoneBook(names, numbers);
        //System.out.println(provideName(phoneBook));
        System.out.println(provideName2(phoneBook));


        System.out.println();
    }
}
