

object TestApp extends App {
  
  println ("Hello!")
  
  case class Book (title : String, authors : String* ) 
  
  val books : List [Book] = List (
              
              Book(
              "Structure and Interpretation of Computer Programs",
              "Abelson, Harold", "Sussman, Gerald J."
              ),
              
              Book(
              "Principles of Compiler Design",
              "Aho, Alfred", "Ullman, Jeffrey"
              ),
              
              Book(
              "Programming in Modula2",
              "Wirth, Niklaus"
              ),
              
              Book(
              "Elements of ML Programming",
              "Ullman, Jeffrey"
              ),
              
              Book(
              "The Java Language Specification", "Gosling, James",
              "Joy, Bill", "Steele, Guy", "Bracha, Gilad"
              )
      )

}