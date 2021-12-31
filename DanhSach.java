package bai6;
import java.util.Scanner;
public class DanhSach {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Nhap so luong cong nhan: ");
		int n=s.nextInt();
		String hoten;
		float hsl;
		CongNhan[] cn=new CongNhan[n];
		for(int i=0;i<n;i++)
		{
			System.out.print("Nhap ten: ");
			s.nextLine();
			hoten=s.nextLine();
			System.out.print("Nhap he so luong: ");
			hsl=s.nextFloat();
			cn[i]=new CongNhan(hsl,hoten);
			System.out.println("====================================");
		}
		System.out.println("==========Thong tin cong nhan================");
		System.out.printf("%10s%20s%18s","Ho ten","He so luong","Luong");
		for(int i=0;i<n;i++)
		{
			System.out.println("");
			System.out.printf("%10s%20.2f%18.2f",cn[i].getHoten(),cn[i].getHsl(),cn[i].tinhLuong());
		}
		System.out.print("\nNhap so thuc S: ");
		float S=s.nextFloat();
		System.out.println("Danh sach cong nhan co luong lon hon S la: ");
		System.out.printf("%10s%20s%18s","Ho ten","He so luong","Luong");
		Luong(cn, n, S);
	}
	public static void Luong(CongNhan[] cn,int n,float S) {
		for(int i=0;i<n;i++)
			if(cn[i].tinhLuong()>S)
				{
				System.out.println("");
				System.out.printf("%10s%20.2f%18.2f",cn[i].getHoten(),cn[i].getHsl(),cn[i].tinhLuong());
				}
	}
}
