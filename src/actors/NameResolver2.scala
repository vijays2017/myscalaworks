package actors

import scala.actors.Actor
import java.net.{InetAddress, UnknownHostException}

object NameResolver2 extends Actor{
  
  def act () {
    loop {
      
      react {
        case LookupIP (name , actor ) => actor ! LookUpResult (name, getIp(name))
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


case class LookupIP (name : String, respondTo : Actor) 

case class LookUpResult ( name : String, address : Option [InetAddress] )