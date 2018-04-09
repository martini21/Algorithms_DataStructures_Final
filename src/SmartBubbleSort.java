public class SmartBubbleSort
{
    public LegoItem[] SmartBubbleSort(LegoItem[] array)
    {
        //Go through entire array
        for (int i = 0; i < array.length; i++)
        {
            //Set the flag to true for the smart sort
            boolean flag = true;
            //Go through array until lenght - i - 1
            for (int j = 0; j < array.length - i - 1; j++)
            {
                //Compare item getPieces()
                if (array[j].getPieces() > array[j + 1].getPieces())
                {
                    //If change happens the flag is changed to false
                    flag = false;
                    LegoItem temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
            // If flag still true, no swapping happened, so array is sorted
            if (flag) return array;
        }
        return array;
    }
}
