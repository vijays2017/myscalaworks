package actors

import scala.actors.Actor
import java.net.InetAddress
import java.net.UnknownHostException

object NameResolverLoop extends Actor {
  
  def act()
  {
    loop{
          react {
    
          case (name : String , actor : Actor ) => actor ! getIp (name)
          case msg => println (s"Unhandled message $msg")
          }
    
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