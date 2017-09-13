package com.tests

object FlatMap extends App {
  
  val list : List [Int] = List (1,2,3,4,5)
  
  println (list.map(x => List (-x , 0, +x)))
  
    println (list.map(x => List (-x , 0, +x)).flatten)
    
  println (list.flatMap(x => List (-x , 0, +x)))

    
    val b : List[ List [List [Int]]] = List (List (
                                                  List (1,2,3), List (4,5,6)
                                                  )
                                                 ,
                                              List (List (7,8,9), List (10,11,12))
                                                  )   
                                                  
     println (b.flatMap( c => c).flatMap (c => c)
                               .flatMap ( c => List (-c, c)) )                                                 
                               
    
     println (Set (2,4,10, 11).flatMap(x => Set (x, x+5)))
     
     
     val map : Map [Int, String] = Map (1 -> "one", 2 -> "Two", 3 -> "Three", 4 -> "four")
     
     println ( map.flatMap( t => Map (t._1 ->  t._2, (t._1*100 ) -> (t._2 + "Hundered") )) )
     
     println (Some (4).map( x => Some ( x + 19) ) )
     
    println (Some (4).flatMap( x => Some ( x + 19) ) )
    
    
    // println (None.flatMap( x => Some (x +19)) )

    println (None. asInstanceOf [Option[Int]]flatMap( x => Some (x +19)) )
    
        println (Some (4).flatMap( x => None ) )
   
println (List (Some (4), None, None, Some (5), Some (6)).flatMap( x => x ) )
     

}