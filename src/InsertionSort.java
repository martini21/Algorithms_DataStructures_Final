class InsertionSort
{
    //Function to sort a legoset using insertion sort
    public LegoItem[] InsertionSort(LegoItem[] array)
    {
        for (int i = 1; i < array.length; ++i)
        {
            LegoItem key = array[i];
            int j = i - 1;
            //Move elements of arr[0..i-1],
            //that are greater than key, to one position
            //ahead of their current position
            while (j >= 0 && array[j].compareTo(key) > 0)
            {
                array[j + 1] = array[j];
                j = j - 1;
            }
            array[j + 1] = key;
        }
        return array;
    }
}