public class F2
{

  public static IntSeq ApplyToAll2 (Main.AA2 fun, IntSeq v1, IntSeq v2)
  {
    IntSeqIt is1 = new IntSeqIt(v1); //iterator to find length of v1
    IntSeqIt is2 = new IntSeqIt(v2); //iterator to find length of v2
    int length1 = 0; //length of v1
    int length2 = 0; //length of v2
    int currentval1 = -1; //current char of v1
    int currentval2 = -1; //current char of v2
    int currentpos = 0; //current position in
    while(is1.hasNext())
    {
      try
      {
        is1.next(); //iterate to end of sequence
        length1++; //counting length as you go
      }catch (UsingIteratorPastEndException e){}
    }//end while

    while(is2.hasNext())
    {
      try
      {
        is2.next();//iterate to end of sequence
        length2++; //counting length as you go
      }catch (UsingIteratorPastEndException e){}
    }//end while

    IntSeqIt is3 = new IntSeqIt(v1); //iterator for traversing through v1
    IntSeqIt is4 = new IntSeqIt(v2); //iterator for traversing through v1

    if(length1 <= length2) //if v1 is shorter
    {
      int[] NewSeq = new int[length1]; //set array to length of v1
      while(is3.hasNext())
      {
        try
        {
          currentval1 = is3.next(); //get the next value of v1
          currentval2 = is4.next(); //get the next value of v2
          NewSeq[currentpos] = fun.go(currentval1, currentval2); //apply fun.go to them both
          currentpos++; //increment position in array
        }catch (UsingIteratorPastEndException e){}
      }//end while
      return new IntSeq(NewSeq);
    }//end if
    else //v2 > v1 or they're the same length
    {
      int[] NewSeq = new int[length2]; //set array to length of v2
      while(is4.hasNext())
      {
        try
        {
          currentval1 = is3.next(); //get the next value of v1
          currentval2 = is4.next(); //get the next value of v2
          NewSeq[currentpos] = fun.go(currentval1, currentval2); //apply fun.go to them both
          currentpos++; //increment position in array
        }catch (UsingIteratorPastEndException e){}
      }//end while
      return new IntSeq(NewSeq);
    }//end else
   }//end ApplyToAll2

}//end class
