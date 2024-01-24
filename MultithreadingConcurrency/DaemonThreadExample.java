package MultithreadingConcurrency;

//isme user thread jab tk run kr rha h tab tk background me daemon bhi run kr le rha h ....but user thread completes it tells JVM ki bad ho ja...since daemon thread Main thread me nhi h so o last tk nhi run krrega after completion of user thread baki example me hum main me rkh rhe the iss vajah se o bhi implement ho he ja rha tha
public class DaemonThreadExample {
    public static void main(String[] args) {
        // Creating a user thread
        Thread userThread = new Thread(new UserTask());
        
        // Creating a daemon thread
        Thread daemonThread = new Thread(new DaemonTask());
        daemonThread.setDaemon(true); // Set the thread as daemon

        // Starting both threads
        userThread.start();
        daemonThread.start();
    }

    static class UserTask implements Runnable {
        public void run() {
            try {
                // Simulating some task
                System.out.println("User thread executing task...");
                Thread.sleep(2000);
                System.out.println("User thread finished task.");

            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    static class DaemonTask implements Runnable {
        public void run() {
            try {
                // Continuous task in daemon thread
                while (true) {
                    System.out.println("Daemon thread running...");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
