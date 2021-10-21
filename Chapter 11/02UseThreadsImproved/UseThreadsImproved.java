// Improved MyThread.

class MyThread implements Runnable {
    // A reference to the thread is stored in thrd.
    Thread thrd;

    // Construct  a new thread.
    MyThread(String name) {
        // This thread is named when it is created.
        thrd = new Thread(this, name);
        // Begin executing the thread.
        thrd.start();
    }

    // Begin execution of new thread.
    public void run() {
        System.out.println(thrd.getName() + " starting.");
        try {
            for(int count = 0; count < 10; count++) {
                Thread.sleep(400);
                System.out.println("In " + thrd.getName() + " , count is " + count);
            }
        } catch(InterruptedException exc) {
            System.out.println(thrd.getName() + " interrupted.");
        }
        System.out.println(thrd.getName() + " terminating.");
    }
}

class UseThreadsImproved {
    public static void main(String args[]) {
        System.out.println("Main thread starting.");

        // Now the thread starts when it is created.
        MyThread mt = new MyThread("Child #1");

        for(int i = 0; i < 50; i++) {
            System.out.print(".");
            try {
                Thread.sleep(100);
            } catch(InterruptedException exc) {
                System.out.println("Main thread interrupted.");
            }
        }
        System.out.println("Main thread ending.");
    }
}