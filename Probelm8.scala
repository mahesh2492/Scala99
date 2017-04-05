/*
(**) Eliminate consecutive duplicates of list elements.
    If a list contains repeated elements they should be replaced with a single copy of the element. The order of the elements should not be changed.

    Example:

    scala> compress(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Symbol] = List('a, 'b, 'c, 'a, 'd, 'e) 
*/
class Problem8 {
def compress(list:List[Symbol]):List[Symbol]= {
  list match {
   case Nil => Nil
   case head::tail => head :: compress(tail.dropWhile(_ == head))
  }
}
}

object Problem8 extends App {

  val pObj = new Problem8
  val list =  List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println("Compressed list "+ pObj.compress(list))
}
