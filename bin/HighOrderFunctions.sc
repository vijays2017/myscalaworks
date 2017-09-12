/**
		---NOTES ------------
Functions are first class Objects in Scala.
In other words Functios are first class citizens in Scala.

Higher Order Functions can take Function as an input and they can return Function as an output .
Another variation can be a higher order function can take
Any value as input and return Function as an output .
Similarly, a higher order function can take
Function as input and can return Any value as an output .

In case of methods , a higher order Method can take
Any value as input but can not return Function as an output .
A higher order method can take
Function as input and can return Any value as an output .

*/
object HighOrderFunctions {
  	println("Welcome to the high order functions ")
                                                  //> Welcome to the high order functions 
 
 
 	def compStrings (s1 : String, s2: String) : Int = {
 			if (s1 == s2) 0
 			
 			else if (s1 > s2) -1
 			
 			else 1
 		}                                 //> compStrings: (s1: String, s2: String)Int
 
 		compStrings ("abc", "xyz")        //> res0: Int = 1
 	
 		compStrings ("edabc", "xyz")      //> res1: Int = 1
 		
 		val a = Array (1,2,3,4,5)         //> a  : Array[Int] = Array(1, 2, 3, 4, 5)
 		
 		val b  = List ( 5,2,8,1,19)       //> b  : List[Int] = List(5, 2, 8, 1, 19)
 		
 			val c = Vector.tabulate(10)( i=> i*i)
                                                  //> c  : scala.collection.immutable.Vector[Int] = Vector(0, 1, 4, 9, 16, 25, 36
                                                  //| , 49, 64, 81)
  	// for each doesnot give back anything
 		a.foreach(i => println (i))       //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
 		
 		a.foreach(println)                //> 1
                                                  //| 2
                                                  //| 3
                                                  //| 4
                                                  //| 5
     
    a.map(i => i*2)                               //> res2: Array[Int] = Array(2, 4, 6, 8, 10)
 		
 		
 		//something times 2
 		 a.map(_*2)                       //> res3: Array[Int] = Array(2, 4, 6, 8, 10)
 		 
 		 a.map(_+"is a number ")          //> res4: Array[String] = Array("1is a number ", "2is a number ", "3is a number
                                                  //|  ", "4is a number ", "5is a number ")
 
    b.filter(_<5)                                 //> res5: List[Int] = List(2, 1)
    
    
    /*****************flat maps ***********************************/
    //take function returns first n elements.
    
    a.map( i => b.take(i))                        //> res6: Array[List[Int]] = Array(List(5), List(5, 2), List(5, 2, 8), List(5, 
                                                  //| 2, 8, 1), List(5, 2, 8, 1, 19))
    
    
     a.map( i => b.take(i)).flatten               //> res7: Array[Int] = Array(5, 5, 2, 5, 2, 8, 5, 2, 8, 1, 5, 2, 8, 1, 19)
     
     
     c.exists(_>100)                              //> res8: Boolean = false
     
      c.exists(_<50)                              //> res9: Boolean = true
      
     c.forall(_<50)                               //> res10: Boolean = false
     
      c.forall(_<100)                             //> res11: Boolean = true
      
      
      
     // c.reduceLeft(op)
      
}