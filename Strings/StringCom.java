public class StringCom {
    public static void main(String args[]) {
        String s1 = "Darsi";
        String s5 = "Darsi";
        String s2 = "Gangothri";
        String s3 = "Gang";
        String s4 = "Dasari";

        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        System.out.println(s2.regionMatches(0, s3, 0, 4)); // Gang
        System.out.println(s1.equals(s5)); // true
        System.out.println(s1 == s5); // true
        System.out.println(s1.compareTo(s4)); // -1
        System.out.println(s2.startsWith("G")); // true
        System.out.println(s2.endsWith("i")); // true

        System.out.println(s2.substring(5)); // thri
        System.out.println(s2.substring(2, 9)); // ngothri
        System.out.println(s2.concat(" Darsi")); // Gangothri Darsi
        System.out.println(s2);

        System.out.println(s4.replace("Das", "Pra")); // Praari
        System.out.println(s4); // Dasari

        String x = "123";
        String y = "234.4f";
        System.out.println(Integer.parseInt(x));
        System.out.println(Float.parseFloat(y));

        System.out.println(String.valueOf(123) + " : " + String.valueOf(100));
    }

}
