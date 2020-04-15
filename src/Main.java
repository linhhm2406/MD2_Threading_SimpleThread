public class Main {
    public static void main(String[] args) {
        NumberGenerator t1 = new NumberGenerator();
        NumberGenerator t2 = new NumberGenerator();

//        Thread t1 = new Thread(number1);
//        Thread t2 = new Thread(number2);

        t1.setName("thread1");
        t2.setName("thread2");

        t1.setPriority(Thread.MAX_PRIORITY);
        t2.setPriority(Thread.MIN_PRIORITY);

        t1.start();
        t2.start();
    }

}
