object CollectionsPart2 {
			  println("Welcome to the Scala worksheet")
                                                  //> Welcome to the Scala worksheet
			  
			  var arr= Array (1,2,3)  //> arr  : Array[Int] = Array(1, 2, 3)
			  
			  val list  = List (2,3,45,5)
                                                  //> list  : List[Int] = List(2, 3, 45, 5)
			  
			 arr.isEmpty              //> res0: Boolean = false
			 
			 arr.startsWith(Array (1,2))
                                                  //> res1: Boolean = true
			 
			 arr.indices              //> res2: scala.collection.immutable.Range = Range(0, 1, 2)
			 
			 
			 arr.nonEmpty             //> res3: Boolean = true
			 
			 arr.max                  //> res4: Int = 3
			 
			 
			 arr.min                  //> res5: Int = 1
			 arr.sum                  //> res6: Int = 6
			 
			 arr.product              //> res7: Int = 6
			 
			 arr.endsWith(Array (4,5))//> res8: Boolean = false
			 
			 1.toDouble               //> res9: Double = 1.0
			 
			 "1234".toInt             //> res10: Int = 1234
			 
			 list.toVector            //> res11: Vector[Int] = Vector(2, 3, 45, 5)
			 
			 
			 list.updated(1,100)      //> res12: List[Int] = List(2, 100, 45, 5)
			 
			 // append only
			 arr.patch(1, Array(100,200, 300),0)
                                                  //> res13: Array[Int] = Array(1, 100, 200, 300, 2, 3)
			 
			 //replace with new elements
			 arr.patch(1, Array(100,200, 300),3)
                                                  //> res14: Array[Int] = Array(1, 100, 200, 300)
			 
			 
			 //Set operations
			 // arr= Array (1,2,3)
			 var arr4 = Array (1,3,5,7,9)
                                                  //> arr4  : Array[Int] = Array(1, 3, 5, 7, 9)
 			arr4.intersect(arr)       //> res15: Array[Int] = Array(1, 3)
 			
 			arr.union(arr4)           //> res16: Array[Int] = Array(1, 2, 3, 1, 3, 5, 7, 9)
 		
 			arr4.diff(arr)            //> res17: Array[Int] = Array(5, 7, 9)
 
		  	arr4 = Array (1, 1,3,5,7,9)
		 
		 		arr4.diff(arr)    //> res18: Array[Int] = Array(1, 5, 7, 9)
 
 				arr4 = Array (1,3,5,7,9)
 
 			arr.union(arr4).distinct  //> res19: Array[Int] = Array(1, 2, 3, 5, 7, 9)
 
 
 			arr4.mkString             //> res20: String = 13579
 
 			arr4.mkString (",")       //> res21: String = 1,3,5,7,9
 			
 			arr4.mkString ("(", "," , ")")
                                                  //> res22: String = (1,3,5,7,9)
        
      arr4.view                                   //> res23: scala.collection.mutable.IndexedSeqView[Int,Array[Int]] = SeqView(...
                                                  //| )
      
      arr4.zip(arr)                               //> res24: Array[(Int, Int)] = Array((1,1), (3,2), (5,3))
				
			arr.zipWithIndex          //> res25: Array[(Int, Int)] = Array((1,0), (2,1), (3,2))
		
		arr.zip (arr.indices)             //> res26: Array[(Int, Int)] = Array((1,0), (2,1), (3,2))
}