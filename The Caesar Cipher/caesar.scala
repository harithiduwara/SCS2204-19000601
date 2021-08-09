object caesar extends App{
    
    val alphabet = "abcdefghijklmnopqrstuvwxyz"

    val en=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toLower)+key)%a.size)

    val de=(c:Char,key:Int,a:String)=> a((a.indexOf(c.toLower)-key)%a.size)

    val cipher=(algo:(Char,Int,String)=>Char, s:String,key:Int, a:String)=>s.map(algo(_,key,a))

    val Message= "SuraPappaIsComing"

    val fi= cipher(en, Message, 4, alphabet)
    print(fi)

    println("\n")
    
    val se= cipher(de, fi, 4, alphabet)
    print(se)

}
