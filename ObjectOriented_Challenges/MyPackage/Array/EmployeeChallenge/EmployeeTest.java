package MyPackage.Array.EmployeeChallenge;

public class EmployeeTest {
    public static void main(String[] args) {
        Employee emp = new Employee("Arshad ali", 21, 45000);
        System.out.println(emp.getEmployeeDEtails());
        emp.setName("Rehman");
        emp.setAge(25);
        emp.setSalary(65000);
        System.out.println(emp.getEmployeeDEtails());

        Employee emp1 = new Employee("Shameem", 21, 55000);
        System.out.println(emp);
        System.out.println(emp1);
    }


}
