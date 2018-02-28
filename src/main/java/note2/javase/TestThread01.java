package note2.javase;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
import java.util.concurrent.locks.Lock;  
import java.util.concurrent.locks.ReentrantLock;  
  
/** 
 * java编程题：100个线程同时向一个银行账户中存入1元钱  
 */  
public class TestThread01 {  
  
    public static void main(String[] args) {  
        Account account = new Account();  
        ExecutorService service = Executors.newFixedThreadPool(100);  
          
        for (int i = 1; i <= 100; i++) {  
            service.execute(new MoneyThread(account, 1));  
        }  
          
        service.shutdown();  
          
        while(!service.isTerminated()){}  
          
        System.out.println("账户金额："+account.getBalance());  
    }  
  
}  
  
/** 
 * 银行账户类 
 */  
class Account {  
      
    private double balance;         //账户余额  
      
    private Lock accountLock = new ReentrantLock();         //锁对象  
      
    /** 
     * 存入金额方法 
     *  
     * 实现方式1： 
     *    synchronized关键字修饰方法为同步方法 
     * 
    public synchronized void deposit(double money) { 
        double newBalance = balance + money; 
         
        try { 
            Thread.sleep(10);       //模拟此业务需要处理时间 
        } catch (InterruptedException e) { 
            e.printStackTrace(); 
        } 
         
        balance = newBalance; 
         
    } 
     */  
      
    /** 
     * 存入金额方法 
     *  
     * 实现方式2： 
     *    通过JDK1.5显示式锁机制，为每个银行账户创建一个锁对象，在存款操作时进行加锁和解锁的操作。 
     */  
    public void deposit(double money) {  
        accountLock.lock();         //加锁  
  
        double newBalance = balance + money;  
          
        try {  
            Thread.sleep(10);       //模拟此业务需要处理时间  
        } catch (InterruptedException e) {  
            e.printStackTrace();  
        }  
          
        balance = newBalance;  
          
        accountLock.unlock();       //解锁  
          
    }  
      
      
    /** 
     * 获得账户金额 
     */  
    public double getBalance() {  
        return balance;  
    }  
      
}  
  
/** 
 * 存钱线程类 
 */  
class MoneyThread implements Runnable {  
  
    private Account account;        //存入账户  
      
    private double money;           //存入金额  
      
  
    public MoneyThread(Account account, double money) {  
        this.account = account;  
        this.money = money;  
    }  
  
    public void run() {  
        account.deposit(money);  
    }  
      
}  