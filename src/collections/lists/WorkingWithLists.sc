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
object WorkingWithLists {
  
  // List literals.
  
  val fruits = List ("apple", "orange" , "banana'")
                                                  //> fruits  : List[String] = List(apple, orange, banana')
  
  val nums = List (1,2,3)                         //> nums  : List[Int] = List(1, 2, 3)
  
  val matrix = List (
  									List (1,0,0) ,
  									List (0,1,0),
  									List (0,0,1)
  									)
                                                  //> matrix  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0, 1
                                                  //| ))
  
  
  // List Types
  
  val fruits1 : List [String] = List ("apple", "orange" , "banana'")
                                                  //> fruits1  : List[String] = List(apple, orange, banana')
  
  val numsOnly : List [Int] = List (1,2,3)        //> numsOnly  : List[Int] = List(1, 2, 3)
  
  val matrix2D :List [List [Int]] = List (
  									List (1,0,0) ,
  									List (0,1,0),
  									List (0,0,1)
  									)
                                                  //> matrix2D  : List[List[Int]] = List(List(1, 0, 0), List(0, 1, 0), List(0, 0,
                                                  //|  1))
 val empty : List [Nothing] = List ()             //> empty  : List[Nothing] = List()
 
 // Nothing is subclass of every class in Scala
 val emptyString : List [String] = List ()        //> emptyString  : List[String] = List()
                                                   

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
                                
                  }                               //> buildUsingCons: => Unit
                  
fruits.isEmpty                                    //> res0: Boolean = false
emptyString.isEmpty                               //> res1: Boolean = true

fruits.head                                       //> res2: String = apple

fruits.tail.head                                  //> res3: String = orange

matrix.head                                       //> res4: List[Int] = List(1, 0, 0)

// Lists can also participate in pattern matching

val List (a,b,c ) = fruits                        //> a  : String = apple
                                                  //| b  : String = orange
                                                  //| c  : String = banana'
val d :: e :: f :: rest = fruits                  //> d  : String = apple
                                                  //| e  : String = orange
                                                  //| f  : String = banana'
                                                  //| rest  : List[String] = List()

// List concatenation using :::


val newList = List (1,2,3 ) ::: List (3,4,5)      //> newList  : List[Int] = List(1, 2, 3, 3, 4, 5)

val newListt = List () ::: List (3,4,5)           //> newListt  : List[Int] = List(3, 4, 5)
}