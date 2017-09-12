

object ElementObj {
  
    def elem (contents : Array [String]) : Element = new ArrayElement (contents)
  
  def elem (chr : Char, width : Int , length : Int) : Element = 
    new UniformElement (chr, width, length)
  
  def elem (line : String) : Element = new LineElement (line)
  

}