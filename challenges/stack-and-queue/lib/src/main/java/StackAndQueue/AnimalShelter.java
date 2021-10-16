package StackAndQueue;
import Animals.Cats;
import Animals.Dogs;

public class AnimalShelter<T> {

    Queue <T> dogs=new Queue();
    Queue <T> cats=new Queue();

    Queue <T> differentTypes= new Queue<>();

    public void enqueue(T animal){

        if(animal instanceof Cats){
            cats.enqueue(animal);
        }
        else if(animal instanceof Dogs){
            dogs.enqueue(animal);
        }
        else{
            differentTypes.enqueue(animal);
        }
    }

    public T dequeue(T animal) throws Exception {

        try{
            if(animal.equals("dog")){
                return dogs.dequeue();
            }
            else if(animal.equals("cat")){
                return cats.dequeue();
            }
            else{
                return differentTypes.dequeue();
            }}

        catch (Exception e){
            e.getMessage();
        }
        if (animal == "cat"){
            return (T) "We are sorry, we don't have cats in the Shelter";

        }else if (animal == "dog"){
            return (T) "We are sorry, we don't have dogs in the Shelter";
        }else {
            if(differentTypes.isEmpty()) {
                return (T) "We are Sorry, our Shelter is Empty this moment";
            }
            else{
                return differentTypes.dequeue();
            }
        }
    }

}