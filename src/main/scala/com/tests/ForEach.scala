package com.tests

object ForEach extends App {
  
  val list : List[Int] = List (1,2,3,4,5)
  
  println ( list.map(println (_)))
  
   println ( list.foreach(println (_)))

  list.foreach(println (_))
}