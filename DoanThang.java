package bai7;

public class DoanThang {
	private ToaDo A;
	private ToaDo B;
	public DoanThang(ToaDo A,ToaDo B) {
		this.A=A;
		this.B=B;
	}
	public ToaDo getA() {
		return A;
	}
	public void setA(ToaDo a) {
		A = a;
	}
	public ToaDo getB() {
		return B;
	}
	public void setB(ToaDo b) {
		B = b;
	}
	public double DoDai() {
		return Math.sqrt(Math.pow((B.getX()-A.getX()),2)+Math.pow((B.getY()-A.getY()),2));
	}
}
