/**
* 3.2: tail
*/
def tail[A](l: List[A]): List[A] = 
    l match {
        case Nil => sys.error("tail of empty list")
        case Cons(_,t) => t
    }

/**
* 3.3: setHead
*/

def setHead[A](l: List[A], a: [A]): List[A] = l match {
    case Nil => sys.error("set head of empty list")
    case Cons(_, t) => Cons(a, t)
}


