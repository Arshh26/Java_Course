package PracticeSet;

public class EscapeSequences {
    public static void main(String[] args) {
        // \" → Prints double quotes inside a string
        System.out.println("Hii \"Arshad\"");  //output: Hii "Arshad"

        // \t → Inserts a tab space
        System.out.println("Hii \t Arshad");  //output: Hii 	 Arshad

        // \b → Backspace (removes one character before it)
        // "s" will be removed because of \b
        System.out.println("Hii s\b \"Arshad\""); //output: Hii  "Arshad"

        // \\ → Prints a single backslash
        System.out.println("Hii \\Arshad\\");   //output: Hii \Arshad\

        // \' → Prints single quotes inside a string
        System.out.println("Hii \'Arshad\'"); //Output: Hii 'Arshad'
    }
}
