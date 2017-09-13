package com.tests

import akka.actor._

object MessagePassingOveerThread extends App {
  
  val message1 = "Hello World"
  
  val message2 = "helloWorld" 
  
  class  Test (obj : String) extends Thread {
    
    override def run() : Unit = {
      
      Thread.sleep(1000)
      println (s"${Thread.currentThread().getName} - ${obj.toLowerCase()}") 
    }
    
  }
  
  def threadInvocations () = {
    
    val thread1 = new Test (message1)
    val thread2 = new Test (message2)
    
    thread1.start()
    
    thread2.start()
  }
  
  def threadPooling () = {
    import java.util.concurrent._
    
    val tp = new ThreadPoolExecutor (1, 5, 500 ,TimeUnit.MILLISECONDS, new LinkedBlockingQueue [Runnable]())
    
    tp.submit( new Runnable (){
      
      override def run () {
              println (s"${Thread.currentThread().getName} - ${message1.toLowerCase()}") 
      }
    })
    
     println (s"${Thread.currentThread().getName} Sent message to threadpool") 
     
    tp.submit( new Runnable (){
      
      override def run () {
              println (s"${Thread.currentThread().getName} - ${message2.toLowerCase()}") 
      }
    })
    
  //   println (s"${Thread.currentThread().getName} Sent message to threadpool") 
  
  }
  println ("hello")
  //threadInvocations()
  
  //threadPooling ()
  
  actors
  
  class Test2 extends Actor 
  {
    def receive =  {
      
      case str  : String => 
        Thread.sleep( 1000) 
        println (s"${Thread.currentThread().getName} - ${str.toLowerCase()}")
    }
    
  }
  
  def actors = {
    
    val system = ActorSystem ("Actors")
     val t2 =    system.actorOf(Props [Test2])
     
     t2 ! message1
     
     println (s"${Thread.currentThread().getName} Sent message to Actor")
    
    t2 ! message2
  }
  
  
  
}