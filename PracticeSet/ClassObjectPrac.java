public class ClassObjectPrac { //outer class
    class student {
        String name;
        int age;
        String sub;
        int salary;
    }

    public static void main(String[] args) {
        ClassObjectPrac obj = new ClassObjectPrac(); // outer class object
        student s1 = obj.new student();
        s1.name = "Arshad";
        s1.age = 21;
        s1.sub = "English";
        s1.salary = 40000;

        System.out.println(s1.name);
        System.out.println(s1.age);
         }
     }










