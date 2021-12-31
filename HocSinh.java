package bai4;

import java.util.Scanner;
public class HocSinh {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String ID,name,classe;
		int sba;
		System.out.print("Nhap so hoc sinh: ");
		int n=s.nextInt();
		ThongTin[] t=new ThongTin[n];
		System.out.println("Nhap thong tin hoc sinh: ");
		for(int i=0;i<n;i++) {
			System.out.print("Ma hoc sinh: ");
			s.nextLine();
			ID=s.nextLine();
			System.out.print("Nhap ho ten: ");
			name=s.nextLine();
			System.out.print("Nhap lop: ");
			classe=s.nextLine();
			System.out.print("Nhap so bua an: ");
			sba=s.nextInt();
			t[i]=new ThongTin(ID,name,classe,sba);
		}
		System.out.format("%15s%15s%16s%15s%15s", "Ma hoc sinh", "Ho ten", "Lop","So bua an","Tong tien");
		for(int i=0;i<n;i++)
		{
			System.out.println("");
			System.out.format("%15s%15s%16s%13d%15d",t[i].getID(),t[i].getName(),t[i].getClasse(),t[i].getSba(),t[i].tongTien());
		}
		sapXep(t,n);
		System.out.println("\nDanh sách sau khi sắp xếp: ");
		for(int i=0;i<n;i++)
		{
			System.out.println("");
			System.out.format("%15s%15s%16s%13d%15d",t[i].getID(),t[i].getName(),t[i].getClasse(),t[i].getSba(),t[i].tongTien());
		}
		System.out.println("\nTên học sinh ăn trên 20 bữa: ");
		for(int i=0;i<n;i++)
			if(t[i].getSba()>20)
				System.out.println(t[i].getName());
	}
	public static void sapXep(ThongTin[] t,int n) {
		ThongTin temp;
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(t[i].tongTien()>t[j].tongTien())
				{
					temp=t[i];
					t[i]=t[j];
					t[j]=temp;
				}
	}
}
