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
    
    printf("%s Move by %s ---> %s", Point(2,4), Point(4,8), Point(2,4).move(4,8))

    printf("\n\n------Question 3-----\n")

    val distance = (a:Point, b:Point) => Math.sqrt((Math.pow((a.x - b.x), 2) + Math.pow((a.y - b.y), 2)).toDouble) //Third Question
    printf("Distance between %s and %s -> %s", Point(10,20), Point(30,25), distance(Point(10,20), Point(30,25)))


    printf("\n\n------Question 4-----\n")

    printf("%s --->Invert--> %s", Point(2,4), Point(2,4).invert)
    println("\n")
}

case class Point(a:Int, b:Int){
    def x:Int=a
    def y:Int=b

    // override def toString = "("+x+","+y+")"

    def move(dx:Int, dy:Int) = Point(this.x+dx, this.y+dy) // second Question

    def +(that:Point) = Point(this.x+that.x, this.y+that.y) //First question

    def invert :Point = Point(this.y, this.x) // 4th Question
}

