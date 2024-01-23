package MultithreadingConcurrency;
public class UsingRunnable implements Runnable {
    public void run(){
        for(int i=0; i<5; i++){
            System.out.println("Value of i is "+i);
            Thread t=Thread.currentThread(); //returns object of same thread class
            String tname=t.getName();  //returns abhi konsa current thread running h
            t.setName("THOR");
            System.out.println("Current name is "+ tname);
            try{ 
                Thread.sleep(1000);
            }catch(Exception e){

            }
        }
    }
    public static void main(String[] args) {
        UsingRunnable u=new UsingRunnable();
        // u.start();  will give an error coz our class dosent contain start() method...now we will create helper method

        Thread thr = new Thread(u);
        UsingThread u1 = new UsingThread();
        // u1.start();
        thr.start();
    }
}

// Runnable does not contain start() method ....Thread class provides Start() method
// you need to create a Thread instance and pass the Runnable object to its constructor.

//When you run multiple threads concurrently, the order in which they execute and the interleaving of their operations are determined by the operating system's thread scheduler. It's important to note that the exact behavior may vary, and the scheduler decides which thread to run based on factors like thread priority, the state of the thread (e.g., whether it's waiting for I/O or not), and other scheduling policies