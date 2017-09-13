package com.tests

case class Box [T] (t:T) {
  
  def boxWithU [U] (u : U) : Box [Couple [T, U]] = 
                            Box (Couple (t, u)) // Note : new keywords are removed because Box and Couple are case classes
                            
}