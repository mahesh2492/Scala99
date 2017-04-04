/*
  (*) Find out whether a list is a palindrome.
    Example:

    scala> isPalindrome(List(1, 2, 3, 2, 1))
    res0: Boolean = true
*/
class Problem6 {
 def isPallindrome(list:List[Int]):Boolean = {
  def isPallin(l1:List[Int],l2:List[Int]):Boolean = {
  if(l1.head != l2.last)
  false
  else if(l1.head == l2.last && l2.length != 1)
  isPallin(l1.tail,l2.init)
  else true
 }
  isPallin(list,list)
}
}

object Problem6 extends App {
 val list = List(1,2,3,2,1)
 val pObj = new Problem6
 println(list+ " Is It Pallindrome? "+pObj.isPallindrome(list))
 println(List(1,2,3,1,1)+ " Is It Pallindrome? "+pObj.isPallindrome(List(1,2,3,1,1)))
}
