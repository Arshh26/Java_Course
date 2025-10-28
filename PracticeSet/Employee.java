public class Employee {

        String name;
        int age;
        String department;
        int salary;

        void displayDetails() {
            System.out.println(name);
            System.out.println(age);
            System.out.println(department);
            System.out.println(salary);

    }

    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.name = "Arshad";
        e1.age = 21;
        e1.department = "IT";
        e1.salary = 55000;

        Employee e2 = new Employee();
        e2.name = "Shameem";
        e2.age = 19;
        e2.department = "Software Engineer";
        e2.salary = 45000;

        e1.displayDetails();
        e2.displayDetails();


    }


}
