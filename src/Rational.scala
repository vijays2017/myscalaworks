

class Rational (n : Int , d: Int) {
  
  require (d !=0) //predefined function in Predef. 
  
  private val g = gcd (n.abs, d.abs) 
  
  val numer = n/g
  val denom = d/g
  
  def this (n : Int) = this (n , 1)  // Auxiliary constructor.

  def + (that : Rational) : Rational = new Rational (
        numer*that.denom + that.numer*denom, 
        denom*that.denom
      )
 
 def - (that : Rational) : Rational = new Rational (
        numer*that.denom - that.numer*denom, 
        denom*that.denom
      )
 
 
 def * (that : Rational) : Rational = new Rational (
        numer*that.numer , 
        denom*that.denom
      ) 
  
  def / (that : Rational) : Rational = new Rational (
        numer*that.denom , 
        denom*that.numer
      ) 
  
  def + (n : Int) : Rational = new Rational (
        numer + n *denom, 
        denom
      )
  
  def - (n : Int) : Rational = new Rational (
        numer - n*denom, 
        denom
      )
  
   def * (n : Int) : Rational = new Rational (
        numer * n, 
        denom
      )
  
  
   def / (n : Int) : Rational = new Rational (
        numer , 
        denom* n
      )
  
  private def gcd ( a : Int, b : Int ) : Int = if (b == 0) a ; else gcd (b ,a%b)
  
  
  override def toString() = numer + "/" + denom
  
}