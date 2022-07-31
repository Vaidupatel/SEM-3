abstract class test {
    abstract void display();

    void show() {
        System.out.println("1");
    }

}

class xyz extends test {
    void display() {
        System.out.println("3");

    }

    void show() {
        System.out.println("2");

    }

    public static void main(String[] args) {
        xyz ob = new xyz();
        ob.show();
        ob.display();
    }
}
