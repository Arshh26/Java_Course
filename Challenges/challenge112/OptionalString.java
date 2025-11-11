package challenge112;

import java.util.Optional;

public class OptionalString {
    public static void main(String[] args) {
        System.out.println(toOtional(null));
        System.out.println(toOtional(""));
        System.out.println(toOtional("pop"));
    }

    public static Optional<String> toOtional (String str) {
        if (str == null || str.isEmpty()) {
            return Optional.empty();
        }
        return Optional.of(str.toUpperCase());
    }
}
