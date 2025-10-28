public class Concatenation {
    public static void main(String[] args) {
        String myString = "My name is Arshad Ali.";
        String yourName = "What is Your Name ?.";
        String fullSentence = myString.concat(" ").concat(yourName);
        System.out.println(fullSentence.toUpperCase());
    }
}
