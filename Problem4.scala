/*
(*) Find the number of elements of a list.
    Example:

    scala> length(List(1, 1, 2, 3, 5, 8))
    res0: Int = 6
*/
class Problem4 {

def length(l:List[Int]):Int = {
 l.foldLeft(0){(m,n) => m + 1}
}

}

object Problem4 extends App {
 val list = List(9,1,2,3,4,5,6)
 val pObj = new Problem4
 println("Length of list: "+pObj.length(list))
}
