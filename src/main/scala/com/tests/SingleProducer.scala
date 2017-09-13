package com.tests

import akka.actor.Actor
import akka.actor.ActorSystem
import java.util.concurrent.atomic.AtomicInteger

object SingleProducer extends App {
  
  val list = List ("foo", "bar", "sha", "baz")
  
  val actorSystem = ActorSystem ("Test-System")
  
  import akka.actor.Props
  
  val persister = actorSystem.actorOf(Props[StringPersister])
  
  class StringPersister extends Actor
  {
    
    def receive = {
      
      case str : String =>
                println (s"${Thread.currentThread().getName} - is printing ")

        println (str)
    }
    
  }
  
  /* class StringToUpper extends Actor
  {
    
    def receive = {
      case 'GO => list foreach (persister ! _.toUpperCase())
    }
    
  }*/
  
  object StringToUpperProducer {
    
    val index : AtomicInteger = new AtomicInteger (0);
    
    
  }
    class StringToUpper extends Actor
  {
    
    def receive = {
      case 'GO => 
          var index = StringToUpperProducer.index.getAndIncrement
          
          while (index < list.length )
          {
            println (s"${Thread.currentThread().getName} - is sending message ${index}")
            persister ! list(index).toUpperCase()
            index = StringToUpperProducer.index.getAndIncrement
          }
    }
    
  }
  def multipleProducers () = {
    val toUpperCase1 =   actorSystem.actorOf(Props[StringToUpper])
    val toUpperCase2 =   actorSystem.actorOf(Props[StringToUpper])

    toUpperCase1 ! 'GO
    toUpperCase2 ! 'GO
  }

  def singleProducer  = list.foreach ( persister ! _.toUpperCase())
  
  singleProducer
  
  //multipleProducers
}