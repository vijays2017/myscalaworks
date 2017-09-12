/*

For loops can be used as either expressions or statements.
 Expressions return values whereas statmenets do not return value.  Expressions can be chained.
 
 if/else is statement in java where as it is an expression in Java.
 
 In scala, 'yield' toggles between expression and statment.
*/

object ForLoops {
  println("Welcome to the Scala worksheet")       //> Welcome to the Scala worksheet
  
 val lst = List (1,2,3,4,5,6)                     //> lst  : List[Int] = List(1, 2, 3, 4, 5, 6)
 
 for ( l <- lst)
 {
 	l match {
 		case 1 => println("One")
 		case other => other
 		}                                 //> One
 }
  
 val x = for( l <- lst) yield
				 {
				 	l match {
				 		case 1 => 11
				 		case other => other
				 		} //> x  : List[Int] = List(11, 2, 3, 4, 5, 6)
				 }
				 
println(x)                                        //> List(11, 2, 3, 4, 5, 6)


  
}