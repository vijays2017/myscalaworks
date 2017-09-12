

object ReverseArray extends App {
  
  val sc = new java.util.Scanner (System.in);
        var n = sc.nextInt();
        var arr = new Array[Int](n);
        for(i <- 0 until n ) {
           arr(i) = sc.nextInt();
        }
  
       // val a2 
       // arr.reverse
        val result = reverse (arr.toList).mkString (" ")
        
        print(result)
       
    def reverse (a : List [Int]) : List [Int] =  a match {
      
      case Nil => {
        println (s"None matched and returnin $a")
        a 
      }  
      
      case (x :: xs) => {
      
        println {s"x is $x and xs is $xs"}
        
        reverse(xs) ::: List(x)
      }
      
    }
}