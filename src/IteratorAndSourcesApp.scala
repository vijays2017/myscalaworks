import sun.security.util.Length


object IteratorAndSourcesApp extends App{
  
  
  Console.println("Hello World: " + (args mkString ", "))

  
   /* var line = ""
   do {
   		 line = readLine()
    	println("Read v1: "+ line)
    } while (line != "")
 
 
 var line1 = ""
 while ((line1 = readLine()) != "") // This doesn’t work! println("Read: "+ line)
    println("Read: "+ line)*/
  
    def multiTable () = {
    
      val tableSeq =
          for ( row <- 1 to 10 )
            yield (makeRow (row))
      
      // println(tableSeq)
       tableSeq.mkString ("\n")
       
   }
   
    def makeRow (row : Int) = makeRowSeq (row).mkString 
    
    def makeRowSeq (row : Int ) = {
        
      for (coll <- 1 to 10 ) yield // returning a collection.
      {
          val prod = (row*coll).toString()
          val padding = " " * (4 - prod.length)
          
          padding + prod
      }
    }
    
    println(multiTable())
}