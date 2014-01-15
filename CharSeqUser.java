public class CharSeqUser
{

  public static int posMax1(CharSeq s)
  {
    char MaxVal = 0; //initialize as 0 (no problem since these aren't ints)
    int MaxValPos = -1; //initialize maximum position as error
    CharSeqIt csi = new CharSeqIt(s); //initialize iterator
    char next; //char for holding the next value
    int i = 0;

    if(!csi.hasNext()) //if we're at the end   
      return MaxValPos; //return -1, empty sequence

    try
    {    //any call to next() is enclosed in a try-catch block
      while(csi.hasNext())//while there is something next
      {
        next = csi.next(); //put the next character into char next
        if(MaxVal < next) //if that's greater than what's currently in MaxVal
        {
          MaxVal = next; //set the maximum value to next
          MaxValPos = i; //set the position of the maximum value
        } //end if
        i++; //increment i every time to keep track of current position
      }//end while
    } catch(UsingIteratorPastEndException e){}

    return MaxValPos;
  }//endposMax1()

  public static int posMax2(CharSeq s)
  {
    CharSeqIt csi = new CharSeqIt(s); //initialize iterator
    char next; //char for holding the next value
    char MaxVal = 0; //initialize at 0
    int MaxValPos = -1; //initialize position of max value at error value
    int i = 0; //for keeping track of current position

    try
    { //next() in try-catch
      while(true) 
      {
         next = csi.next(); //next = next value in sequence    
         if(MaxVal < next) //if that's bigger than the current MaxVal
         { 
           MaxVal = next; //replace MaxVal
           MaxValPos = i; //up the position counter to the current place
         }//end if
         i++; //increment position every time
      }//end while
    }catch(UsingIteratorPastEndException e) {} //catches when we hit the end of the sequence
  
    return MaxValPos;
 }//endposMax2
}//end class

