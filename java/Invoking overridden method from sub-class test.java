class test {
    void show() {
        System.out.println("1");
    }

}

class xyz extends test {
    void show() {
        super.show();
        System.out.println("2");

    }

    public static void main(String[] args) {
        xyz ob = new xyz();
        ob.show();

    }
}
