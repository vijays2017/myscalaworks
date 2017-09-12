package abstracttypes

object AbstractTypeTest extends App {
 
  val bessay  = new Cow
  
  println(bessay)
  
 // bessay eat (new Fish) // compilation error 'type misatch', Fish is not 'suitableFood' as defined in subclass COw.
  
  val lassie = new Dog 
  
    println(lassie)

  //lassie eat (new bessay.SuitableFood) //compilation error again 'type mismatch'
  
  val bootsie = new Dog
  
    println(bootsie)

  
  lassie eat (new bootsie.SuitableFood)
  
}