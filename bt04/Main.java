package btsession08.bt04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào màu sắc: ");
        triangle.setColor(sc.nextLine());
        System.out.println("Nhập cạnh 1");
        triangle.setSide1(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập cạnh 2");
        triangle.setSide2(Double.parseDouble(sc.nextLine()));
        System.out.println("Nhập cạnh 3");
        triangle.setSide3(Double.parseDouble(sc.nextLine()));
        System.out.println(triangle);
    }
}
