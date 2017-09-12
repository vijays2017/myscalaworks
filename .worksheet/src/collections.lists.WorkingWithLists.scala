package collections.lists

/**
Lists are most commonly used data structue. This worksheet explains lists in detail.

NOTE 1 : Lists are quite similar to arrays, but there are two important differences.
				First, lists are immutable. That is, elements of a list cannot be changed by assignment.
				Second, lists have a recursive structure (i.e., a linked list),1 whereas arrays are ﬂat.

NOTE 2 : All lists are built from two fundamental building blocks, Nil and :: (pronounced “cons”).
				Nil represents the empty list.
				The inﬁx operator, ::, expresses list extension at the front. That is, x :: xs represents a list whose
				 ﬁrst element is x, followed by (the elements of) list xs.

NOTE 3 : All operations on lists can be expressed in terms of the following three:
					
					head returns the ﬁrst element of a list
					
					tail returns a list consisting of all elements except the ﬁrst
					
					isEmpty returns true if the list is empty
				 
*/
object WorkingWithLists {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(1067); 
  
  // List literals.
  
  val fruits = List ("apple", "orange" , "banana'");System.out.println("""fruits  : List[String] = """ + $show(fruits ));$skip(29); 
  
  val nums = List (1,2,3);System.out.println("""nums  : List[Int] = """ + $show(nums ));$skip(113); 
  
  val matrix = List (
  									List (1,0,0) ,
  									List (0,1,0),
  									List (0,0,1)
  									);System.out.println("""matrix  : List[List[Int]] = """ + $show(matrix ));$skip(94); 
  
  
  // List Types
  
  val fruits1 : List [String] = List ("apple", "orange" , "banana'");System.out.println("""fruits1  : List[String] = """ + $show(fruits1 ));$skip(46); 
  
  val numsOnly : List [Int] = List (1,2,3);System.out.println("""numsOnly  : List[Int] = """ + $show(numsOnly ));$skip(134); 
  
  val matrix2D :List [List [Int]] = List (
  									List (1,0,0) ,
  									List (0,1,0),
  									List (0,0,1)
  									);System.out.println("""matrix2D  : List[List[Int]] = """ + $show(matrix2D ));$skip(38); 
 val empty : List [Nothing] = List ();System.out.println("""empty  : List[Nothing] = """ + $show(empty ));$skip(93); 
 
 // Nothing is subclass of every class in Scala
 val emptyString : List [String] = List ();System.out.println("""emptyString  : List[String] = """ + $show(emptyString ));$skip(610); 
                                                   

/**
Constructing Lists using cons operator. x :: xs represents a list whose
				 ﬁrst element is x, followed by (the elements of) list xs.
*/
                                      
def buildUsingCons = {
                  	 val fruits =  "apple" :: ( "orange" ::( "banana" :: Nil) )
                  	  val nums = 1 :: 2 :: 3  :: Nil
                  	  
                  	    val matrix = 	1 :: 0 :: 0 :: Nil ::
  																		0 :: 1 :: 0 :: Nil ::
  																		0 :: 0 :: 1 :: Nil :: Nil
                                
                  };System.out.println("""buildUsingCons: => Unit""");$skip(34); val res$0 = 
                  
fruits.isEmpty;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(20); val res$1 = 
emptyString.isEmpty;System.out.println("""res1: Boolean = """ + $show(res$1));$skip(13); val res$2 = 

fruits.head;System.out.println("""res2: String = """ + $show(res$2));$skip(18); val res$3 = 

fruits.tail.head;System.out.println("""res3: String = """ + $show(res$3));$skip(13); val res$4 = 

matrix.head;System.out.println("""res4: List[Int] = """ + $show(res$4));$skip(79); 

// Lists can also participate in pattern matching

val List (a,b,c ) = fruits;System.out.println("""a  : String = """ + $show(a ));System.out.println("""b  : String = """ + $show(b ));System.out.println("""c  : String = """ + $show(c ));$skip(33); 
val d :: e :: f :: rest = fruits;System.out.println("""d  : String = """ + $show(d ));System.out.println("""e  : String = """ + $show(e ));System.out.println("""f  : String = """ + $show(f ));System.out.println("""rest  : List[String] = """ + $show(rest ));$skip(80); 

// List concatenation using :::


val newList = List (1,2,3 ) ::: List (3,4,5);System.out.println("""newList  : List[Int] = """ + $show(newList ));$skip(41); 

val newListt = List () ::: List (3,4,5);System.out.println("""newListt  : List[Int] = """ + $show(newListt ))}
}
