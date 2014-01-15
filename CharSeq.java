class CharSeq extends Seq
{
  protected String SeqValue; //the sequence

  CharSeq(String v) //constructor
  {
    SeqValue = v;
  }
  
  public String toString()
  {
    return "{" + SeqValue.length() + ": \"" + SeqValue + "\"}";
  }//prints {Length: Sequence}

  public int posMax()
  {
    int MaxValPos = -1; //position of maximum value
    char MaxVal;     //maximum value
    char []SeqArray;  //array of chars for looping through

    if(SeqValue.length() == 0) //if sequence is empty
      return MaxValPos; 

    SeqArray= SeqValue.toCharArray();

    MaxVal = SeqArray[0]; //initialize max value as first value
    MaxValPos = 0; //initialize max value position as first position

    for(int i = 1; i < SeqValue.length(); i++)
    { //loop through the sequence
      if(SeqArray[i] > MaxVal) //if current value > value in MaxVal
      {
        MaxVal = SeqArray[i]; //our new MaxVal is the current value
        MaxValPos = i; //our new MaxValPos is the current position
      }//end if
    }//end for

    return MaxValPos;

  }//end PosMax
}//end class
