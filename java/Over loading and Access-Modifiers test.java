class test {
    void show() {
        System.out.println("1");
    }
}

class xyz extends test {
    public void show() {
        System.out.println("2");

    }

    public static void main(String[] args) {
        test t = new test();
        t.show();

        xyz ob = new xyz();
        ob.show();
    }
}
