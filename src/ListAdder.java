import java.util.ArrayList;
import java.util.List;

public class ListAdder implements Runnable {
    List<Integer> sharedList;

    int num;

    

    public ListAdder(int num, List<Integer> sharedList) {

        this.sharedList = sharedList;

        this.num = num;

    }



    @Override
    public void run() {
        for (int i = 0; i < num; i++) {
            sharedList.add(i);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        List<Integer> sharedList = new ArrayList<Integer>();

        List<Thread> threads = new ArrayList<Thread>();

        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(new ListAdder(50, sharedList));
            threads.add(thread);
            thread.start();

        }

        for (Thread thread : threads) {
            thread.join();
        }

        System.out.println("there are: " + sharedList.size() + " this time");
    }
    
    
}
