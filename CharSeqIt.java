public class CharSeqIt 
{
  protected CharSeq cs; //charseq we're iterating over
  protected int position; //current position

  CharSeqIt(CharSeq seq)
  {
    cs = seq; //initialize sequence
    position = 0; //initialize current position at zero
  }//end constructor
  
  public boolean hasNext()
  {
   if(position < cs.SeqValue.length()) //if we're not at the end yet return true
     return true; 
   else //otherwise return false
     return false;
  }//end hasNext()
  
  public char next() throws UsingIteratorPastEndException
  {

    if(hasNext()) //if we're not at the end
    {
      position++; //increment position
      return cs.SeqValue.charAt(position - 1); //return pre-increment value
    }//end if

     else //we're calling at the end, so we throw an exception
       throw new UsingIteratorPastEndException();
  }//end next()
}//end class
