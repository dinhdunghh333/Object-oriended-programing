package bai2;
import java.util.Scanner;
public class Fibonaci {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n;
		System.out.print("Nhap so nguyen n: ");
		n=s.nextInt();
		for(int i=0;i<n;i++)
			System.out.print(fibonaci(i)+" ");
	}
	public static int fibonaci(int n) {
		int f0=0;
		int f1=1;
		int fn=1;
		if(n<0) {
			return -1;
		}else if(n==0||n==1) {
			return n;
		}else {
			for(int i=2;i<n;i++)
				{
				f0=f1;
				f1=fn;
				fn=f0+f1;
				}
		}
		return fn;
	}
}
