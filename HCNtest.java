package bai5;
import java.util.Scanner;
public class HCNtest {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		double length,width;
		System.out.print("Nhap chieu dai: ");
		length=s.nextDouble();
		System.out.print("Nhap chieu rong: ");
		width=s.nextDouble();
		HCN h=new HCN(length,width);
		System.out.println("Chieu dai la:"+h.getLength());
		System.out.println("Chieu rong la: "+h.getWidth());
		System.out.println("Dien tich la: "+(double)Math.round(h.Area()*100)/100);
		System.out.println("Chu vi la: "+(double)Math.round(h.Perimeter()*100)/100);
		System.out.println("ToString: "+h.toString());
	}
}
