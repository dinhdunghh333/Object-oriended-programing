package dientich;
import java.util.Scanner;
import java.lang.Math;
public class Area {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double AB,AC,BC;
		System.out.print("Nhap do dai canh thu 1: ");
		AB=s.nextDouble();
		System.out.print("Nhap do dai canh thu 2: ");
		AC=s.nextDouble();
		System.out.print("Nhap do dai canh thu 3: ");
		BC=s.nextDouble();
		System.out.print("Dien tich tam giac theo cong thuc heron la: "+Area(AB,AC,BC));
	}
	public static double Area(double AB, double AC,double BC) {
		double P=(AB+AC+BC)/2;
		double area=Math.sqrt(P*(P-AB)*(P-AC)*(P-BC));
		return area;
	}
}
