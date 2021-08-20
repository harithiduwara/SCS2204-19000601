class Account(nic:String, accNo:Int, balance:Double){
    var usrNic:String = nic
    var accountNo:Int = accNo
    var accBalance:Double = balance

    override def toString = usrNic+" "+accountNo+" "+accBalance

    def withdraw(amount:Double)=this.accBalance=this.accBalance-amount
    def deposit(amount:Double)=this.accBalance=this.accBalance+amount
    def transfer(amount:Double, account:Account)={
        this.withdraw(amount)
        account.deposit(amount)
    }

}

object BankAccount extends App{
    var bank:List[Account]=List(new Account("123",1456123,25000), new Account("124",1456143,1000), new Account("122",1446143,-1000), new Account("234",1455143,100000))

    val overdraft=(bank:List[Account])=>bank.filter((x)=>x.accBalance<0)
    val balance=(bank:List[Account])=>bank.reduce((x,y)=>new Account("",0,x.accBalance+y.accBalance))
    val interest=(bank:List[Account])=>bank.map((x)=>if(x.accBalance<0) x.accBalance=x.accBalance+(x.accBalance*0.1) else x.accBalance=x.accBalance+(x.accBalance*0.05))

    println("\nLIST OF BANK ACCOUNTS WITH NEGATIVE BALANCES:-")
    for(el<-overdraft(bank))
    {
        println(el.toString())
    }
    println("\nSUM OF ALL ACCOUNT BALANCES:- "+balance(bank).accBalance)

    println("\nFINAL BALANCES WITH INTEREST:-")
    interest(bank)
    for(el<-bank)
    {
        println(el.toString())
    }

}