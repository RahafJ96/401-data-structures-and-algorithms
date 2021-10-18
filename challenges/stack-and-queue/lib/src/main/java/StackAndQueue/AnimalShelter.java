package StackAndQueue;
import Animals.Cats;
import Animals.Dogs;

public class AnimalShelter {
    private QueueGen<Animal> dogs ;
    private QueueGen<Animal> cats ;

    public AnimalShelter() {
        this.dogs = new QueueGen<>();
        this.cats = new QueueGen<>();
    }

    public void enqueue(Animal animals){

        if(animals.getType().equalsIgnoreCase("dogs")){
            dogs.enqueue(animals);
        } else if(animals.getType().equalsIgnoreCase("cats")){
            cats.enqueue(animals);
        }else {
            System.out.println("is not an animal");
        }

    }

    public String dequeue(String pref) throws Exception {
        if(pref.equalsIgnoreCase("dogs") && !dogs.isEmpty()){
            dogs.dequeue();
            return pref;

        } else if(pref.equalsIgnoreCase("cats") && !cats.isEmpty()){
            cats.dequeue();
            return pref;
        } else {
            return "not an animal" ;
        }

    }

    @Override
    public String toString() {
        return "AnimalShelter{" +
                "dogs=" + dogs +
                ", cats=" + cats +
                '}';
    }
}