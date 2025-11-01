public class Display {
    void display(Person p) {
        System.out.println(p.name);
        System.out.println(p.gender);
        System.out.println(p.age);
    }

    public static void main(String[] args) {
        Person p1 = new Person();
        Display d1 = new Display();

        p1.show(d1);
    }
}
