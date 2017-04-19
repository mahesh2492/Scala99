/*
(*) Insert an element at a given position into a list.
    Example:

    scala> insertAt('new, 1, List('a, 'b, 'c, 'd))
    res0: List[Symbol] = List('a, 'new, 'b, 'c, 'd)
*/

class Problem21{
def insertAt(list:List[Symbol],n:Int,num:Symbol):List[Symbol] = {
 def insert(l:List[Symbol] ,l1:List[Symbol] ,count:Int):List[Symbol] = {
    (l,count) match {
      case (Nil,_) => l1
      case (head::tail,count) if(count == n) => insert(l,l1 :+ num,count+1)
      case (head::tail,count)  => insert(tail,l1 :+ head,count+1)
      
}
}
insert(list,List[Symbol](),0)
}
}

object Problem21 extends App {
  
   val pObj = new Problem21
   val list = List('a, 'b, 'c, 'd)
   
   println("Original list :" + list)
   println("List after inserting new element :" + pObj.insertAt(list,2,'new))
}
