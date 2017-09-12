
object SumArrayBigInt  {

    def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var n = sc.nextBigInteger();
        var arr = new Array[BigInt](n.intValueExact());
        
        for(arr_i <- 0 to n.intValueExact()-1) {
           arr(arr_i) = sc.nextBigInteger();
        }
        
         var  s : BigInt =0 ;
      
         arr.foreach (x => s = s + x)
        
        println (s)
        
      
      
        //println (arr sum)
    }
}