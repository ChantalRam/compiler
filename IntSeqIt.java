public class IntSeqIt 
{
  protected IntSeq is; //IntSeq we're iterating over
  protected int position; //current position

  IntSeqIt(IntSeq seq)
  {
    is = seq; //initialize sequence
    position = 0; //initialize position to zero
  }//end constructor
  
  public boolean hasNext()
  {
   if(position < is.IntValues.length) //if we're not at the end yet return true
     return true; 
   else
     return false;
  }//end hasNext()
  
  public int next() throws UsingIteratorPastEndException
  {
    if(hasNext()) //if we're not at the end
    {
      position++; //increment position
      return is.IntValues[position - 1]; //return whatever's next
    }//end if
   
    else
      throw new UsingIteratorPastEndException(); //else throw exception
  }//end next()
}//end class
