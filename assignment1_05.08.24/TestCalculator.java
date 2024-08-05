public class TestCalculator {
    public static void main(String args[]) {
        Calculator c = new Calculator();
        System.out.println("Addition of two numbers: "+ c.add(10,5));
        System.out.println("Addition of three numbers: "+ c.add(10,5,9));
        System.out.println("Addition of four numbers: "+ c.add(10,5,9,80));
        System.out.println("Multiplication of two numbers: "+ c.mul(14,7));
        System.out.println("Multiplication of three numbers: "+ c.mul(2,8,4));
        System.out.println("Multiplication of four numbers: "+ c.mul(4,5,7,9));
    }
}
