object PatternMatching {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(80); 
  val str = "Welcome to the Scala worksheet".split(" ");System.out.println("""str  : Array[String] = """ + $show(str ));$skip(31); 
  
  val lst = List (1,2,3,45);System.out.println("""lst  : List[Int] = """ + $show(lst ));$skip(52); 
  
 val Array (hr, min, sec) = "5:36:43".split(":");System.out.println("""hr  : String = """ + $show(hr ));System.out.println("""min  : String = """ + $show(min ));System.out.println("""sec  : String = """ + $show(sec ));$skip(14); val res$0 = 
	List (1,2,3);System.out.println("""res0: List[Int] = """ + $show(res$0));$skip(17); val res$1 = 

  1::2::3::Nil;System.out.println("""res1: List[Int] = """ + $show(res$1));$skip(167); 
  
  // Cons operator :: is used in match
  
  def listLenth (lst :List [Int]) : Int = lst match {
  	
  	case Nil => 0
  	
  	case h ::t => 1 + listLenth (t)
  	
  };System.out.println("""listLenth: (lst: List[Int])Int""");$skip(21); val res$2 = 
  
  listLenth (lst);System.out.println("""res2: Int = """ + $show(res$2));$skip(97); val res$3 = 
  
  lst.find(_>6) match {
  
  case None => "Not found"
  
  case Some (i) => "Found "+i
  
  }
  
  // Pattern matching in case classes
  // case classes are like struct in C lang
  
  case class Person (name : String, age : Int);System.out.println("""res3: String = """ + $show(res$3));$skip(206); 
  
  val people = Array (Person ("Mark" , 40), Person ("Amber" , 20 ));System.out.println("""people  : Array[PatternMatching.Person] = """ + $show(people ));$skip(129); 
  // 0th element on people arry assinged to new variable
  // having name and age  as n and a.
  val Person (n, a) = people (0);;System.out.println("""n  : String = """ + $show(n ));System.out.println("""a  : Int = """ + $show(a ))}
  
}
