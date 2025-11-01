public class EmployeeTwo {
    static int nextId = 0;

    int empId;
    String name;


    EmployeeTwo(String name) {
        nextId++;
        this.empId = nextId;
        this.name = name;
    }

    void display() {
        System.out.println(name +" "+ empId);
    }

         public static void main(String[] args){
            EmployeeTwo e1 = new EmployeeTwo("Arshad");
            EmployeeTwo e2 = new EmployeeTwo("Ali");
            EmployeeTwo e3 = new EmployeeTwo("Abid");

            e1.display();
            e2.display();
            e3.display();
        }
}
