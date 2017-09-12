

object CompareTriplets  {
  
  def main(args: Array[String]) {
        val sc = new java.util.Scanner (System.in);
        var a0 = sc.nextInt()
        var a1 = sc.nextInt();
        var a2 = sc.nextInt();
        var b0 = sc.nextInt();
        var b1 = sc.nextInt();
        var b2 = sc.nextInt();
        
        val ratingsA = (a0, a1, a2)
        
        val ratingsB = (b0, b1, b2)
        
        
        var finaleScoreAlice = 0
        
        var finaleScoreBob = 0
        
        if (ratingsA._1 > ratingsB._1) finaleScoreAlice +=1 
              else if (ratingsA._1 < ratingsB._1)   finaleScoreBob +=1
        
        if (ratingsA._2 > ratingsB._2) finaleScoreAlice +=1 
            else if (ratingsA._2 < ratingsB._2)  finaleScoreBob +=1
        
        if (ratingsA._3 > ratingsB._3) finaleScoreAlice +=1 
            else if (ratingsA._3 < ratingsB._3) finaleScoreBob +=1
        
        print(finaleScoreAlice + " " +finaleScoreBob)
    }
}