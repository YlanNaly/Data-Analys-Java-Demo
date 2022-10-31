package LambdaExpression;

public class Main {
  public static void main(String[] args) {

    Person person = new Person();

    /**
     * callback function
     * */

    printThing(()->{
      System.out.println("hello");
    });
  }


  static void printThing(IPerson thing){
    thing.print();
  }
}
