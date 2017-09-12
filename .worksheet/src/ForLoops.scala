/*

For loops can be used as either expressions or statements.
 Expressions return values whereas statmenets do not return value.  Expressions can be chained.
 
 if/else is statement in java where as it is an expression in Java.
 
 In scala, 'yield' toggles between expression and statment.
*/

object ForLoops {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(356); 
  println("Welcome to the Scala worksheet");$skip(33); 
  
 val lst = List (1,2,3,4,5,6);System.out.println("""lst  : List[Int] = """ + $show(lst ));$skip(90); 
 
 for ( l <- lst)
 {
 	l match {
 		case 1 => println("One")
 		case other => other
 		}
 };$skip(115); 
  
 val x = for( l <- lst) yield
				 {
				 	l match {
				 		case 1 => 11
				 		case other => other
				 		}
				 };System.out.println("""x  : List[Int] = """ + $show(x ));$skip(24); 
				 
println(x)}


  
}
