/*
  (**) Pack consecutive duplicates of list elements into sublists.
    If a list contains repeated elements they should be placed in separate sublists.

    Example:

    scala> pack(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[List[Symbol]] = List(List('a, 'a, 'a, 'a), List('b), List('c, 'c), List('a, 'a), List('d), List('e, 'e, 'e, 'e))
*/
class Problem9 {
def pack(list:List[Symbol]):List[List[Symbol]] = {
 
  list match {
  case Nil => Nil
  case head::tail => list.takeWhile(_ == head) :: pack(list.dropWhile(_ == head) )
}
}
}

object Problem9 extends App {
 
  val pObj = new Problem9
  val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println("Original List: "+list)
  println("Packed List: "+pObj.pack(list))
}
