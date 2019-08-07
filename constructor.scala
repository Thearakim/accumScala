//class cst(name: String, age: Int, School: String)
//{
//  def show()= println("Name : " + name)
//    println("Age : " + age)
//    println("School : " + School)
//}
//object constructor
//{
//  def main(args:Array[String])
//  {
//    var ob = new cst("Timmy", 18, "KIT")
//    ob.show()
//  }
//}

class human(var Speak: String)
{
  println("Say something human")
  println("I want to say "+ Speak)
  
  def show() = println(Speak) 
}
object constructor
{
  def main(args:Array[String])
  {
    var disp = new human("Hello World")
    disp.show()
  }
}