
class supC  //create parent_class 
{
  def NumberOfStudent() =   //method equal 0
  {
    0
  }
}
class subC0 extends supC    //sub_class0 extend parent_class
{
  override def NumberOfStudent() = //override method equal 1 in parent_class
  {
    1
  }
}
class subC1 extends supC   //sub_class1 extend parent_class
{
  override def NumberOfStudent() = //override method equal 2in parent_class
  {
    2
  }
}
class subC2 extends supC  //sub_class2 extend parent_class
{
  override def NumberOfStudent() =   //overriding method from parent_class
  {
    3
  }
}

object overriding
{
  def main(args:Array[String])
  {
    //create instance for all sub_classes
    var x = new supC()
    var y = new subC0()
    var z = new subC1()
    var w = new subC2()
    
    println("number of student in parent_class : " + x.NumberOfStudent())
    println("number of student in subclass_0 : " + y.NumberOfStudent())
    println("number of student in subclass_1 : " + z.NumberOfStudent())
    println("number of student in subclass_2 : " + w.NumberOfStudent() )
  }
}