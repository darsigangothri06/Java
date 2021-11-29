class BubbleSort
{
    public static void main(String args[])
    {
        int a[] = {20,30,100,15,78,90,56,23}, i, j, min, n = 8,temp;
        for(i = 1; i < n - 1; i++)
        {
            for(j = 0; j < n - i; j++)
            {
                if(a[j] > a[j+1])
                {
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
            }
        }
        System.out.println("After Sorting: ");
        for(i = 0; i < n; i++)
        {
            System.out.println(a[i]);
        }
    }
}