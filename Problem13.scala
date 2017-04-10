/*
 (**) Run-length encoding of a list (direct solution).
    Implement the so-called run-length encoding data compression method directly. I.e. don't use other methods you've written (like P09's pack); do all the work directly.

    Example:

    scala> encodeDirect(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[(Int, Symbol)] = List((4,'a), (1,'b), (2,'c), (2,'a), (1,'d), (4,'e))

*/
class Problem13{
def encodeDirect(list:List[Symbol]):List[(Int, Symbol)] = {
      val (pk,next) = list.span(_ == list.head)
      val encoded = (pk.size,pk.head)
      if(next.isEmpty) List(encoded)
      else
      encoded :: encodeDirect(next)
  }
}

object Problem13 extends App {
 
  val pObj = new Problem13
  val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println("Original List: "+list)

println("Encoded List: "+pObj.encodeDirect(list))
}
