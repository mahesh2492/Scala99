class Problem8 {
def compress(list:List[Symbol]):List[Symbol]= {
  list match {
   case Nil => list
   case head::tail => List(head) ::: compress(tail.dropWhile(_ == head))
  }
}
}

object Problem8 extends App {

  val pObj = new Problem8
  val list =  List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)
  println("Compressed list "+ pObj.compress(list))
}
