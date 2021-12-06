class WithoutMain {
    static int a = 10;
    static {
        System.out.println(a);
        System.out.println(a);
        System.out.println("I'm java program without main method!!");
        System.exit(0);
    }
}
