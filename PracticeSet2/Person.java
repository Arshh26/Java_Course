public class Person {
    String name;
    int age;
    String gender;

    void show(Display d) {
       this.name = "Arshad";
       this.age = 21;
       this.gender = "Male";

       d.display(this);


    }
}
