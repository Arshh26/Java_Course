package Collection_Generics.ListInterfaces;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class TestingList {
    public static void main(String[] args) {
        List<String> strList = new ArrayList<>();
        strList.add("Arshad");
        strList.add("Ali");
//        strList.add(55);  integer Cant be defined


        strList.add(1, "Abid");
        strList.remove(0);

        if(strList.contains("Ali")) {
            System.out.println(strList.indexOf("Ali"));
        }

        System.out.println(strList.get(0));

        for(int i=0; i < strList.size(); i++) {
            System.out.println(strList.get(i));
        }
    }
}
  // genreics types are excutes at compile time...
