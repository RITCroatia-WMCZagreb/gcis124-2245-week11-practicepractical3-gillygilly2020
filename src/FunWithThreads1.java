public class FunWithThreads1{


    //Constructor of FunWithThreads
    public FunWithThreads1(){
        System.out.println("MAIN START");
       
        System.out.println("MAIN END");

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 1: " + i);
                }
            }
        });

        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    System.out.println("Thread 2: " + i);
                }
            }
        });

        thread1.start();
        thread2.start();
    }

    public static void main(String[] args) throws Exception {
        
        new FunWithThreads1();

    }

    /*
     * 
     * 
     * Main Thread START
        Main Thread END
        Thread 1 0
        Thread 2 0
        Thread 1 1
        Thread 2 1
        Thread 1 2
        Thread 2 2
        Thread 1 3
        Thread 2 3
        Thread 1 4
        Thread 2 4
        Thread 1 5
        Thread 2 5
        Thread 1 6
        Thread 2 6
        Thread 1 7
        Thread 2 7
        Thread 1 8
        Thread 2 8
        Thread 1 9
        Thread 2 9
     */


}
