package 线程的同步与死锁;


public class TestTicket2 {
    public static void main(String[] args) {
        //创建线程类对象
        Ticket2 t=new Ticket2();
        ///创建三个代理类线程，代理同一个线程对象t
        Thread t1=new Thread(t,"A窗口");
        Thread t2=new Thread(t,"B窗口");
        Thread t3=new Thread(t,"C窗口");
        //启动线程
        t1.start();
        t2.start();
        t3.start();
    }
}
