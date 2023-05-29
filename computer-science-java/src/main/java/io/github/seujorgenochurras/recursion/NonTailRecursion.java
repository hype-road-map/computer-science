package io.github.seujorgenochurras.recursion;

public class NonTailRecursion {

   public static void main(String[] args) {
      System.out.println(fibonacci(100));
   }
   //This is a non-tail recursion
   //A non-tail recursion has memory related problems
   //This fibonacci function needs to remember all the numbers in the sequence, and then it can calculate it
   //This means that the non-tail recursion creates a kind of triangular memory allocation
   /*
      Like this:
            sum(5)
            5 + sum(4)
            5 + (4 + sum(3))
            5 + (4 + (3 + sum(2)))
            5 + (4 + (3 + (2 + sum(1))))
            5 + (4 + (3 + (2 + (1 + sum(0)))))
            5 + (4 + (3 + (2 + (1 + 0))))
            5 + (4 + (3 + (2 + 1)))
            5 + (4 + (3 + 3))
            5 + (4 + 6)
            5 + 10
            15
    */
   public static long fibonacci(long fibonacciNumber){
      if(fibonacciNumber <= 1) {
         return fibonacciNumber;
      }
      return fibonacci(fibonacciNumber -1) + fibonacci(fibonacciNumber -2);
   }
}
