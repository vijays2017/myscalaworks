package collections

/**
	Tuples are not actually not family of collections. However they are considered as collections
	because we can store
*/
object ExmpleTuples {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
  val personInfo= ("Vijay ", "Srivastava", "M ", 30)
                                                  //> personInfo  : (String, String, String, Int) = ("Vijay ",Srivastava,"M ",30)
                                                  //| 
      
      // getclass is a function used as an opertaor.
      
      personInfo getClass                         //> res0: Class[?0] = class scala.Tuple4
      
      personInfo._1                               //> res1: String = "Vijay "
      
      personInfo._2                               //> res2: String = Srivastava
      
   
   val genderInfo = "Vijay" -> "M"                //> genderInfo  : (String, String) = (Vijay,M)
   
   
   val arr = Array ("1",1)                        //> arr  : Array[Any] = Array(1, 1)
     def fraction(numer:Double,denom:Double): Option[Double] = {
																					if (denom == 0)
																					  None
																					else
																					  Option(numer/denom)
																					}
                                                  //> fraction: (numer: Double, denom: Double)Option[Double]
   
   
  }

//9336238280..