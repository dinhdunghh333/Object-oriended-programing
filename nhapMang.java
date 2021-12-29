package bai1;
import java.util.Scanner;
public class nhapMang {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Nhap so phan tu mang: ");
		n=s.nextInt();
		int[] a=new int[n];
		for(int i=0;i<n;i++) {
			System.out.print("a["+i+"] = ");
			a[i]=s.nextInt();
		}
		System.out.print("Mang da nhap la: ");
		for(int i=0;i<n;i++)
			System.out.print(a[i]+" ");
		int sum=0;
		for(int i=0;i<n;i++)
			sum+=a[i];
		System.out.print("\nTong cac phan tu mang la: "+sum);
		System.out.print("\nPhan tu vi tri le: ");
		for(int i=0;i<n;i++)
			if(i%2==1)
				System.out.print(a[i]+" ");
		int min=a[0];
		int pos=0;
		//Daikooh
		for(int i=0;i<n;i++) {
			if(min>a[i])
			{
				min=a[i];
				pos=i;
			}
		}
		System.out.print("\nGia tri nho nhat: "+min+" Vi tri: "+pos);
	}
}
