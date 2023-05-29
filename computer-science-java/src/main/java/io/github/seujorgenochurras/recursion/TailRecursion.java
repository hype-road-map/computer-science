package io.github.seujorgenochurras.recursion;

public class TailRecursion {

   public static void main(String[] args) {

      System.out.println(fibonacci(100));
   }

   //This is a tail recursion
   //A tail recursion doesn't need to remember its last returned value (because we pass it as a argument)
   public static long sumHelper(long numberToSum, long totalSumValue){
      if(numberToSum == 1){
         return totalSumValue;
      }
      return sumHelper(numberToSum -1, numberToSum + totalSumValue);
   }
   public static long sum(long numberToSum){
         return sumHelper(numberToSum, 0);
   }

   public static long fibonacciHelper(long fibonacciNum, long firstNumber, long secondNumber){
      if(fibonacciNum == 0) {
         return firstNumber;
      }
      if(fibonacciNum == 1) {
         return secondNumber;
      }
      return fibonacciHelper(fibonacciNum-1, secondNumber, firstNumber + secondNumber);

   }
   public static long fibonacci(long fibonacciNum){
      return fibonacciHelper(fibonacciNum, 0, 1);
   }

}
