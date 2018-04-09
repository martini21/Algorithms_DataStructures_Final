public class BinarySearch
{
    public boolean BinarySearch(LegoItem[]array, LegoItem item)
    {
        //For the first loop set the start and end of the array leave them as is
        int start = 0;
        int end = array.length - 1;

        while (start <= end)
        {
            //Set the mid of the array
            //If the mid is equal to the value we want to find return true.
            int mid = start + (end - 1) / 2;
            if (array[mid].compareTo(item) == 0)
            {
                return true;
            }
            //Find in which half the value we want to find lies and adjust the parameters accordingly
            if (array[mid].compareTo(item) > 0)
            {
                end = mid - 1;
            }
            else
            {
                start = mid + 1;
            }
        }
        return false;
    }
}