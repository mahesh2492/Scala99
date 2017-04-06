/*
  (*) Run-length encoding of a list.
    Use the result of problem P09 to implement the so-called run-length encoding data compression method. Consecutive duplicates of elements are encoded as tuples (N, E) where N is the number of duplicates of the element E.

    Example:

    scala> encode(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))
*/

class Problem10 {
def pack(list:List[Symbol]):List[List[Symbol]] = {
 
  list match {
  case Nil => Nil
  case head::tail => list.takeWhile(_ == head) :: pack(list.dropWhile(_ == head) )
 }
}
 def encode(list:List[Symbol]):List[List[Any]] = {
  val pck = pack(list)
   pck.map(x => List(x.size,x(0)))
}

}

object Problem10 extends App {
 
  val pObj = new Problem10
  val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println("Original List: "+list)
  println("Encoded List: "+pObj.encode(list))
}
