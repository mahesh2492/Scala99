/*
  (*) Find the last but one element of a list.
    Example:

    scala> penultimate(List(1, 1, 2, 3, 5, 8))
    res0: Int = 5
*/
class Problem2 {

 def secondLastElement(l:List[Int]):Int = {

      def secondLast(l:List[Int]):Int = {

      l match {

      case _::_::Nil => l.head
      case _::tail => secondLast(tail)
      case Nil => throw new NoSuchElementException
      }
      }
      secondLast(l)
      }
}

object Problem2 extends App {

  val pObj = new Problem2
  val list = List(9,1,4,5,6,2,3)
  println("Using pattern matching "+pObj.secondLastElement(list))
  println("Using inbuilt function "+ list.init.last)

}
