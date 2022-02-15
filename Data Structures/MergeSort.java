class MergeSort {
	public static void main(String args[]) {
		int a[] = { 19, 23, 45, 2, 6, 9, 1, 10, 0 }, n = 9, i;
		MergeS(a, 0, n - 1);
		for (i = 0; i < n; i++)
			System.out.println(a[i]);
	}

	public static void MergeS(int a[], int low, int high) {
		if (high > low) {
			int mid = (low + high) / 2;
			MergeS(a, low, mid);
			MergeS(a, mid + 1, high);
			Merge(a, mid, low, high);
		}
	}

	public static void Merge(int a[], int mid, int low, int high) {
		int c[] = new int[20], i, j, k;
		i = low;
		j = mid + 1;
		k = low;
		while (i <= mid && j <= high) {
			if (a[i] < a[j])
				c[k++] = a[i++];
			else if (a[i] > a[j])
				c[k++] = a[j++];
			else
				c[k++] = a[i++];
		}
		while (i <= mid)
			c[k++] = a[i++];
		while (j <= high)
			c[k++] = a[j++];
		for (i = low; i <= high; i++)
			a[i] = c[i];
	}
}