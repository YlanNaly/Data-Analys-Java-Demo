package Thread;

public class Multithreading {
  public static void main(String[] args) throws InterruptedException {

    for(int i=0;i<=5;i++){
      MultiThreadThing thing = new MultiThreadThing(i);
      Thread thread = new Thread(thing);
      thread.start();
    }
  }
}
