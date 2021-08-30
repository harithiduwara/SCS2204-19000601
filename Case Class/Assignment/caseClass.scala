object CaseClass extends App{
    val p1 = Point(2, 3)
    val p2 = Point(2, 3)
    val p3 = p2.copy()
    val p4 = p1.move(2,3)

    printf("\n\n------Testing-----\n\n")
    println(p1)
    println(p2)

    println(p1==p2) 
    println(p1!=p2)

    println(p3)
    println(p4)

    printf("\n\n------Question 1-----\n")
    val p5 = p1+p4
    println(p5)

    printf("\n\n------Question 2-----\n")

    printf("\n\n------Question 3-----\n")

    printf("\n\n------Question 4-----\n")



}

case class Point(a:Int, b:Int){
    def x:Int=a
    def y:Int=b

    // override def toString = "("+x+","+y+")"

    def move(dx:Int, dy:Int) = Point(this.x+dx, this.y+dy)
    def +(that:Point) = Point(this.x+that.x, this.y+that.y) //First question
}

