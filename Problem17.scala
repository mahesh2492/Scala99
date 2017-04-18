/*
  (*) Split a list into two parts.
    The length of the first part is given. Use a Tuple for your result.

    Example:

    scala> split(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: (List[Symbol], List[Symbol]) = (List('a, 'b, 'c),List('d, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
*/

class Problem17 {

def split(l:List[Int],n:Int):(List[Int],List[Int]) = {
  val l1 = l.takeWhile(_ != l(n))
  val l2 = l.reverse.dropRight(n).reverse
  (l1,l2)
}
}

object Problem17 extends App {

  val list = List(1,2,3,4,5,6,7,8,9)
  val pObj = new Problem17
  val num = 3
  println("After splitting $numth element: " + pObj.split(list,num))
}
