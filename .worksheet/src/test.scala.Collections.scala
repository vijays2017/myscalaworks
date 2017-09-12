package test.scala

object Collections {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(100); 
  
  // Array with Any types
  var ar = Array ("12",34, 22);System.out.println("""ar  : Array[Any] = """ + $show(ar ));$skip(59); 
  
  // Array with Int types
  var arr = Array (12,34, 22);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(83); 
  
  
  // lists are similar to Arrays but immutable
  
  var lst = List (1,2,3,4);System.out.println("""lst  : List[Int] = """ + $show(lst ));$skip(109); val res$0 = 
  
  
  // Add 1 to the front of the list. Fast operation.  We made a new lst with last 3 elements.
  1::lst;System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(22); 
  
  var ls2 = 1::lst;System.out.println("""ls2  : List[Int] = """ + $show(ls2 ));$skip(101); 
  
  
 //-> This will give error lst (2) =100
 
 // Simple function calling
 def func(i:Int) = 42*i;System.out.println("""func: (i: Int)Int""");$skip(12); val res$1 = 
 
 func(10);System.out.println("""res1: Int = """ + $show(res$1));$skip(40); 
 
 
 var arrNew = new Array [Int] (100);System.out.println("""arrNew  : Array[Int] = """ + $show(arrNew ));$skip(44); 
 
 var arrNewStr = new Array [String] (100);System.out.println("""arrNewStr  : Array[String] = """ + $show(arrNewStr ));$skip(77); 
  // 2 arg list. Called currying.
  var arrNewFill = Array.fill (100) ("hi");System.out.println("""arrNewFill  : Array[String] = """ + $show(arrNewFill ));$skip(95); 
                                                  
	 var arrNewFillInt = Array.fill (100) (10);System.out.println("""arrNewFillInt  : Array[Int] = """ + $show(arrNewFillInt ));$skip(75); 
    
  // pass by name
  var arrNewFillDbl = Array.fill (10) (math.random);System.out.println("""arrNewFillDbl  : Array[Double] = """ + $show(arrNewFillDbl ));$skip(66); 
       
  
  def littleArray (i:Int) : Array[Int] = Array (i,i,i);System.out.println("""littleArray: (i: Int)Array[Int]""");$skip(45); val res$2 = 
  
  
  littleArray(util.Random.nextInt(10));System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(221); 
  
  
  // See the rocket symbol '=>' here which makes the function as pass by name, instead of evaluating the function
  // it packages it and passed it as it is.
  def littleArr (i: => Int) : Array[Int] = Array (i,i,i);System.out.println("""littleArr: (i: => Int)Array[Int]""");$skip(43); val res$3 = 
  
  
  littleArr(util.Random.nextInt(10));System.out.println("""res3: Array[Int] = """ + $show(res$3))}
  
  
  
  
  
}
