package actors

import scala.actors._

object SillyActor extends Actor{
  
  def act() {
    
    
    for ( i <- 1 to 10 )
    {
      println ("Hi, I'm acting")
      Thread.sleep(1000)
    }
  }
  
}