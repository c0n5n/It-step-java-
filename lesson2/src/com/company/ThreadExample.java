package com.company;

public class ThreadExample {
    public int value;
    private Boolean syncObj = true;
    private Integer dObj = 12;

    public void run1() {
        // у каждого объекта в Java есть монитор состояния
        // монитор может принимать 2 состояния:
        // заблокирован и не заблокирован (locked/unlocked)
        for (int i = 0; i < 1000; i++) {
            synchronized (syncObj) {
                this.value++;
            }
        }
    }

    public void run2() {
        for (int i = 0; i < 1000; i++) {
            synchronized (syncObj) {
                this.value--;
            }
        }
    }

    // run3 = run4

    public synchronized void run3() {}

    // пока "заблокирован" this, потоки не имеют доступа
    // (становятся в очередь) к другим синхронизированным
    // методам объекта. (к несинхронизированным - могут)
    public void run4() {
        synchronized (this) {
            // code
        }
    }

    public synchronized void test() {}

    // будут заблокированы все статические методы
    // класса с пометкой synchronized
    public static synchronized void test2() {

    }

    public static synchronized void test3() {

    }

    public void daemon() {
        // дальнейшее выполнение кода произойдет
        // только после того, как у объекта dObj
        // будет вызван метод notify из другого потока

        // вызов методов wait, notify и notifyAll
        // должен происходить в синхронизированном контексте
        while (true) {
            synchronized (this.dObj) {
                try {
                    this.dObj.wait();
                    System.out.println("Daemon");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public void angel() {
        while (true) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            synchronized (this.dObj) {
                this.dObj.notify();
            }
        }
    }
}
