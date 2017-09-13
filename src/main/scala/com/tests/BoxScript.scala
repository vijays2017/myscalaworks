package com.tests

object BoxScript extends App {
  
  val box1 = Box (Int)
  
  val box2 : Box [Int] = Box (1)
  val box3 = Box (1):Box [Int]
  
  val intBox : Int = box3.t
  
  val stringBox = Box ("hello")
  val strBox = Box [String] ("hello")
  
  val managerBox = Box [Employee]( new Manager ("Kathy", "sierra" , "Programmer" , new Department ("Programming and fun learning")))

  val doubleBoxBox = Box (Box (4.0))
  
  println (doubleBoxBox.t.t)
  
 val box4 = Box (200)
 
  val boxWithCouple: Box[Couple[Int, String]] = box4.boxWithU("Scala")
  
  println (boxWithCouple.t.first)
  println (boxWithCouple.t.second)
  
  
}