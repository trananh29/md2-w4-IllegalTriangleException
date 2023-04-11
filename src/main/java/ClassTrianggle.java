import java.util.Scanner;

public class ClassTrianggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n Nhap vao chieu dai canh x:");
        int x= sc.nextInt();
        System.out.println("\n Nhap vao chieu dai canh y:");
        int y= sc.nextInt();
        System.out.println("\n Nhap vao chieu dai canh z:");
        int z= sc.nextInt();
        testInput abc = new testInput();
        abc.test3Angle(x,y,z);
    }
}
