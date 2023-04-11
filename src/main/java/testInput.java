public class testInput {
    public void test3Angle (int a, int b, int c) throws ArithmeticException  {
        if (a==0 || b==0 || c==0) {
            throw new ArithmeticException("The Angle of triangle can not be zẻo ");
        }
        if (a+b<=c || a+c<=b || b+c<=a) {
            throw new ArithmeticException(" The sum of two angle is bigger than angle remain");
        } else System.out.println("the triangle is ok");

    }
}
