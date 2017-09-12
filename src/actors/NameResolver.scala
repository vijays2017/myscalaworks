package actors

import scala.actors.Actor
import java.net.InetAddress
import java.net.UnknownHostException

object NameResolver extends Actor {
  
  def act()
  {
    react {
      
      case (name : String , actor : Actor ) => actor ! getIp (name)
      act ()
      
      case "EXIT" => println ("Exiting resolver entity")
      
      case msg => println (s"Unhandled message $msg")
      
      act ()
    }
    
    
  }
  
  def getIp (name : String) : Option [InetAddress] = {
    
    try {
    Some (InetAddress.getByName(name));
    }
    catch {
      case _:UnknownHostException => None
    }
  }
}