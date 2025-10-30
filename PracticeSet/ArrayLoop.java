public class ArrayLoop {
    public static void main(String[] args) {
        System.out.println("Array with loop");
        int[] number = {2, 4, 6, 8, 10};
        int i = 0;
        while(i < number.length){
            System.out.println(number[i]);
            i++;
        }


    }

    public static class Course {
        static int maxCapacity = 100;
        String courseName;
        int enrollments;

        String[] enrolledStudents;

        Course(String courseName) {
            this.courseName = courseName;
            this.enrollments = 0;
            this.enrolledStudents = new String[maxCapacity];
        }



        static void setMaxCapacity(int maxCapacity) {
            Course.maxCapacity = maxCapacity;
        }

        void enrollStudents(String studentName) {
            enrolledStudents[enrollments] = studentName;
            enrollments++;
        }

        void unenrollStudents(String studentName) {
            System.out.println("Student removed");
            enrollments--;
        }
    }
}
