package Day01;

import java.util.Scanner;

/**
 * 삼각형의 밑변과
 * @author User
 *
 */
public class Ex06_Triangle {

	//main	: ctrl + space
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("삼각형의 넓이");
		System.out.print("밑변 : ");
		double width = sc.nextDouble();
		
		System.out.print("높이 : ");
		double height = sc.nextDouble(); //
		// 삼각형의 넓이 구하는 공식
		// (넓이)=(밑변)x(높이)/2
		double area = width * height /2;
		System.out.println("넓이 : " + area);
		
		sc.close();
		
	}
}
