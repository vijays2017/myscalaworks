

object TwoDArrayHourGlass extends App {
  
   val sc = new java.util.Scanner (System.in);
   
        var arr = Array.ofDim[Int](6,6);
        
        for {
          i <- 0 until  6
          j <- 0 until 6
          }
        {
              arr(i)(j) = sc.nextInt();
        }
          
        val hourGlass =
          for ( i <- arr.indices if  i  < 4)
            yield (subset (i, arr ))
        
            
            // Imp : how to pass 2D array
            
       def subset (i : Int, arry : Array[Array[Int]] )= {
        
      }
      
     
}