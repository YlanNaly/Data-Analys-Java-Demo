package LambdaExpression;

public class Person implements IPerson{
  public String name;
  public int age;

  @Override
  public void print() {
    System.out.println("hello");
  }
}
