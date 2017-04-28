/*
  (**) Determine whether a given integer number is prime.

    scala> 7.isPrime
    res0: Boolean = true
*/
object Problem31 extends App{
      def isPrime(n:Int) = {
      n > 1 && !( 2 to n-1).exists { i => n % i == 0 }
      }
   val n = 7
   println("is It Prime ? : " + isPrime(n))
}
