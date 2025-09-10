public class IfLearning {
    public static void main(String[] args) {
        boolean isMale = false;
        String name = "Arshad";

        if (isMale) {
            System.out.println("Mr. " + name);
        } else {
            System.out.println("Gender Not Found");
    }
        boolean isSeniorCitizen = false;
        boolean isAdult = false;

        if(isSeniorCitizen) {
            System.out.println("Hellow, Senior Citizen");
        } else if (isAdult) {
            System.out.println("Hellow, Adult!!");
        } else {
            System.out.println("Hello Children");
        }
    }
}
