/*
  (*) Create a list containing all integers within a given range.
    Example:

    scala> range(4, 9)
    res0: List[Int] = List(4, 5, 6, 7, 8, 9)
*/
class Problem22{
def range(a:Int,b:Int):List[Int] = { 
(a to b).toList
 }

}

object Problem22 extends App {
 
  val pObj = new Problem22
  val a = 4
  val b = 9
   println("List: "+pObj.range(a,b))
}
