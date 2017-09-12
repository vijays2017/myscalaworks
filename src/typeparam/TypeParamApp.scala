package typeparam

object TypeParamApp extends App {
  
  val slowAppendQueue = new SlowAppendQueue ( List (1,2,3));
  
  slowAppendQueue append( 4)
  
  println(slowAppendQueue)
  
  val slowHeadQueue = new SlowHeadQueue ( List (5,6,7));
  
  slowAppendQueue append(8)
  
  println(slowHeadQueue)
  
  
  val queue = ImmutableQueue ('a', 'b', 'c' )
  
}