package Animals;
import StackAndQueue.Animal;

public class Dogs extends Animal {
    public Dogs(String type) {
        super(type);
    }


    @Override
    public String toString() {
        return "Dogs{" +
                "type='" + type + '\'' +
                '}';
    }
}