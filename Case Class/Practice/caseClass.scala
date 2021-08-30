object caseClass extends App{
    val p1 = new Point(2, 3)
    val p2 = new Point(2, 3)

    println(p1)
    println(p2)

    println(p1==p2) //It compare addresses
    println(p1!=p2)

    val p3 = new Pointt(2, 3)
    val p4 = new Pointt(2, 3)

    println(p3)
    println(p4)

    println(p3==p4) //it compare values
    println(p3!=p4)
}

class Point(a:Int, b:Int){
    def x:Int=a
    def y:Int=b

    override def toString = "("+x+","+y+")"

}

class Pointt(a:Int, b:Int){
    def x:Int=a
    def y:Int=b

    override def toString = "("+x+","+y+")"
}