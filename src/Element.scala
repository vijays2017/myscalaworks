/**
 * This is an abstract class having 3 methods. All the methods are parameterless.
 * Therefore parenthesis can be omitted. instead of:
		def width(): Int
		the method is deﬁned without parentheses:
		def width: Int
 *  we could have chosen to implement width and height as ﬁelds instead of methods,
 *  simply by changing the def in each deﬁnition to a val:
 * 
 */

import ElementObj.elem

abstract class Element {
  
  def contents : Array[String]
  
  def height : Int = contents.length
  
  def width : Int = if (height == 0) 0 else contents(0).length 
  
  /**
   *  Putting one element above another
   *  means concatenating the two contents values of the elements
   *  
   *  a,b,c 
   *  d,e,f
   */
  def above (that : Element ) : Element = /*new ArrayElement (this.contents ++ that.contents)*/ elem (this.contents ++ that.contents) 
  
  
  /**
   * To put two elements beside each other, we’ll create a new element 
   * in which every line results from concatenating corresponding lines
   * of the two elements. The below implementation is imperative style which has 
   * loop in which we index through the arrays. 
   *  
   */
  def besideImperativeStyle (that : Element) : Element =
  {
    val contents = new Array [String](this.contents.length)

    for (i <- 0 until this.contents.length) 
      contents(i) = this.contents(i) + that.contents(i)
    
 //   new ArrayElement (contents)
       elem (contents)
  }
  
  /**This is the FP style implementation of beside function. 
   * Here, the two arrays this.contents and that.contents are transformed
   *  into an array of pairs (as Tuple2s are called) using the zip operator. The zip method picks corresponding elements in its two arguments and forms an array of pairs. For instance, this expression:
			Array(1, 2, 3) zip Array("a", "b")
			will evaluate to:
			Array((1, "a"), (2, "b"))
   * 
   * The zipped array is then iterated over by a for expression. 
   * Here, the syntax “for ((line1, line2) <- ...)” allows you to name 
   * both elements of a pair in one pattern, i.e., 
   * line1 stands now for the ﬁrst element of the pair, and line2 stands for the second.
   * 
   * 
   * The for expression has a yield part and therefore yields a result. 
   * The result is of the same kind as the expression iterated over, i.e., it is an array. 
   * Each element of the array is the result of concatenating the corresponding lines, line1 and line2. 
   * So the end result of this code is the same as in the ﬁrst version of beside, 
   * but because it avoids explicit array indexing, the result is obtained in a less error-prone way. 
   */
  def beside (that : Element) : Element = 
   /* new ArrayElement ( 
        for (
            (line1, line2) <- this.contents zip that.contents
            ) yield (line1 + line2)
          )*/
     elem ( 
        for (
            (line1, line2) <- this.contents zip that.contents
            ) yield (line1 + line2)
          )
  
 override def toString = contents mkString "\n"
 
 

}