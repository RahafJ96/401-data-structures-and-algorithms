package StackAndQueue;

public class Cats extends Animal{
    public Cats(String cateName){
        super(cateName);
    }
    @Override
    public String toString() {
        return "cat :"+getName();
    }
}
