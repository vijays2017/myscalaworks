package com.tests

object ThreadSafety extends App {
  
  var domain : String = "" // static variable, shared
  
  def setDomain (input : String ) ={
    
    domain = input.toLowerCase();
    
    domain = domain.split("@")(1)
  }
  
  def getDomain = domain
  
  
  def setDomain2 (input : String ) = synchronized { 
    
    domain = input.toLowerCase();
    
    domain = domain.split("@")(1)
  }
  
  def getDomain2 = synchronized { domain }
  
  setDomain ("foo@bar.com")
  println (getDomain)
  
  
  setDomain2 ("foo@bar.com")
  println (getDomain2)
  
   def setDomain3 (input : String ) =  { 
    
    val lowerCased = input.toLowerCase();
    
    domain = lowerCased.split("@")(1)
  }
  
  def getDomain3 : String =  domain 
  
  
  setDomain3 ("foo@bar.com")
  println (getDomain3)
  
  
}