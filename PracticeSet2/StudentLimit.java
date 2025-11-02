public class StudentLimit {
    static int  StudentLimit = 0;

    StudentLimit() {
        if(StudentLimit < 4){
            StudentLimit++;
            System.out.println("Created");
        } else {
            System.out.println("limit reached");
        }
    }

    public static  void main(String[] args) {
        StudentLimit s1 = new StudentLimit();
        StudentLimit s2 = new StudentLimit();
        StudentLimit s3 = new StudentLimit();
        StudentLimit s4 = new StudentLimit();
        StudentLimit s5 = new StudentLimit();
        StudentLimit s6 = new StudentLimit();


    }
}
