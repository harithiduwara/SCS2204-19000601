class Rational(x: Int, y: Int){
    def numer = x
    def denom =y

    def neg = new Rational(-this.numer, denom)

    def sub(r:Rational) = new Rational(this.numer*r.denom - r.numer*this.denom, this.denom*r.denom)

    def -(r:Rational)=this.sub(r);

    override def toString = numer + "/" + denom
}

object RationalNums extends App{
    val x= new Rational(3,4)
    val y= new Rational(5,8)
    val z= new Rational(2,7)
    println((x-y-z).toString())
}