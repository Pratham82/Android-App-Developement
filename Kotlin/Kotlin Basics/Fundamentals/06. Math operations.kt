fun main(){

  print("Enter years to get the hours: ")
  var years =  Integer.valueOf(readLine())
   println(calculateNoOfHours(years))

}

fun calculateNoOfHours(years: Int):Int{
  val  totalHours = years*365*24
  return totalHours
}
