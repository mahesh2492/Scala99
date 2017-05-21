/*
(*) Generate a random permutation of the elements of a list.
    Hint: Use the solution of problem P23.

    Example:

    scala> randomPermute(List('a, 'b, 'c, 'd, 'e, 'f))
    res0: List[Symbol] = List('b, 'a, 'd, 'c, 'e, 'f)
*/

class Problem25{
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
  def randomPermute(list:List[Int]):List[Int] = randomSelect(list,list.size)
}

object Problem25 extends App {
 val pObj = new Problem25
 val list = List(1,2,3,4,5,6,7,8,9)
 println("Random Permutations of given list ",pObj.randomPermute(list))
}
