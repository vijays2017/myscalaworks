package statefulobjects

class TimeWithChecks {
  
  private [this] var h = 12
  
  private [this] var m = 12
  
  def hour : Int = h 
  
  def hour_= (x: Int){
    
    require ( x > 0 && x < 24)
    
    h = x
  }
  
  def minute : Int = m
  
  def minute_= (x: Int){
    
    require ( x > 0 && x < 60)
    
    m = x
  }
  
}