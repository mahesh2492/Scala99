/*
(*) Lotto: Draw N different random numbers from the set 1..M.
    Example:

    scala> lotto(6, 49)
    res0: List[Int] = List(23, 1, 17, 33, 21, 37)
*/

class Problem24{
def lotto(num:Int,limit:Int):List[Int] = {
  val r = scala.util.Random
  (for (i <- 0 to 5) yield r.nextInt(49)).toList
 }

}

object Problem24 extends App {
  
   val pObj = new Problem24
   val num = 6
   val limit = 49
   println("List of random numbers :" + pObj.lotto(num,limit))
}
