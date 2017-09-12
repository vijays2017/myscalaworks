package collections

/**
	Tuples are not actually not family of collections. However they are considered as collections
	because we can store
*/
object ExmpleTuples {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(210); 
  println("Welcome to the Scala worksheet");$skip(56); 
  
  val personInfo= ("Vijay ", "Srivastava", "M ", 30);System.out.println("""personInfo  : (String, String, String, Int) = """ + $show(personInfo ));$skip(93); val res$0 = 
      
      // getclass is a function used as an opertaor.
      
      personInfo getClass;System.out.println("""res0: Class[?0] = """ + $show(res$0));$skip(27); val res$1 = 
      
      personInfo._1;System.out.println("""res1: String = """ + $show(res$1));$skip(27); val res$2 = 
      
      personInfo._2;System.out.println("""res2: String = """ + $show(res$2));$skip(46); 
      
   
   val genderInfo = "Vijay" -> "M";System.out.println("""genderInfo  : (String, String) = """ + $show(genderInfo ));$skip(35); 
   
   
   val arr = Array ("1",1);System.out.println("""arr  : Array[Any] = """ + $show(arr ));$skip(222); 
     def fraction(numer:Double,denom:Double): Option[Double] = {
																					if (denom == 0)
																					  None
																					else
																					  Option(numer/denom)
																					};System.out.println("""fraction: (numer: Double, denom: Double)Option[Double]""")}
   
   
  }

//9336238280..
