package encapsulation;

public class EncapsulationPrac {
    private String name;

    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
       return name;
    }

    public void setAge(int age) {
        if (age > 18) {
            System.out.println("Your are elgible for licence");
        } else {
            System.out.println("Please, Ride a cycle");
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }


    public static void main(String[] args) {
        EncapsulationPrac prac = new EncapsulationPrac();
        prac.setName("Arshad");
        System.out.printf("Your Name is %s \n", prac.getName());
        prac.setAge(19);
        System.out.println("Your age is " + prac.getAge() + "\n");

    }


}
