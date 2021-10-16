package StackAndQueue;

public class Animal {
    public String type;

    public String getType(){
        return type;
    }

    public Animal(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type='" + type + '\'' +
                '}';
    }
}