public class EmployeeOne {
    String name;

    EmployeeOne(String name) {
        this.name = name;

    }

    public static void main(String[] args) {
        EmployeeOne e1 = new EmployeeOne("Arshad Ali");
        System.out.println(e1.name);
    }
}
