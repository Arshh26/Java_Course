package PracticePackage.PracticePackage1;

public class Hen extends Animal {
    public String eat;
    public String walk;
    public String sound;

    public Hen(String eat, String walk, String eat1, String walk1, String sound) {
        super();
        this.eat = eat1;
        this.walk = walk1;
        this.sound = sound;
    }

    @Override
    public String toString() {
        return "Hen{" +
                "eat='" + eat + '\'' +
                ", walk='" + walk + '\'' +
                ", sound='" + sound + '\'' +
                '}';
    }
}
