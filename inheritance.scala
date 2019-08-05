//base class
class a
{
  var name: String = "Timmy"
}
//derive class
//using extends keyword
class b extends a
{
  var age: Int = 2  
  //method
  def show()
  {
    println("Name : " + name)
    println("Age : " + age)
  }
}
object interitance
{
  //derive code
  def main(args:Array[String])
  {
    //creating object of derived class
    var ob = new b()
    ob.show()
  }
}
