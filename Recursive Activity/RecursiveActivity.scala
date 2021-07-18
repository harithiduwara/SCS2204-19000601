object RecursiveActivity extends App{
	
def gcd(a:Int, b:Int):Int = b match{
	case 0 => a
	case b if (b>a) => gcd(b, a)
	case b => gcd(b, a%b)
}

// println(gcd(35,15))

def primeN(c:Int, d:Int =2) : Boolean = c match{
	case c if(c==d) => true
	case c if gcd(c, d)>1 => false
	case c => primeN(c, d+1)
}

println("\nQestion 1")
println(primeN(101))

def printprime(e: Int, f: Int= 2): Any ={
	if(e>=f){
		if(primeN(f)) println(f)
		printprime(e, f+1)
	};
} 

println("\nQestion 2")
printprime(10)



def addtilln(g: Int): Int = {
	if(g == 1) 1
	else (g + addtilln(g-1))
}

println("\nQestion 3")
println(addtilln(12))

def even(h: Int): Boolean = h match{
	case 0 => true
	case _ => odd(h-1)
}

def odd(h: Int): Boolean = !(even(h))

println("\nQestion 4")
println(even(100))
println(odd(99))
println(odd(98))


// def letscounteventilln(i: Int, j: Int=0) : Int = i match{
// 	case 0 => 0
// 	case 1 => 1
// 	case i if(i<0) => 0
// 	case _ => (if(j==0) (i + {
// 		if(1%2==0)letscounteventilln(i-2)
// 		else letscounteventilln(i-1)})
// 		else {if(1%2==0)letscounteventilln(i-2)
// 			  else letscounteventilln(i-1)})
// }


// def addifeven(i : Int): Int ={
// 	if(i%2==0) addifeven(i-2)
// 	else addifeven(i-1)
// }

// def letscounteventilln(i: Int, j: Int=0) : Int = i match{
// 	case 0 => 0
// 	case 1 => 1
// 	case i if(i<0) => 0
// 	case i => (i + addifeven(i-2))
// }

println("\nQestion 5")

def getEvenAddition(n:Int, m:Int=1):Int = m match {
    case m if(m==n) => 0
    case m if(even(m)) => m+getEvenAddition(n,m+1)
    case m => getEvenAddition(n,m+1)
}

println(getEvenAddition(10))

def getFib(n:Int):Int = n match{
    case 0 => 0
    case 1 => 1 
    case _ => getFib(n-1) + getFib(n-2)
}

def printFib(n:Int) : Unit = {
    if(n>0) printFib(n-1)
    println(getFib(n))
}

println("\nQestion 6")
printFib(5)



}

