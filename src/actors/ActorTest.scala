package actors

object ActorTest extends App {
  
  //SillyActor.start(); SeriousActor.start()
    
  import scala.actors.Actor._
  
   /*self.receive { case x => println (x) }
  
  self ! "hello"*/
  print ("Main app done ")

  NameResolver.start(); NameResolverLoop.start()
  val seriousActorVal = actor {
    
     println ("That is the question")
      Thread.sleep(1000)
  }
  
  seriousActorVal.start()
   
   val echoctor = actor {
     receive { case x  => println ( "received " + x) }
  }
  
  
  val intActor = actor {
    
    
    receive {
      case x : Int => println (" I am an Integer")
    } 
    
  }
   echoctor ! "Hi There"
   intActor ! 5
   
   intActor ! "bla bla"
   
 
   
   NameResolver ! ("www.scala-lang.org" , self)

   self.receiveWithin(0) { case x => x}
   
   
   val sillyActor2 = actor {
     def emoteLater () {
       val mainActor = self 
         
        actor{
         
         Thread.sleep(1000);
         mainActor ! "Emote" 
       }
       
     }
        
     var emoted = 0
     
     emoteLater()
     
     loop {
       
       react {
         case "Emote" => println ("I'm acting")
           emoted+=1
           if (emoted < 5) 
               emoteLater()
               
         
         case msg => println (s"Receieved $msg")
       }
     }
     
   }
   
   sillyActor2 ! "Hi there"
}