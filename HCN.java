package bai5;

public class HCN {
	private double length;
	private double width;
	private double Area;
	private double perimeter;
	public HCN(double length,double width) {
		this.length=length;
		this.width=width;
	}
	public double getLength() {
		return length;
	}
	public void setLength(double length) {
		this.length = length;
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	public double Area() {
		return Area=length*width;
	}
	public double Perimeter() {
		return perimeter=(length+width)*2;
	}
	public String toString() {
		return "\nChieu dai: "+this.length+"\nChieu rong: "+this.width+"\nDien tich: "+this.Area+"\nChu vi: "+this.perimeter;
	}
}
