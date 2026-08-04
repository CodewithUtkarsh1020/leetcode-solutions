class Solution {
    public boolean lemonadeChange(int[] bills) 
    {
    int five = 0;
    int ten  = 0;

    for(int bill : bills)
    {
        // if bill is 5
        if(bill == 5)
        {
             five++;
            
        }
        else if(bill ==10)
        {
            //prefer giving 5
            if(five == 0)
            {
                return false;
            }
            five --;
            ten ++;
        }
        else
        {
           // prefer giving 10 and 5 first
            if(five >0 && ten >0 )
            {
                five --;
                ten --;
            }
            else if(five >= 3)
            {
                five -=3;
            }
            else
            {
                return false;
            }
        }
    }
    return true;
    }
}
