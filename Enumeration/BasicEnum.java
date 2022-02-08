enum DAYS {
    SUN, MON, TUE, WED
}

public class BasicEnum {
    public static void main(String args[]) {
        DAYS s = DAYS.MON;
        System.out.println(s);
        System.out.println(s.valueOf("SUN"));
        System.out.println(s.valueOf("MON").ordinal());

    }
}
