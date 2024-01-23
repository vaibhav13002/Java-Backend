package MultithreadingConcurrency.ConsumerProducer;
public class Company {
    int n;
    boolean f = false; // f=false indicates now its producers chance to produce
// boolean f; a bhi chalega since producer method me value daal rhe h hum main method se tho o sidha this.n pr ayega and vaha se f ko true krega tab cycle chalu ho jayega
    synchronized public void produce_item(int n){ //synchronized kiya taki jab tk a produce kr rha h tab tk koi consume na kr paye...same goes for consumer
        if(f){
            try{wait();}catch(Exception e){}
        }
    //pehle producer initialize hokr print krdega and f ko true
        this.n=n;
        System.out.println("Produced : " + this.n);
        f=true;
        notify();
    }
    synchronized public int consume_item(){
        if(!f){
            try{wait();}catch(Exception e){}
        }
        System.out.println("Consumed : " + this.n);
        f=false;
        notify();
        return this.n;
    }
}

// Instance Variables:

// int n: Represents the item that is produced or consumed.
// boolean f: A flag that indicates whether it is currently the producer's turn to produce (f=false) or the consumer's turn to consume (f=true).
// Synchronized Methods:

// synchronized is used on the methods to ensure that only one thread can execute them at a time. This helps in preventing race conditions and ensures proper synchronization between the producer and consumer threads.
// Producer Method (produce_item):

// The method takes an integer n as a parameter, representing the item to be produced.
// If it's not the producer's turn (f=true), the method calls wait(), which releases the lock on the object and waits until another thread calls notify() or notifyAll() on the same object.
// Once it's the producer's turn, the method sets the value of n, prints a message indicating that an item has been produced, sets f to true (indicating the consumer's turn), and calls notify() to wake up any waiting threads (likely the consumer).
// Consumer Method (consume_item):

// If it's not the consumer's turn (f=false), the method calls wait(), similar to the producer method.
// Once it's the consumer's turn, the method prints a message indicating that the item has been consumed, sets f to false (indicating the producer's turn), and calls notify() to wake up any waiting threads (likely the producer).
// The consumed item is returned.