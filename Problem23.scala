/*
(**) Extract a given number of randomly selected elements from a list.
    Example:

    scala> randomSelect(3, List('a, 'b, 'c, 'd, 'f, 'g, 'h))
    res0: List[Symbol] = List('e, 'd, 'a)
*/
class Problem23{

 def removeAt(list:List[Int],n:Int):(List[Int],Int) = {
   list.splitAt(n) match {
    case (Nil,_) if n < 0 => throw new NoSuchElementException
    case (pre,head::tail) => (pre ::: tail,head)
    case (pre,Nil) => throw new NoSuchElementException
  }
 }

 def randomSelect(list:List[Int],n:Int):List[Int] = {
  if( n <= 0) Nil
  else
  {
    val (ls,elem) =  removeAt(list, (new util.Random).nextInt(list.length))
    elem :: randomSelect(ls,n-1)
 }
}

}

object Problem23 extends App {
 
  val pObj = new Problem23
  val list = List(1,2,3,4,5,6,7)
  val num = 3
  println("Randomly Select element from given list ",pObj.randomSelect(list,num))
}
