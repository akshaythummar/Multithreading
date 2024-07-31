public class Counter {
    private int count = 0;

    public synchronized void increment(){
        count++;

//        synchronized (this){      // or we can put specific code into Synchronized(){} block also
//            count++;
//        }
    }
    public int getCount(){
        return count;
    }
}
