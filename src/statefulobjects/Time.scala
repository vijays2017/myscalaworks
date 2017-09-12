package statefulobjects

class Time {
  
 private var h  =12 
 
 private var m  = 0
 
 def hour : Int = h 
 
 def hour_=  (x : Int){
      h = x
   }
 
 def minute : Int = m
 
 def minute_=  (x : Int)  {m = x}
}