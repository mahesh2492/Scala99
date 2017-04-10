/*
  (**) Duplicate the elements of a list a given number of times.
    Example:

    scala> duplicateN(3, List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'a, 'b, 'b, 'b, 'c, 'c, 'c, 'c, 'c, 'c, 'd, 'd, 'd)
*/

class Problem15{
def duplicate(list:List[Symbol],num:Int):List[Symbol] = {
  
   list.flatMap( x =>
    List.fill(num)(x) )
  }
}

object Problem15 extends App {
 
  val pObj = new Problem15
  val list = List('a,'b, 'c, 'c, 'd, 'e)
  println("Original List: "+list)

println("Duplicated List: "+pObj.duplicate(list,3))
}
