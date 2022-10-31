package Thread;

public class MultiThreadThing implements Runnable{

  public int number;
  public MultiThreadThing(int i){
    this.number = i;
  }
  @Override
  public void run(){
    for(int i=0;i<=5;i++){
      System.out.println(i + " column to index " + number);

      try{
        Thread.sleep(10000);
      }
     catch (InterruptedException e) {
        throw new RuntimeException(e);
      }
    }
  }
}
