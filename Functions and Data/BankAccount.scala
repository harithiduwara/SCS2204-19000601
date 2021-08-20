class Account(nic:String, accNo:Int, balance:Double){
    var Nic:String = nic
    var accoNo:Int = accNo
    var accBal:Double = balance

    override def toString = Nic+" "+accNo+" "+accBal

    def withdraw(amount:Double)=this.accBal=this.accBal-amount
    def deposit(amount:Double)=this.accBal=this.accBal+amount
    def transfer(amount:Double, account:Account)={
        this.withdraw(amount)
        account.deposit(amount)
    }

}

object BankAccount extends App{
    var bank:List[Account]=List(
    new Account("981234560v",12234,23567), 
    new Account("981334580v",135767,-2000), 
    new Account("985677654v",250000,-3000), 
    new Account("199861684836",356752,360000))

    val overdraft=(bank:List[Account])=>bank.filter((x)=>x.accBal<0)

    val balance=(bank:List[Account])=>bank.reduce((x,y)=>new Account("",0,x.accBal+y.accBal))

    val interest=(bank:List[Account])=>bank.map((x)=>if(x.accBal<0) x.accBal=x.accBal+(x.accBal*0.1) else x.accBal=x.accBal+(x.accBal*0.05))

    println("\n\nBANK ACCOUNTS WITH NEGATIVE BALANCES:-")

    for(el<-overdraft(bank))
    {
        println(el.toString())
    }
    println("\n\nSUM OF ACCOUNT BALANCES:- "+balance(bank).accBal)

    println("\nBALANCES WITH INTEREST:-")
    interest(bank)
    for(el<-bank)
    {
        println(el.toString())
    }

}