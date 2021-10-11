package StackAndQueue;

public class AnimalShelter {
    Queue dogs=new Queue();
    Queue cats=new Queue();

    public void enqueue(Animal animal){
        if( animal instanceof Dogs){
            dogs.enqueue(animal);
        }
        if(animal instanceof Cats){
            cats.enqueue(animal);
        }
    }
    public String deeQueue(String pref){
        if(pref=="cat"){
            if(!this.cats.isEmpty()){
                this.cats.dequeue();
                return "cat";
            }
        }
        else if(pref=="dog"){
            if(!this.dogs.isEmpty()){
                this.dogs.dequeue();
                return "dog";
            }
        }
        return null;
    }

    @Override
    public String toString(){
        if(this.cats.isEmpty()&&this.dogs.isEmpty()){
            return null;
        }
        System.out.println("{"+this.dogs+"}"+"{"+this.cats.show()+"}");
        return "{"+dogs.show()+"}\n"+"{"+cats.show()+"}";
    }
}
