public class Test {
    public static void main(String[] args) throws InterruptedException {
//        World world = new World();
//        Thread t = new Thread(world);
//        t.start();
//        t.join();
//
//        System.out.println("Test "+ Thread.currentThread().getName());


        // synchronized
        Counter counter = new Counter();
        MyThread a = new MyThread(counter);
        MyThread b = new MyThread(counter);

        a.start();
        b.start();

        a.join();
        b.join();

        System.out.println(counter.getCount());
    }
}
