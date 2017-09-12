/**
 * You can avoid the code smell by combining the parameter and 
 * the ﬁeld in a single parametric ﬁeld deﬁnition, as in this example.
 * 
 * Note that now the contents parameter is preﬁxed by val. 
 * This is a shorthand that deﬁnes at the same time a parameter and ﬁeld with the same name. 
 * Speciﬁcally, class ArrayElement now has an (unreassignable) ﬁeld contents,
 * which can be accessed from outside the class
 * 
 */

class ArrayElementShortCut (
  
    val contents: Array[String] 
  
) extends Element