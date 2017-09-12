

object DiagonalDifference {
 
  def main(args: Array[String]) {
    
   val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var a = Array.ofDim[Int](n,n);
  /*      for(a_i <- 0 to n-1) {
           for(a_j <- 0 to n-1){
              a(a_i)(a_j) = sc.nextInt();
           }
        }
        */
        
        for {
            i <- 0 until n
            j <- 0 until n 
                        
        }
        {
           a(i)(j) = sc.nextInt ()
        }
       var t1:Int = 0; var t2 = 0;
       
        val diag11 = for {
          
            i <- 0 until n
            j <- 0 until n
            if i == j
              temp = a(i)(j)
            if i + j == n-1
            temp1 = a(i)(j)
              
        } yield (temp , temp1)
        
       
       val diag1 = for {
            i <- 0 until n
            j <- 0 until n
            if i == j 
        } yield a(i)(j)
        
         val diag2  = for {
            i <- 0 until n
            j <- 0 until n 
            if i + j == n-1
        } yield a(i)(j)
        
       
        
         diag1.foreach( x => t1= t1+x) 
         
         diag2.foreach( x => t2= t2+x) 
         
       println (Math.abs(t1- t2))
   }
}