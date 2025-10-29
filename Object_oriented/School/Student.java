package School;

public class Student {
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student details: Name: " + name +
                ", age: " + age +
                ",";
    }

    public static void main(String[] args) {
        Student s1 = new Student("Arshad", 21);
//        s1.name = "Arshad";
//        s1.age = 21;

        Student s2 = new Student("Shameem", 21);
//        s2.name = "Shameem";
//        s2.age = 21;

        System.out.println(s1);
        System.out.println(s2);
    }
}
