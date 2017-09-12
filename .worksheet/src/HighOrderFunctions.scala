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
object HighOrderFunctions {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(729); 
  	println("Welcome to the high order functions ");$skip(129); 
 
 
 	def compStrings (s1 : String, s2: String) : Int = {
 			if (s1 == s2) 0
 			
 			else if (s1 > s2) -1
 			
 			else 1
 		};System.out.println("""compStrings: (s1: String, s2: String)Int""");$skip(32); val res$0 = 
 
 		compStrings ("abc", "xyz");System.out.println("""res0: Int = """ + $show(res$0));$skip(35); val res$1 = 
 	
 		compStrings ("edabc", "xyz");System.out.println("""res1: Int = """ + $show(res$1));$skip(33); 
 		
 		val a = Array (1,2,3,4,5);System.out.println("""a  : Array[Int] = """ + $show(a ));$skip(35); 
 		
 		val b  = List ( 5,2,8,1,19);System.out.println("""b  : List[Int] = """ + $show(b ));$skip(46); 
 		
 			val c = Vector.tabulate(10)( i=> i*i);System.out.println("""c  : scala.collection.immutable.Vector[Int] = """ + $show(c ));$skip(73); 
  	// for each doesnot give back anything
 		a.foreach(i => println (i));$skip(26); 
 		
 		a.foreach(println);$skip(26); val res$2 = 
     
    a.map(i => i*2);System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(46); val res$3 = 
 		
 		
 		//something times 2
 		 a.map(_*2);System.out.println("""res3: Array[Int] = """ + $show(res$3));$skip(33); val res$4 = 
 		 
 		 a.map(_+"is a number ");System.out.println("""res4: Array[String] = """ + $show(res$4));$skip(20); val res$5 = 
 
    b.filter(_<5);System.out.println("""res5: List[Int] = """ + $show(res$5));$skip(157); val res$6 = 
    
    
    /*****************flat maps ***********************************/
    //take function returns first n elements.
    
    a.map( i => b.take(i));System.out.println("""res6: Array[List[Int]] = """ + $show(res$6));$skip(46); val res$7 = 
    
    
     a.map( i => b.take(i)).flatten;System.out.println("""res7: Array[Int] = """ + $show(res$7));$skip(33); val res$8 = 
     
     
     c.exists(_>100);System.out.println("""res8: Boolean = """ + $show(res$8));$skip(27); val res$9 = 
     
      c.exists(_<50);System.out.println("""res9: Boolean = """ + $show(res$9));$skip(27); val res$10 = 
      
     c.forall(_<50);System.out.println("""res10: Boolean = """ + $show(res$10));$skip(28); val res$11 = 
     
      c.forall(_<100);System.out.println("""res11: Boolean = """ + $show(res$11))}
      
      
      
     // c.reduceLeft(op)
      
}
