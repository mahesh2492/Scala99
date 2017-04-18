/*
  (**) Drop every Nth element from a list.
    Example:

    scala> drop(3, List('a, 'b, 'c, 'd, 'e, 'f, 'g, 'h, 'i, 'j, 'k))
    res0: List[Symbol] = List('a, 'b, 'd, 'e, 'g, 'h, 'j, 'k)
*/

class Problem16 {
def drop(l:List[Int],n:Int):List[Int] = {
  def dropImp(l:List[Int],l1:List[Int],count:Int):List[Int] = {
    (l,count) match {
      case (Nil,_) => l1
      case (head::tail,count) if(count == n) => dropImp(tail,l1,1)
      case (head::tail,count) if(count < n) => dropImp(tail,l1 :+ head,count+1)
      
    }
  }
  dropImp(l,List[Int](),1)
}
}

object Problem16 extends App {

  val list = List(1,2,3,4,5,6,7,8,9)
  val pObj = new Problem16
  val num = 3
  println("After dropping $numth element: " + pObj.drop(list,num))
}
