import java.util.Scanner;

// INCORRECT OUTPUT
class MergeSort
{
	public static void main(String args[])
	{
		int a[] = {12,123,45,25,98,10,2,30};
		int n = 8;
		Merge_Sort(a,0,n-1);
		System.out.println("After Sorting: ");
		for(int i = 0; i < n; i++)
		{
			System.out.println(a[i]);
		}
	}
	public static void Merge_Sort(int a[], int low, int high)
	{
		if(high > low)
		{
			int mid = (low+high)/2;
			Merge_Sort(a,low,mid);
			Merge_Sort(a,mid+1,high);
			Merge(a,low,high,mid);
		}
	}

	public static void Merge(int a[], int low, int high, int mid)
	{
		int temp[] = new int[8];
		int i = low;
		int j = mid + 1;
		int k = low;
		while(i <= mid && j <= high)
		{
			if(a[i] <= a[j])
			{
				temp[k++] = a[i++];
			}
			else
			{
				temp[k++] = a[j++];
			}
		}

		while(i <= mid)
		{
			temp[k++] = a[i++];
		}
		while(j <= high)
		{
			temp[k++] = a[j++];
		}
		for(i = 0; i < high; i++)
		{
			a[i] = temp[i];
		}
	}
}