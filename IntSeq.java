class IntSeq extends Seq
{
  protected int [] IntValues;

  IntSeq(int ... numbers) //constructor
  {
    IntValues = numbers;
  }
  
  public String toString()
  {
    String f = "";
    for(int i = 0; i < IntValues.length; i++) //stores seq in string
       f = f  + " " + IntValues[i]; //for easier printing
    return "[" + IntValues.length + ":" + f + "]";
  }

  public int posMax()
  {
    int MaxValue; //trakcs the maximum value
    int MaxValPos = -1; //tracks the position of the maximum value
 
    if(IntValues.length > 0) //if the sequence is nonempty
    {
      MaxValue = IntValues[0]; //initialize the max value as first value
      MaxValPos = 0; //initialize the position as the first position

      for(int i = 0; i < IntValues.length; i++)
      {
        if(IntValues[i] > MaxValue) //if current value > the value we've stored
                                   //as the maximum
        {
          MaxValue = IntValues[i]; //set current value to maximum
          MaxValPos = i;           //set current position to maximum
        }//end if          
      }//end for
    }//end if
    return MaxValPos;
  }//end posMax()
}//end class
