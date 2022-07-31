class test {
    void show(int a) {
        System.out.println("Int method");
    }

    void show(int... a) {
        System.out.println("Varargs method");
    }

    public static void main(String args[]) {
        test t = new test();
        t.show();
        t.show(10);
        t.show(10, 20, 30);
    }
}
