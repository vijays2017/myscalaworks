package actors

import scala.actors._

object SeriousActor extends Actor {
  
  def act() {
    
    for ( i  <- 1 to 5) 
    {
       println ("TO be or not to be")
       Thread.sleep(1000)
    }
  }
}