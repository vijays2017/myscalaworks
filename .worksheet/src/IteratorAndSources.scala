
object IteratorAndSources  extends App {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(85); 
  println("Welcome to the Scala worksheet");$skip(22); 
  
  
  var line = "";System.out.println("""line  : String = """ + $show(line ));$skip(86); 
   do {
   		 line = readLine()
    	println("Read: "+ line)
    } while (line != "");$skip(20); 
 
 
 var line1 = "";System.out.println("""line1  : String = """ + $show(line1 ));$skip(110); 
 while ((line1 = readLine()) != "") // This doesn’t work! println("Read: "+ line)
    println("Read: "+ line)}
    
}
