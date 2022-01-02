package bai7;
import java.util.ArrayList;
import java.util.Scanner;
public class MangDoanThang {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Nhap so luong toa do diem: ");
		int n=s.nextInt();
		ToaDo[] td=new ToaDo[n];
		float x,y;
		for(int i=0;i<n;i++)
		{
			System.out.print("x : ");
			x=s.nextFloat();
			System.out.print("y : ");
			y=s.nextFloat();
			td[i]=new ToaDo(x,y);
		}
		ArrayList<DoanThang> dt=new ArrayList<DoanThang>(n);
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
		{
			DoanThang dd=new DoanThang(td[i],td[j]);
			dt.add(dd);
		}
		
		System.out.println("Danh sach doan thang:");
		for(DoanThang i:dt)
			{
			System.out.printf("%2.2f",i.DoDai());
			System.out.println("");		
			}
		System.out.printf("%3s%5.2f%1s","Do dai lon nhat la: ",MAX(dt),"\n");
		System.out.printf("%3s%5.2f","Tong do dai cac doan thang la: ",SUM(dt));
	}
	public static double MAX(ArrayList<DoanThang> dt) {
		double max=dt.get(0).DoDai();
		for(DoanThang i:dt)
			if(i.DoDai()>max)
				max=i.DoDai();
		return max;
	}
	public static double SUM(ArrayList<DoanThang> dt) {
		double sum=0;
		for(DoanThang i:dt)
			sum+=i.DoDai();
		return sum;
	}
}
