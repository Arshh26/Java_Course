package Collection_Generics.SetInterfaces;

import Collection_Generics.Utility;

import java.util.HashSet;
import java.util.Set;

public class TestingSet {
    public static void main(String[] args) {
        Set<String> names = new HashSet<>();
        System.out.println(names.add("Arshad Ali"));
        System.out.println(names.add("Abid Ali"));
        System.out.println(names.add("Hosangadi"));

        Utility.print(names);
        System.out.println(names.add("Me"));
        System.out.println(names.size());
        Utility.print(names);

        System.out.println(names.contains("Arshad Ali"));
        System.out.println(names.remove("Arshad Ali"));
        Utility.print(names);
        System.out.println(names.remove("Arshad Ali"));

    }
}
