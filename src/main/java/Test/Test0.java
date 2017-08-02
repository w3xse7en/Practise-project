package Test;

/**
 * Created by Mew on 2017/7/31.
 */
public class Test0 {
    private static int cnt = 0;

    synchronized void add() {
        cnt++;
        System.out.println("+:" + cnt);
    }

    synchronized void minus() {
        cnt--;
        System.out.println("-:" + cnt);
    }

    class MyThreadAdd implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(1);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                add();

            }
        }
    }

    class MyThreadMinus implements Runnable {

        @Override
        public void run() {
            for (int i = 0; i < 100; i++) {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                minus();

            }
        }
    }

    public static void main(String args[]) {
        MyThreadAdd myThreadAdd = new Test0().new MyThreadAdd();
        MyThreadMinus myThreadMinus = new Test0().new MyThreadMinus();
        Thread thread = null;
//        for (int i = 0; i < 2; i++) {
//            thread = new Thread(myThreadAdd);
//            thread.start();
//            thread = new Thread(myThreadMinus);
//            thread.start();
//        }
        Integer i = 127;
        Integer j = 127;
        System.out.println(i == j);
        Integer i1 = 128;
        Integer j1 = 128;
        System.out.println(i1 == j1);
        Integer i2 = new Integer(127);
        Integer j2 = new Integer(127);
        System.out.println(i2 == j2);

    }
}
