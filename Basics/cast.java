class cast
{
    public static void main(String args[])
    {
        byte a;
        a = (byte) 257;
        System.out.println(a);
        double b;
        int k = 23;
        b = a;
        b = k + 12.3;
        System.out.println(b);
        int g, i = 34;
        char o = 'a';
        g = i * o;
        System.out.println(g);
    }
}