package enums

object EnumTest extends App {
  
     object WeekDay extends Enumeration {
      type WeekDay = Value
     val Mon, Tue, Wed, Thu, Fri, Sat, Sun = Value
   }
     
       object Directions extends Enumeration {
      
         val North = Value ("NORTH")
         val South = Value ("SOUTH")
         val East = Value ("EAST")
         val West = Value ("WEST")
       
   }
  import Color._
  
  print(Color.Blue.id)
  
  for (c <- Color.values ) println ( (c , c.id))
  
  for (c <- Directions.values ) println ( (c , c.id))
  
  println(Directions(1))
}