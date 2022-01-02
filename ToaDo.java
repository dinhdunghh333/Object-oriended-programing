package bai7;

public class ToaDo {
	private float x;
	private float y;
	public ToaDo(float x,float y) {
		this.x=x;
		this.y=y;
	}
	
	public float getX() {
		return x;
	}

	public void setX(float x) {
		this.x = x;
	}

	public float getY() {
		return y;
	}

	public void setY(float y) {
		this.y = y;
	}

	public void inThongTin() {
		System.out.printf("%5s%5.2f%5s%5.2f","x = ",x,"y = ",y);
	}

}
