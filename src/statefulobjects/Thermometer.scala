package statefulobjects

class Thermometer {
  
  // Initializes to zero. '=_' is an initializer to default data type. zero for numeric types
  // false for boolean and null for type refs.
  
  var celsius : Float =_   
    
  def farhenheit = celsius * 9/5 +32 
  
  def farhenheit_= (f : Float)
  {
    celsius = (f -32 )*5/9
    
  }
  
  override  def toString  =farhenheit + "F/" + celsius + "C"
  
}