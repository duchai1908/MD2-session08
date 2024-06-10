package btsession08.bt05;

import java.util.Scanner;

public class StaticMethod {
    static Scanner sc = new Scanner(System.in);
     static float PI = 3.14f;
    public static void calCircleAre(double r){
        System.out.println("diện tích hình tròn: " + PI*Math.pow(r,2));
    }
    public static void calRectangleArea(double width, double height){
        System.out.println("diện tích hình chữ nhật: "+ width*height);
    }
    public static void calTriangleArea(double a, double b, double c){
        System.out.println("Nhập độ chiều cao");
        double chieucao = Double.parseDouble(sc.nextLine());
        System.out.println("Diện tích của tam giác: "+ (a*chieucao)/2);
    }
}
