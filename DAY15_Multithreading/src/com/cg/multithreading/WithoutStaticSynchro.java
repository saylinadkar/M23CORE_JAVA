package com.cg.multithreading;

class Test2

{

public synchronized void display()

{

System.out.println("Current thread " + Thread .
currentThread()
.getName());

for(int i = 0; i < 5 ; i++)

{

System.out.println(Thread.currentThread().getName() + " i - " + i);

try

{

Thread.sleep(50);

}

catch (InterruptedException e)

{

e.printStackTrace();

}}}}

class Valueof implements Runnable{

Thread t;

Test2 val;

Valueof(Test2 val)

{

this.val = val;

t = new Thread(this);

t.start();

}

public void run()

{

val.display();

}

}

public class WithoutStaticSynchro{

@SuppressWarnings("unused")
public static void main(String[] args) {

Test2 obj1 = new Test2();

Test2 obj2 = new Test2();

Valueof t1 = new Valueof(obj1);

Valueof t2 = new Valueof(obj2);

}

}
