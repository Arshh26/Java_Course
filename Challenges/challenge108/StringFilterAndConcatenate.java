package challenge108;

import java.util.List;

public class StringFilterAndConcatenate {
    public static void main(String[] args) {
        List<String> strs = List.of("Arshad", "good", "bad", "Ali Learning", "java from", "Kg coding", "Channel", "on",
                "YouTube", "This is", "best", "course", "on youTube");
        String result= strs.stream()
                .filter(str -> str.length() > 5)
                .reduce("", (a,b) -> a + " " + b);

        System.out.println(result);

    }
}
