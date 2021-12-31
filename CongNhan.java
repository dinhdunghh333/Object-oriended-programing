package bai6;

public class CongNhan {
	final static float lcb=1150;
	private float hsl;
	private String hoten;
	public CongNhan(float hsl, String hoten) {
		this.hsl=hsl;
		this.hoten=hoten;
	}
	public float getHsl() {
		return (float)Math.round(hsl*100)/100;
	}
	public void setHsl(float hsl) {
		this.hsl = hsl;
	}
	public String getHoten() {
		return hoten;
	}
	public void setHoten(String hoten) {
		this.hoten = hoten;
	}
	public float tinhLuong() {
		return lcb*hsl;
	}
}
