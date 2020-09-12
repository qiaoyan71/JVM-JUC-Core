package qy;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Mytest {

    public static void main(String[] args) {
        System.out.println(Runtime.getRuntime().availableProcessors());

    }


    public void test1(){
        ExecutorService executorService = Executors.newFixedThreadPool(5);
    }
}
