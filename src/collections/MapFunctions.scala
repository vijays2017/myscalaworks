package collections

object MapFunctions extends App {
  
  val s : List [Int] = List (1,2,3,4,5,6,7,8)
  
  println (s map (_+1))
    println (s map (1+_))
    println (s map (1+)) // postFix operator

  val s1 = Set ("Brown", "Red", "Green", "Purple", "Gray", "Yellow")
  
  println (s1.map(_.size))
  
    println (s1.map( x=> (x, x.size)))

     println ("hello".map(_+1))

    
   println ("hello".map(x => (x + 1).toChar))
   
   println (Some (4).map(_+1))
   
      //println (None.map(1+)) // if uncomment , won't compile .. Below is working code.

   println (None.asInstanceOf [Option[Int]].map(1+))
   
   val age : Option[Int] = None
   
   println (age.map(_+1))
   
  
   val teams = Map ('Argentina -> 5, 'England -> 6, 'Spain -> 7)
   
   val numbers  = Map (1 -> 'One, 2 -> 'Two, 3 -> 'Three , 4 -> 'Four)
   
   println (numbers.filterKeys(_ %2 == 0))
   
      println (Some (4).filter(_ %2==0))
      
    println (Some (5).filter(_ %2==0))
    
    
 val r = 1 to 10 
 
 println (r.map(println (_)))

   println (r.foreach(println (_)))
r.foreach(println (_)) // r.foreach(println)

   
}