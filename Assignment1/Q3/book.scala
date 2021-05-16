
object books extends App{
  def cost(c:Int):Double={
    if(c>50){
      var x:Double=((c*24.95*0.6)+3*50+(c-50)*0.75);
      x;
    }
    else{
      var x:Double=((c*24.95*0.6)+3*c);
      x;
    }
  }
    println(cost(60));
}
