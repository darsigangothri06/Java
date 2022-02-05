public class GetChars {
    public static void main(String args[]) {
        String str = "hello, I'm persuing btech";
        int start = 3;
        int end = 13;
        char res[] = new char[end - start];
        str.getChars(start, end, res, 0);
        System.out.println(res);
    }
}
