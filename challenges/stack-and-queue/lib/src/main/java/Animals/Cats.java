package Animals;

import StackAndQueue.Animal;

public class Cats extends Animal {

    public Cats(String type) {
        super(type);
    }


    @Override
    public String toString() {
        return "Cats {" +
                "type='" + type + '\'' +
                '}';
    }
}