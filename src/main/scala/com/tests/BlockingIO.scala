package com.tests

import akka.actor.Actor
import akka.actor.ActorSystem
import akka.actor.Props
import akka.util.Timeout

import scala.concurrent.duration._

import akka.pattern.ask
import akka.actor.ActorRef

object BlockingIO extends App {
  
  class Test1 extends Actor {
    
    def receive = {
      case str : String => 
        Thread.sleep(1000)
        sender() ! str.toLowerCase()
      
    }
    
  }
  
  def blockingOnMainThreadPool () = {
    
    val  system = ActorSystem("Test-Actors")   
    val actor1 = system.actorOf(Props[Test1])
    implicit val timeout = Timeout (5.second)
    import system.dispatcher
    
    (actor1 ? "FOo").foreach (println )
     (actor1 ? "BaR").foreach (println )
  }
  class UpStream (downStream  : ActorRef ) extends Actor {
   
    def receive = {
      case str : String => 
        {
          Thread.sleep(1000)
          downStream ! str.toLowerCase()
        }
    }
    
  }
   
  class DownStream extends Actor {
    
    def receive = {
      case str : String => println (str)
    }
  }
  
  
  class UpStream2 (processor : ActorRef, downStream  : ActorRef ) extends Actor {

     def receive = {
      case str : String => 
        {
          println ("Got message")
          
          downStream ! str.toLowerCase()
        import this.context.dispatcher
       implicit val timeout = Timeout (5.second)

      (processor ? str).foreach (downStream ! _ )
        }
    }
  }
  
  class Processor extends  Actor {
    def receive = {
      case str : String => {
        
        Thread.sleep(1000)
        sender() ! str.toLowerCase()
      }
    }
  }
 // blockingOnMainThreadPool2()
    blockingOnActorSystems()

  def blockingOnActorSystems () = {
    
    val system1 = ActorSystem("Test1")
    val system2 = ActorSystem("Test2")
    
    val proc = system1.actorOf(Props [Processor])
val ds= system1.actorOf(Props [DownStream])
    val us = system1.actorOf(Props(classOf[UpStream2], proc, ds))
    
    us ! "FoO"
    us ! "BaR"
  }
  def blockingOnMainThreadPool2 () = {
    
    val  system = ActorSystem("Test-Actors")
    val ds = system.actorOf(Props[DownStream])
    val us = system.actorOf(Props(classOf[UpStream], ds))
    
    ds ! "FoO"
     us ! "BaR" 
  }
}