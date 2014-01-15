public class F1
{
  public static CharSeq ApplyToAll1 (Main.AA1 fun, CharSeq s)
  {
    CharSeqIt csi = new CharSeqIt(s); //initialize iterator
    String NewSeq = ""; //initialize string to stick th result of fun.go into
    char currentval = 0; //current char
    while(csi.hasNext())
    {
      try
      {
        currentval = csi.next(); //currentval = current value
        NewSeq = NewSeq + fun.go(currentval); //fun.go results go into NewSeq
      }catch (UsingIteratorPastEndException e){}

    }//end while
    return new CharSeq(NewSeq); 
  }//end ApplyToAll1
}
