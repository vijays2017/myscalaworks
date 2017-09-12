/**
 * To invoke a superclass constructor, you simply place the argument or 
 * arguments you want to pass in parentheses following the name of the superclass.
 * For example,class LineElement passes Array(s) to ArrayElement’s primary 
 * constructor by placing it in parentheses after the superclass ArrayElement’s name
 * 
 * NOTE :  width and height in LineElement carry an override modiﬁer
 * 
 * Scala requires such a modiﬁer for all members that override a concrete member
 * in a parent class.
 * The modiﬁer is optional if a member implements an abstract member with the same name. 
 * The modiﬁer is forbidden if a member does not override or 
 * implement some other member in a base class. 
 * Since height and width in class LineElement override concrete deﬁnitions in class Element,
 * override is required.
 */

class LineElementOld (s : String ) extends ArrayElement (Array (s)){
  
  override def width = s.length
  
   override def height = 0
}