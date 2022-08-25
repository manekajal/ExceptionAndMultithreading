package multithreading.usingThreads;

public class Main {

        public static void main(String[] args)
        {
            UsingThread obj1 = new UsingThread();
            Hello obj2 = new Hello();

            obj1.start();
            try {Thread.sleep(10); } catch(Exception e) {}
            obj2.start();

        }

}
