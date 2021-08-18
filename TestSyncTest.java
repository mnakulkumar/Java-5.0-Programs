class TestSync implements Runnable {
    private int balance;

    public void run(){
        for(int i=0;i<50;i++){
            increment();
            System.out.println(Thread.currentThread().getName()+" balance is "+ balance);
        }        
    }

    public void increment(){
        int i = balance;
        System.out.println(Thread.currentThread().getName() + ", i = "+i);
        balance = i + 1;
        System.out.println(Thread.currentThread().getName() + ", Balance after i + 1 is "+balance);

    }

}

public class TestSyncTest{
    public static void main(String[] args){
        TestSync job = new TestSync();
        Thread a = new Thread(job);
        Thread b = new Thread(job);
        a.setName("A");
        b.setName("B");
        a.start();
        b.start();
    }
}