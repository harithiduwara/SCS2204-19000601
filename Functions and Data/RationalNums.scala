class Rational(x: Int, y: Int){
    def n = x
    def d =y

    def neg = new Rational(-this.n, d)

    def s(r:Rational) = new Rational(this.n*r.d - r.n*this.d, this.d*r.d)

    def -(r:Rational)=this.s(r);

    override def toString = n + "/" + d
}

object RationalNums extends App{
    val a= new Rational(6, 3)
    val b= new Rational(5, 9)
    val c= new Rational(4, 1)
    println((a-b-c).toString())
}