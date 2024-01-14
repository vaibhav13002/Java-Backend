package MultithreadingConcurrency;

public class ThreadTester {
    public static void main(String[] args) {
        System.out.println("Main is starting");
        Thread thread1 = new Thread1("thread1");
        // thread1.setDaemon(true);
        thread1.run();

        Thread thread2 = new Thread(new Thread2(), "thread2");
        thread2.start();
        System.out.println("main is running");
    }
}

//at start pehle main mwthod dono print krega then loop
// at the initial when we had not set any thread as daemon thread by default all thread are non daemon thread(user) so everything will run and then JVM will stop, the order of running will be decided by JVM , its fully on JVM.

