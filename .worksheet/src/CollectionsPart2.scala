object CollectionsPart2 {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(72); 
			  println("Welcome to the Scala worksheet");$skip(34); 
			  
			  var arr= Array (1,2,3);System.out.println("""arr  : Array[Int] = """ + $show(arr ));$skip(39); 
			  
			  val list  = List (2,3,45,5);System.out.println("""list  : List[Int] = """ + $show(list ));$skip(22); val res$0 = 
			  
			 arr.isEmpty;System.out.println("""res0: Boolean = """ + $show(res$0));$skip(37); val res$1 = 
			 
			 arr.startsWith(Array (1,2));System.out.println("""res1: Boolean = """ + $show(res$1));$skip(21); val res$2 = 
			 
			 arr.indices;System.out.println("""res2: scala.collection.immutable.Range = """ + $show(res$2));$skip(27); val res$3 = 
			 
			 
			 arr.nonEmpty;System.out.println("""res3: Boolean = """ + $show(res$3));$skip(17); val res$4 = 
			 
			 arr.max;System.out.println("""res4: Int = """ + $show(res$4));$skip(22); val res$5 = 
			 
			 
			 arr.min;System.out.println("""res5: Int = """ + $show(res$5));$skip(12); val res$6 = 
			 arr.sum;System.out.println("""res6: Int = """ + $show(res$6));$skip(21); val res$7 = 
			 
			 arr.product;System.out.println("""res7: Int = """ + $show(res$7));$skip(35); val res$8 = 
			 
			 arr.endsWith(Array (4,5));System.out.println("""res8: Boolean = """ + $show(res$8));$skip(21); val res$9 = 
			 
			 1.toDouble;System.out.println("""res9: Double = """ + $show(res$9));$skip(22); val res$10 = 
			 
			 "1234".toInt;System.out.println("""res10: Int = """ + $show(res$10));$skip(23); val res$11 = 
			 
			 list.toVector;System.out.println("""res11: Vector[Int] = """ + $show(res$11));$skip(34); val res$12 = 
			 
			 
			 list.updated(1,100);System.out.println("""res12: List[Int] = """ + $show(res$12));$skip(64); val res$13 = 
			 
			 // append only
			 arr.patch(1, Array(100,200, 300),0);System.out.println("""res13: Array[Int] = """ + $show(res$13));$skip(77); val res$14 = 
			 
			 //replace with new elements
			 arr.patch(1, Array(100,200, 300),3);System.out.println("""res14: Array[Int] = """ + $show(res$14));$skip(90); 
			 
			 
			 //Set operations
			 // arr= Array (1,2,3)
			 var arr4 = Array (1,3,5,7,9);System.out.println("""arr4  : Array[Int] = """ + $show(arr4 ));$skip(24); val res$15 = 
 			arr4.intersect(arr);System.out.println("""res15: Array[Int] = """ + $show(res$15));$skip(25); val res$16 = 
 			
 			arr.union(arr4);System.out.println("""res16: Array[Int] = """ + $show(res$16));$skip(23); val res$17 = 
 		
 			arr4.diff(arr);System.out.println("""res17: Array[Int] = """ + $show(res$17));$skip(35); 
 
		  	arr4 = Array (1, 1,3,5,7,9);$skip(24); val res$18 = 
		 
		 		arr4.diff(arr);System.out.println("""res18: Array[Int] = """ + $show(res$18));$skip(32); 
 
 				arr4 = Array (1,3,5,7,9);$skip(31); val res$19 = 
 
 			arr.union(arr4).distinct;System.out.println("""res19: Array[Int] = """ + $show(res$19));$skip(22); val res$20 = 
 
 
 			arr4.mkString;System.out.println("""res20: String = """ + $show(res$20));$skip(26); val res$21 = 
 
 			arr4.mkString (",");System.out.println("""res21: String = """ + $show(res$21));$skip(40); val res$22 = 
 			
 			arr4.mkString ("(", "," , ")");System.out.println("""res22: String = """ + $show(res$22));$skip(25); val res$23 = 
        
      arr4.view;System.out.println("""res23: scala.collection.mutable.IndexedSeqView[Int,Array[Int]] = """ + $show(res$23));$skip(27); val res$24 = 
      
      arr4.zip(arr);System.out.println("""res24: Array[(Int, Int)] = """ + $show(res$24));$skip(25); val res$25 = 
				
			arr.zipWithIndex;System.out.println("""res25: Array[(Int, Int)] = """ + $show(res$25));$skip(27); val res$26 = 
		
		arr.zip (arr.indices);System.out.println("""res26: Array[(Int, Int)] = """ + $show(res$26))}
}
