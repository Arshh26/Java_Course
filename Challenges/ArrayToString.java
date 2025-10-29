public class ArrayToString {
    public static void main(String[] args) {
        String[] arr = new String[] {"My", "name", "is", "Arshad Ali,", "i am", "from sirsi", "karnataka."};
        StringBuilder sb = new StringBuilder();
        for (String con : arr) {
            sb.append(con).append(" ");
        }
        System.out.println(sb);
    }
}
