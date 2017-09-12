object PatternMatching {
  val str = "Welcome to the Scala worksheet".split(" ")
                                                  //> str  : Array[String] = Array(Welcome, to, the, Scala, worksheet)
  
  val lst = List (1,2,3,45)                       //> lst  : List[Int] = List(1, 2, 3, 45)
  
 val Array (hr, min, sec) = "5:36:43".split(":")  //> hr  : String = 5
                                                  //| min  : String = 36
                                                  //| sec  : String = 43
	List (1,2,3)                              //> res0: List[Int] = List(1, 2, 3)

  1::2::3::Nil                                    //> res1: List[Int] = List(1, 2, 3)
  
  // Cons operator :: is used in match
  
  def listLenth (lst :List [Int]) : Int = lst match {
  	
  	case Nil => 0
  	
  	case h ::t => 1 + listLenth (t)
  	
  }                                               //> listLenth: (lst: List[Int])Int
  
  listLenth (lst)                                 //> res2: Int = 4
  
  lst.find(_>6) match {
  
  case None => "Not found"
  
  case Some (i) => "Found "+i
  
  }                                               //> res3: String = Found 45
  
  // Pattern matching in case classes
  // case classes are like struct in C lang
  
  case class Person (name : String, age : Int)
  
  val people = Array (Person ("Mark" , 40), Person ("Amber" , 20 ))
                                                  //> people  : Array[PatternMatching.Person] = Array(Person(Mark,40), Person(Ambe
                                                  //| r,20))
  // 0th element on people arry assinged to new variable
  // having name and age  as n and a.
  val Person (n, a) = people (0);                 //> n  : String = Mark
                                                  //| a  : Int = 40
  
}