package multithreading.usingInterface;

public class Hi implements Runnable{
    @Override
    public void run() {

        for(int i=1;i<=5;i++)
        {
            System.out.println("Hi");
            try {Thread.sleep(1000); } catch(Exception e) {}
        }
    }
}
