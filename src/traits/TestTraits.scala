package traits

object TestTraits extends App {
   
  class Frog extends Philosophical 
  
  val frog = new Frog 
  
  frog.philosophize()
  
  class Animal 
  
  trait HasLegs
  
  class AnotherFrog extends Animal with Philosophical  with HasLegs{
    
   override def  toString() = "green"
  
   override def philosophize = println { "It ain't be easy to be " + toString() + "!"}
  }
  
  val phil : Philosophical = new AnotherFrog
  
  phil.philosophize()
 
  
 // trait NoPoint(x : Int, y : Int)  // Won't compile
}