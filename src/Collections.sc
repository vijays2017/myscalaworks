package test.scala

object Collections {
  
  // Array with Any types
  var ar = Array ("12",34, 22)                    //> ar  : Array[Any] = Array(12, 34, 22)
  
  // Array with Int types
  var arr = Array (12,34, 22)                     //> arr  : Array[Int] = Array(12, 34, 22)
  
  
  // lists are similar to Arrays but immutable
  
  var lst = List (1,2,3,4)                        //> lst  : List[Int] = List(1, 2, 3, 4)
  
  
  // Add 1 to the front of the list. Fast operation.  We made a new lst with last 3 elements.
  1::lst                                          //> res0: List[Int] = List(1, 1, 2, 3, 4)
  
  var ls2 = 1::lst                                //> ls2  : List[Int] = List(1, 1, 2, 3, 4)
  
  
 //-> This will give error lst (2) =100
 
 // Simple function calling
 def func(i:Int) = 42*i                           //> func: (i: Int)Int
 
 func(10)                                         //> res1: Int = 420
 
 
 var arrNew = new Array [Int] (100)               //> arrNew  : Array[Int] = Array(0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                                  //|  0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 
                                                  //| 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0
                                                  //| , 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0,
                                                  //|  0, 0, 0, 0, 0, 0, 0, 0)
 
 var arrNewStr = new Array [String] (100)         //> arrNewStr  : Array[String] = Array(null, null, null, null, null, null, null,
                                                  //|  null, null, null, null, null, null, null, null, null, null, null, null, nul
                                                  //| l, null, null, null, null, null, null, null, null, null, null, null, null, n
                                                  //| ull, null, null, null, null, null, null, null, null, null, null, null, null,
                                                  //|  null, null, null, null, null, null, null, null, null, null, null, null, nul
                                                  //| l, null, null, null, null, null, null, null, null, null, null, null, null, n
                                                  //| ull, null, null, null, null, null, null, null, null, null, null, null, null,
                                                  //|  null, null, null, null, null, null, null, null, null, null, null, null, nul
                                                  //| l, null, null, null, null)
  // 2 arg list. Called currying.
  var arrNewFill = Array.fill (100) ("hi")        //> arrNewFill  : Array[String] = Array(hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, 
                                                  //| hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, 
                                                  //| hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, 
                                                  //| hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, 
                                                  //| hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, 
                                                  //| hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi, hi)
                                                  
	 var arrNewFillInt = Array.fill (100) (10)//> arrNewFillInt  : Array[Int] = Array(10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 
                                                  //| 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 
                                                  //| 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 
                                                  //| 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 
                                                  //| 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 
                                                  //| 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10)
    
  // pass by name
  var arrNewFillDbl = Array.fill (10) (math.random)
                                                  //> arrNewFillDbl  : Array[Double] = Array(0.05848575035699233, 0.14554733799639
                                                  //| 93, 0.703481171915266, 0.42126497848809663, 0.6924756162154613, 0.5294923539
                                                  //| 039985, 0.6683620465265098, 0.42886333153118916, 0.350636668489105, 0.584246
                                                  //| 9853639503)
       
  
  def littleArray (i:Int) : Array[Int] = Array (i,i,i)
                                                  //> littleArray: (i: Int)Array[Int]
  
  
  littleArray(util.Random.nextInt(10))            //> res2: Array[Int] = Array(0, 0, 0)
  
  
  // See the rocket symbol '=>' here which makes the function as pass by name, instead of evaluating the function
  // it packages it and passed it as it is.
  def littleArr (i: => Int) : Array[Int] = Array (i,i,i)
                                                  //> littleArr: (i: => Int)Array[Int]
  
  
  littleArr(util.Random.nextInt(10))              //> res3: Array[Int] = Array(4, 2, 1)
  
  
  
  
  
}