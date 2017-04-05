class Problem7 {
def flatten(list:List[Any]):List[Any] = {
 list flatMap {
  case x:List[_] => flatten(x) 
 case x => List(x) 
  
}
}
}

object Problem7 extends App {

  val pObj = new Problem7
  val list = List(List(1, 1), 2, List(3, List(5, 8)))
  println("flatten list "+ pObj.flatten(list))
}
