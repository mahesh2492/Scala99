/*
(*) Find the last element of a list.
    Example:

    scala> last(List(1, 1, 2, 3, 5, 8))
    res0: Int = 8
*/

class Problem1 {

 def lastElement(l:List[Int]):Int = {

      def last(l:List[Int]):Int = {

      l match {

      case head::Nil => head
      case _::tail => last(tail)
      case Nil => throw new NoSuchElementException
      }
      }
      last(l)
      }
}

object Problem1 extends App {

  val pObj = new Problem1
  val list = List(9,1,4,5,6,2,3)
  println("Using pattern matching "+pObj.lastElement(list))
  println("Using inbuilt function "+ list.last)

}


