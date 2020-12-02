fun  main(){

  //Variable declaration with data Types
  var simpleVar: String = "Just coding"

  // var values can be mutataed i.e reassigned again
  var firstName: String
  firstName =  "tester 1"
  firstName =  "tester 2"

  println(firstName)

  // val values cannot be mutated, if we try to reassign the values, compiler will throw error
  val lastName = "developer"
  lastName =  "tester" // This line will throw error
  print(lastName)

  //val values should also need to be initialized while declaration or have type annotation
  val testVariable  //err This variable must either have a type annotation or be initialized

}
