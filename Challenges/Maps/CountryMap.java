package Maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class CountryMap {
    public static void main(String[] args) {
        Map<String, String> countryMap = new HashMap<>();
        countryMap.put("India", "New Delhi");
        countryMap.put("China", "Beijing");
        countryMap.put("Pakistan", "Islamabad");
        countryMap.put("Sri-lanka", "Columbo");
        countryMap.put("Bangladesh", "Dhaka");

        Scanner input = new Scanner(System.in);
        System.out.println("Please, Enter the country name: ");
        String country = input.next();
        if (countryMap.containsKey(country)) {
            System.out.printf("Captital of %s is %s", country, countryMap.get(country));
        } else {
            System.out.println("Sorry we dont know the capital");
        }
    }
}
