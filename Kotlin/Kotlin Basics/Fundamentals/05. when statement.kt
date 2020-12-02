fun main(){
  println("enter ac status: ")
  var account =  readLine()
  when(account){
    "verified" -> println("You can access the data")
    "unverified" -> println("You cannot access the data")
    else -> {
      println("Please enter valid choice")
    }
  }
}
 
