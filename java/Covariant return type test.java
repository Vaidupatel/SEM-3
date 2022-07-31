class test {
    Object show() {
        System.out.println("1");
        return null;
    }

}

class xyz extends test {
    String show() {
        System.out.println("2");
        return null;
    }

    public static void main(String args[]) {
        test t = new test();
        t.show();
        xyz ob = new xyz();
        ob.show();

    }
}
