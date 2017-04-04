/*
 (*) Find the Kth element of a list.
    By convention, the first element in the list is element 0.

    Example:

    scala> nth(2, List(1, 1, 2, 3, 5, 8))
    res0: Int = 2
*/

class Problem3 {
def kthElementOfList(list:List[Int],k:Int):Int = {
   def kth(list:List[Int],k:Int,count:Int):Int = {
    if(k< 0 || k > list.length)
     throw new NoSuchElementException
    else if(k == count)
      list.head
    else
    kth(list.tail,k,count+1)
   }
   kth(list,k,0)
  }
}

object Problem3 extends App {
 val list = List(9,1,2,3,4,5,6)
 val pObj = new Problem3
 println("Kth Element of list: "+pObj.kthElementOfList(list,2))
}
