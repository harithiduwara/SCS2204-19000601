class Rational(x: Int, y: Int){
    def n = x
    def d =y

    def neg = new Rational(-this.n, d)

    def s(r:Rational) = new Rational(this.n*r.d - r.n*this.d, this.d*r.d)

    def -(r:Rational)=this.s(r);

    override def toString = n + "/" + d
}

object RationalNums extends App{
    val x= new Rational(3, 4)
    val y= new Rational(5, 8)
    val z= new Rational(2, 7)
    println((x-y-z).toString())
}