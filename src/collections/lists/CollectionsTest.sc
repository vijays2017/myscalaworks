package collections.lists

object CollectionsTest {

		// Lists
		
		val colors = List ("red", "blue", "green")
                                                  //> colors  : List[String] = List(red, blue, green)
		
		colors.head                       //> res0: String = red
		
		colors.tail                       //> res1: List[String] = List(blue, green)
		
		// Arrays
		
		val fiveInts = Array [Int] (5)    //> fiveInts  : Array[Int] = Array(5)
		val fiveToOne = Array (5,4,3,2,1) //> fiveToOne  : Array[Int] = Array(5, 4, 3, 2, 1)
		
		fiveInts (0) = fiveToOne (4)
		
		fiveInts                          //> res2: Array[Int] = Array(1)
		
		import scala.collection.mutable.ListBuffer
		
		val buf= new ListBuffer [Int]     //> buf  : scala.collection.mutable.ListBuffer[Int] = ListBuffer()
		
		buf += 1                          //> res3: collections.lists.CollectionsTest.buf.type = ListBuffer(1)
		buf += 2                          //> res4: collections.lists.CollectionsTest.buf.type = ListBuffer(1, 2)
		
		val buff = 3 +: buf               //> buff  : scala.collection.mutable.ListBuffer[Int] = ListBuffer(3, 1, 2)
		
		buff                              //> res5: scala.collection.mutable.ListBuffer[Int] = ListBuffer(3, 1, 2)
		
		buff.toList                       //> res6: List[Int] = List(3, 1, 2)


// ArrayBufs are mutable Arrays.
		
		import scala.collection.mutable.ArrayBuffer

// we don't specify the count
	val arrayBuf = ArrayBuffer [Int] ()       //> arrayBuf  : scala.collection.mutable.ArrayBuffer[Int] = ArrayBuffer()
		
		arrayBuf+= 12                     //> res7: collections.lists.CollectionsTest.arrayBuf.type = ArrayBuffer(12)
		
		arrayBuf += 15                    //> res8: collections.lists.CollectionsTest.arrayBuf.type = ArrayBuffer(12, 15)
                                                  //| 
		arrayBuf.length                   //> res9: Int = 2
		
		arrayBuf (1)                      //> res10: Int = 15

	// Queues : Queues are FIFO
	
	import scala.collection.immutable.Queue
	
	val queue =  Queue [Int] ()               //> queue  : scala.collection.immutable.Queue[Int] = Queue()
	
	val has1 = queue.enqueue(1)               //> has1  : scala.collection.immutable.Queue[Int] = Queue(1)
	
	println (has1)                            //> Queue(1)
	
	val has123 = has1.enqueue(List (2,3,4))   //> has123  : scala.collection.immutable.Queue[Int] = Queue(1, 2, 3, 4)
	
	val (element, has12)  = has123.dequeue    //> element  : Int = 1
                                                  //| has12  : scala.collection.immutable.Queue[Int] = Queue(2, 3, 4)
	
}