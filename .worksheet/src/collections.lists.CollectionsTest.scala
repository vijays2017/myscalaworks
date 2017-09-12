package collections.lists

object CollectionsTest {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(111); 

		// Lists
		
		val colors = List ("red", "blue", "green");System.out.println("""colors  : List[String] = """ + $show(colors ));$skip(17); val res$0 = 
		
		colors.head;System.out.println("""res0: String = """ + $show(res$0));$skip(17); val res$1 = 
		
		colors.tail;System.out.println("""res1: List[String] = """ + $show(res$1));$skip(51); 
		
		// Arrays
		
		val fiveInts = Array [Int] (5);System.out.println("""fiveInts  : Array[Int] = """ + $show(fiveInts ));$skip(36); 
		val fiveToOne = Array (5,4,3,2,1);System.out.println("""fiveToOne  : Array[Int] = """ + $show(fiveToOne ));$skip(34); 
		
		fiveInts (0) = fiveToOne (4);$skip(14); val res$2 = 
		
		fiveInts
		
		import scala.collection.mutable.ListBuffer;System.out.println("""res2: Array[Int] = """ + $show(res$2));$skip(83); 
		
		val buf= new ListBuffer [Int];System.out.println("""buf  : scala.collection.mutable.ListBuffer[Int] = """ + $show(buf ));$skip(14); val res$3 = 
		
		buf += 1;System.out.println("""res3: collections.lists.CollectionsTest.buf.type = """ + $show(res$3));$skip(11); val res$4 = 
		buf += 2;System.out.println("""res4: collections.lists.CollectionsTest.buf.type = """ + $show(res$4));$skip(25); 
		
		val buff = 3 +: buf;System.out.println("""buff  : scala.collection.mutable.ListBuffer[Int] = """ + $show(buff ));$skip(10); val res$5 = 
		
		buff;System.out.println("""res5: scala.collection.mutable.ListBuffer[Int] = """ + $show(res$5));$skip(17); val res$6 = 
		
		buff.toList


// ArrayBufs are mutable Arrays.
		
		import scala.collection.mutable.ArrayBuffer;System.out.println("""res6: List[Int] = """ + $show(res$6));$skip(152); 

// we don't specify the count
	val arrayBuf = ArrayBuffer [Int] ();System.out.println("""arrayBuf  : scala.collection.mutable.ArrayBuffer[Int] = """ + $show(arrayBuf ));$skip(19); val res$7 = 
		
		arrayBuf+= 12;System.out.println("""res7: collections.lists.CollectionsTest.arrayBuf.type = """ + $show(res$7));$skip(20); val res$8 = 
		
		arrayBuf += 15;System.out.println("""res8: collections.lists.CollectionsTest.arrayBuf.type = """ + $show(res$8));$skip(18); val res$9 = 
		arrayBuf.length;System.out.println("""res9: Int = """ + $show(res$9));$skip(18); val res$10 = 
		
		arrayBuf (1)

	// Queues : Queues are FIFO
	
	import scala.collection.immutable.Queue;System.out.println("""res10: Int = """ + $show(res$10));$skip(104); 
	
	val queue =  Queue [Int] ();System.out.println("""queue  : scala.collection.immutable.Queue[Int] = """ + $show(queue ));$skip(31); 
	
	val has1 = queue.enqueue(1);System.out.println("""has1  : scala.collection.immutable.Queue[Int] = """ + $show(has1 ));$skip(18); 
	
	println (has1);$skip(43); 
	
	val has123 = has1.enqueue(List (2,3,4));System.out.println("""has123  : scala.collection.immutable.Queue[Int] = """ + $show(has123 ));$skip(42); 
	
	val (element, has12)  = has123.dequeue;System.out.println("""element  : Int = """ + $show(element ));System.out.println("""has12  : scala.collection.immutable.Queue[Int] = """ + $show(has12 ))}
	
}
