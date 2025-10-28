public class StudentToString {
    String name;
    int age;
    String rollNumber;
    String house;

    @Override
    public String toString() {
        return "Students Details: {Name:" + name
                + ", Age: "+ age
                + ", Roll Number: "+ rollNumber
                + ", House: "+ house +"}";
    }

    public StudentToString(String name, int age, String rollNumber, String house) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.house = house;
    }

    public static void main(String[] args) {
        StudentToString stu = new StudentToString("Arshad", 21, "4KM22CS017", "Mangalore");
        System.out.println(stu);
    }
}


