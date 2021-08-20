class Rational(x: Int, y: Int){
    def n = x
    def d =y

    def neg = new Rational(-this.n, d)

    def sub(r:Rational) = new Rational(this.n*r.d - r.n*this.d, this.d*r.d)

    def -(r:Rational)=this.sub(r);

    override def toString = n + "/" + d
}

object RationalNums extends App{
    val x= new Rational(6, 8)
    val y= new Rational(5, 9)
    val z= new Rational(4, 13)
    println((x-y-z).toString())
}