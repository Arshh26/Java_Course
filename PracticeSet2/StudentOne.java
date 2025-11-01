public class StudentOne {
    String name;
    String fatherName;
    String dob;

    void printThis() {
        this.name = "Arshad Ali";
        this.fatherName = "Abid Ali";
        this.dob = "23-03-2004";

        System.out.println(this.name);
        System.out.println(this.fatherName);
        System.out.println(this.dob);
        System.out.println(this);
   }



    public static void main(String[] args) {
        StudentOne s1 = new StudentOne();
        StudentOne s2 = new StudentOne();
        s1.printThis();
        s2.printThis();





    }

}



