import java.io.*;
public class Minus
{

  public static IntSeq minus(IntSeq x, IntSeq y)
  {
    IntSeqIt xIt = new IntSeqIt(x); //for second iteration, finding repeated values
    IntSeqIt xItcount = new IntSeqIt(x); //for first iteration, finding length
    boolean found = false; //tells you whether a value's been found in both sequences or not
    int currentpos = 0; //current position within NewSeq
    int currentval = -1; //current value
    int count = 0; //length
    
    while(xItcount.hasNext()) //while we're not at the end
    {
      try
      {
        xItcount.next(); //move it to the next value
        count++;//increment the count
      }catch (UsingIteratorPastEndException e){}
    }//end while

    int[] NewSeq = new int[count]; //array length of first IntSeq

    while(xIt.hasNext())
    {
      try 
      {
        currentval = xIt.next(); //stick the current value in currentval
        found = false; //reset found to false
      }catch (UsingIteratorPastEndException e){} //catch if there's an error

      IntSeqIt yIt = new IntSeqIt(y); //iterator for the second IntSeq
      while(yIt.hasNext())
      {
        try
        {
          if(currentval == yIt.next()) //if the current value is in y
          {
            found = true; //we found it
            break;
           }//end if
        }catch (UsingIteratorPastEndException e){}
      }//end inner while
      if(!found) //if it wasn't in the second sequence
      {
        NewSeq[currentpos] = currentval; //shove it in NewSeq
        currentpos++; //increment the current position in NewSeq
      }//end if
    }//end outer while

    int[] CorrectLengthSeq = new int[currentpos]; 
    for(int i = 0; i < currentpos; i++)
       CorrectLengthSeq[i] = NewSeq[i];
    return new IntSeq(CorrectLengthSeq);
  }//end minus(Int, Int)



  public static CharSeq minus(CharSeq x, CharSeq y)
  {
    String NewSeq = ""; //for sticking unique values in
    CharSeqIt xIt = new CharSeqIt(x); //initialize iterator
    boolean found = false;
    char currentval = 0; //initialize current value
    while(xIt.hasNext())
    {
      try 
      {
        currentval = xIt.next(); //set currentvalue to the...current value
        found = false; //reset found to false
      }catch (UsingIteratorPastEndException e){}

      CharSeqIt yIt = new CharSeqIt(y); //second iterator for second CharSeq
      while(yIt.hasNext())
      {
        try
        {
          if(currentval == yIt.next()) //if the value is in both sequences
          {
            found = true; //we found it
            break;
           }//end if
        }catch (UsingIteratorPastEndException e){}
      }//end inner while
      if(!found) //if we didn't find it
        NewSeq= NewSeq + currentval; //shove it in the string
     }//end outer while
    return new CharSeq(NewSeq);
  }//end minus(Char, Char)

  public static CharSeq minus(IntSeq y, CharSeq x)
  {
   String NewSeq = ""; //for stickiing non-repeated values in
   CharSeqIt xIt = new CharSeqIt(x);//initialize iterator
   boolean found = false; 
   char currentval = 0;
   int i = 0; //position counter
   while(xIt.hasNext())
   {
      try
      {
        currentval = xIt.next(); //set current value to next
        found = false; //reset found to false
      }catch (UsingIteratorPastEndException e){}

      IntSeqIt yIt = new IntSeqIt(y); //initialize iterator for IntSeq
      while(yIt.hasNext())
      {
        try
        {
          if(i == yIt.next()) //if the position is a value in the IntSeq
          {
            found = true; //we found it
            break;
           }//end if
        }catch (UsingIteratorPastEndException e){}
      }//end inner while
     if(!found) //if we didn't find it
       NewSeq = NewSeq + currentval; //stick the char into the string
     i++; //increment the position every time we loop
   }//end outer while
   return new CharSeq(NewSeq);
   }//end minus(Int, Char)


  public static CharSeq minus(CharSeq x, IntSeq y)
  {
   String NewSeq = ""; //for stickiing non-repeated values in
   CharSeqIt xIt = new CharSeqIt(x);//initialize iterator
   boolean found = false; 
   char currentval = 0;
   int i = 0; //position counter
   while(xIt.hasNext())
   {
      try
      {
        currentval = xIt.next(); //set current value to next
        found = false; //reset found to false
      }catch (UsingIteratorPastEndException e){}

      IntSeqIt yIt = new IntSeqIt(y); //initialize iterator for IntSeq
      while(yIt.hasNext())
      {
        try
        {
          if(i == yIt.next()) //if the position is a value in the IntSeq
          {
            found = true; //we found it
            break;
           }//end if
        }catch (UsingIteratorPastEndException e){}
      }//end inner while
     if(!found) //if we didn't find it
       NewSeq = NewSeq + currentval; //stick the char into the string
     i++; //increment the position every time we loop
   }//end outer while
   return new CharSeq(NewSeq);
   }//end minus(Char, Int)
}//end class
