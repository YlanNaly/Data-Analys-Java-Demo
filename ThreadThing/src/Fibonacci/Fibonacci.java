package Fibonacci;

public class Fibonacci {
  /**0 1 1 2 3 5 8 13 21 34
   * f(n) = f(n-1) + f(n-2)
   * */
  int n = 50;

  private static long fibonacci(int number){
    if(number <= 1){
      return number;
    }
    return (fibonacci(number - 1) + fibonacci(number - 2));
  }
  public Fibonacci(){
    System.out.println(fibonacci(n));
  }

}
