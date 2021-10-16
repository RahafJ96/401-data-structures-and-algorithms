package Animals;


import StackAndQueue.Animal;

public class AllAnimals extends Animal {

    public AllAnimals(String type) {
        super(type);
    }

    @Override
    public String toString() {
        return "All Animals in the Shelter {" +
                "name='" + type + '\''
                +'}';
    }
}