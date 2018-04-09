public class MinMax
{
    public LegoItem min;
    public LegoItem max;

    public void MinMax(LegoItem[] array)
    {
        this.min = array[0];
        this.max = array[0];

        for (int i = 1; i < array.length; i++)
        {
            if(array[i].compareTo(this.min) < 0)
            {
                this.min = array[i];
            }
            if(array[i].compareTo(this.max) > 0)
            {
                this.max = array[i];
            }
        }
    }

    public LegoItem getMin() {
        return min;
    }

    public LegoItem getMax() {
        return max;
    }

    public static void main(String[] arg)
    {
        MinMax mm = new MinMax();
        //This might need to be removed
        Legocsv reader = new Legocsv();

        LegoItem[] itemsToCompare = Legocsv.itemsArray;
        //Act
        mm.MinMax(itemsToCompare);

        System.out.println(mm.getMin().getPieces());
        System.out.println(mm.getMax().getPieces());
    }
}
