package com.tests

object CoupleScript extends App {
  
  val couple = Couple (10, "Scala")
  
  val couple2 : Couple [Int, String] = Couple (10, "Scala")
  
  val couple3 : Couple [String, String] = Couple ("Hello", "Scala")
  
  println (couple3)
  
  val couple4 : Couple [String, Couple [Int, Double]] = Couple ("Hello", Couple (3, 22.2))
  
  println (couple4.second.second)
  
  val empployeeCouple = Couple ( new Employee ("Don ", "Jones" ), new Employee ( "Sean" ,"Mark"))
  
  println (empployeeCouple)
  
  println (empployeeCouple.swap)
}