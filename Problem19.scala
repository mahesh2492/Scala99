/*
   (**) Rotate a list N places to the left.
    Examples:

    scala> rotate(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k, 'a, 'b, 'c)

    scala> rotate(-2, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res1: List[Symbol] = List('j, 'k, 'a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i)
*/

class Problem19{
def rotate(num:Int,list:List[Int]):List[Int] = {
  num match {
    case num if(num > 0) => list.dropWhile( _ != list(num)) ::: list.reverse.takeRight(num).reverse
    case num if(num < 0) => list.takeRight(-1 * num) ::: list.dropRight(-1 * num)
    } 
  }
}

object Problem19 extends App {
  
   val pObj = new Problem19
   val list = List(1,2,3,4,5,6,7,8,9)
   val rotatingNumber = 3
   println("Rotated List :" + pObj.rotate(rotatingNumber,list))
   println("Rotated List :" + pObj.rotate(-3,list))
}
