public class BubbleSort
{
    public LegoItem[] BubbleSort(LegoItem[] array)
    {
        //Go through entire array
        for (int i = 0; i < array.length; i++)
        {
            //Go through array until lenght - i - 1
            for (int j = 0; j < array.length - i - 1; j++)
            {
                //Compare item getPieces()
                if (array[j].getPieces() > array[j + 1].getPieces())
                {
                    //Switch the places of the items
                    LegoItem temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
        return array;
    }
}
