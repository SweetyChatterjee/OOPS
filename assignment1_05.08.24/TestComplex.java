public class TestComplex {
    public static void main(String args[]) {
        Complex c1 = new Complex(3,2);
        Complex c2 = new Complex(1,7);
        c1.add(c2);
        System.out.println("Result of c1+c2:");
        c1.display();
        Complex c3 = new Complex();
        c3 = c3.add(c1,c2);
        System.out.println("Result of c3=c1+c2:");
        c3.display();
    }
}
