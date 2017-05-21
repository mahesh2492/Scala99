/*
  (*) Remove the Kth element from a list.
    Return the list and the removed element in a Tuple. Elements are numbered from 0.

    Example:

    scala> removeAt(1, List('a, 'b, 'c, 'd))
    res0: (List[Symbol], Symbol) = (List('a, 'c, 'd),'b)
*/

class Problem20{
def remove(list:List[Int],n:Int):(List[Int],Int) = {
 def dropImp(l:List[Int],l1:List[Int],count:Int,a:Int):(List[Int],Int) = {
    (l,count) match {
      case (Nil,_) => (l1,a)
      case (head::tail,count) if(count == n) => dropImp(tail,l1,count+1,head)
      case (head::tail,count)  => dropImp(tail,l1 :+ head,count+1,a)
      
}
}
dropImp(list,List[Int](),0,0)
}

def removeAt(list:List[Int],n:Int):(List[Int],Int) = {
   list.splitAt(n) match {
    case (Nil,_) if n < 0 => throw new NoSuchElementException
    case (pre,head::tail) => (pre ::: tail,head)
    case (pre,Nil) => throw new NoSuchElementException
  }
 }

}

object Problem20 extends App {
  
   val pObj = new Problem20
   val list = List(1,2,3,4,5,6,7,8,9)
   val deletingIndex = 3
   println("List after removing kth element :" + pObj.remove(list,deletingIndex))
   println("List after removing kth element :" + pObj.remove(list,2))  
    println("Remove Kth element :" + pObj.removeAt(list,2))

}
