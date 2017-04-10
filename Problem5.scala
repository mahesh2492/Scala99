/*
 (*) Reverse a list.
    Example:

    scala> reverse(List(1, 1, 2, 3, 5, 8))
    res0: List[Int] = List(8, 5, 3, 2, 1, 1)
*/
class Problem5{
def reverse(list:List[Int]):List[Int] = {
  def revers(l:List[Int], rev:List[Int]):List[Int] = {
    if(l.isEmpty) rev
    else
     revers(l.tail,l.head :: rev)
  }
  revers(list,List[Int]())
}
}

object Problem5 extends App {
 val list = List(9,1,2,3,4,5,6)
 val pObj = new Problem5
 println("Reverse of list without using inbuilt function: "+pObj.reverse(list))
println("Reverse of list using inbuilt function: "+list.reverse)
}
