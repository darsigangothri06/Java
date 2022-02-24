public class Intro {
    public static void main(String args[]) {
        int a[] = { 1, 2, 3, 4, 5 }; // An integer array with size 5
        int b[] = new int[5]; // An integer array with size 5
        System.out.println(a[2]); // 3
        System.out.println(b[2]); // 0

        // Dynamically changing the size of an array
        a = new int[10];
        a[9] = 12;
        System.out.println(a[9]);
        System.out.println(a[0]); // 0 --- Old Array is destroyed along with their values

        // Arrays of Varying Size
        int[][] mat = new int[4][];
        mat[0] = new int[1];
        mat[1] = new int[2];
        mat[2] = new int[3];
        mat[3] = new int[4];
    }

}
