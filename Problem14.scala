/*
  (*) Duplicate the elements of a list.
    Example:

    scala> duplicate(List('a, 'b, 'c, 'c, 'd))
    res0: List[Symbol] = List('a, 'a, 'b, 'b, 'c, 'c, 'c, 'c, 'd, 'd)
*/
class Problem14{
def duplicate(list:List[Symbol]):List[Symbol] = {
  
   list.flatMap( x =>
    List.fill(2)(x) )
  }
}

object Problem14 extends App {
 
  val pObj = new Problem14
  val list = List('a,'b, 'c, 'c, 'd, 'e)
  println("Original List: "+list)

println("Duplicated List: "+pObj.duplicate(list))
}
