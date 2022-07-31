class test {
    void show() {
        System.out.println("1");
    }
}

class xyz extends test {
    void show() {
        System.out.println("2");
    }

    public static void main(String[] args) {
        test t = new test();
        t.show();
        xyz x = new xyz();
        x.show();

    }

}
