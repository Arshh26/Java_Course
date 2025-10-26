public class ForEach {
    public static void main(String[] args) {
        String[] array = new String[] {
                "Arshad", "Nishat", "Shameem", "Halima", "Rehaman", "Hafiz"
        };
        printForEach(array);


    }
    public static void printForEach(String[] array) {
        for (String name: array) {
            System.out.println(name);
        }
    }
}
