/*
  (*) Modified run-length encoding.
    Modify the result of problem P10 in such a way that if an element has no duplicates it is simply copied into the result list. Only elements with duplicates are transferred as (N, E) terms.

    Example:

    scala> encodeModified(List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e))
    res0: List[Any] = List((4,'a), 'b, (2,'c), (2,'a), 'd, (4,'e))
*/
class Problem11 {
def pack(list:List[Symbol]):List[List[Symbol]] = {
 
  list match {
  case Nil => Nil
  case head::tail => list.takeWhile(_ == head) :: pack(list.dropWhile(_ == head) )
 }
}
 def modifiedEncode(list:List[Symbol]):List[Any] = {
  val pck = pack(list)
   pck.map(x => if(x.size > 1) (x.size,x(0)) else x(0))
 }
 

}

object Problem11 extends App {
 
  val pObj = new Problem11
  val list = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println("Original List: "+list)
  println("Encoded List: "+pObj.modifiedEncode(list))
}
