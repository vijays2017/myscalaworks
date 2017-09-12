package statefulobjects

object StateFulObjectsApp extends App {
  
  
  val ba = new BankAccount
  
  ba deposit 100 
  
   println( ba.balance)
  
  println (ba withdraw 80) 
  
  
  println ( ba withdraw 80)
  
  var t = new Time ();
  
  t.hour = 20
  
  t.minute = 20
   
  println (t.hour, t.minute)

   var t1 = new TimeWithChecks ();
  
  t1.hour = 20
  
  t1.minute = 59
  
  println (t1.hour, t1.minute)
  
  var thermo = new Thermometer()
  
  println(thermo)
  
  thermo.celsius = 100
  
  println (thermo)
  
  thermo.farhenheit = -40
  
  println (thermo)
}