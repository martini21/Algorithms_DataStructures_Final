class QuickSort {
    //Selects a pivot as last index
    //Positions all smaller in front of pivot
    //Positions all higher behind pivot
    int partition(LegoItem[] arr, int low, int high)
    {
        LegoItem pivot = arr[high];
        int i = (low - 1); // index of smaller element
        for (int j = low; j < high; j++)
        {
            // If current element is smaller than or
            // equal to pivot
            if (arr[j].compareTo(pivot) <= 0)
            {
                i++;
                // swap arr[i] and arr[j]
                LegoItem temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        // swap arr[i+1] and arr[high]
        LegoItem temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }


    //Sorting method
    void sort(LegoItem[] arr, int low, int high)
    {
        if (low < high)
        {
            int partition = partition(arr, low, high);

            // Recursively sort elements before partition and after partition
            QuickSort(arr, low, partition - 1);
            QuickSort(arr, partition + 1, high);
        }
    }

    public LegoItem[] QuickSort(LegoItem[] arr, int low, int high)
    {
        LegoItem[] array = arr;
        sort(array, low, high);
        return array;
    }
}
