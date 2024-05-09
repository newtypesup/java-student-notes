package shs;

class Calc {
    int a, b;
    public void Test() {
        this.a = 1;
        this.b = 1;
    }
    public void Test(int a, int b) {
        this.a = a;
        this.b = b;
    }
    public void testcase() {
        System.out.print(a + b);
    }
    public void testcase(int a) {
        System.out.print(this.a - this.b);
    }
    public void testcase(char a) {
        System.out.print(this.a / this.b);
    }
    public void testcase(float a) {
        System.out.print(this.a * this.b);
    }
}

class shs1219_test1 {
    public static void main(String[] args) throws java.lang.Exception {
        int a = 10, b = 3;
        Calc calc = new Calc();
        calc.testcase( a / b );
    }
}