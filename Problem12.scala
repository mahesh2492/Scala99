/*
(**) Decode a run-length encoded list.
    Given a run-length code list generated as specified in problem P10, construct its uncompressed version.

    Example:

    scala> decode(List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e)))
    res0: List[Symbol] = List('a, 'a, 'a, 'a, 'b, 'c, 'c, 'a, 'a, 'd, 'e, 'e, 'e, 'e)

*/

class Problem12 {
def decode(list: List[(Int,Symbol)]) = {
  list.flatMap(x =>
     List.fill(x._1)(x._2)
)

}
}

object Problem12 extends App {
 val pObj = new Problem12
 val list = List((4, 'a), (1, 'b), (2, 'c), (2, 'a), (1, 'd), (4, 'e))
 println("Decoded List: "+ pObj.decode(list))
}

