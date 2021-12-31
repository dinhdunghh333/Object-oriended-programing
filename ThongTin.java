package bai4;

public class ThongTin {
	private String ID;
	private String name;
	private String classe;
	private int sba;
	private long TienAn;
	public ThongTin(String ID, String name, String classe, int sba) {
		this.ID=ID;
		this.name=name;
		this.classe=classe;
		this.sba=sba;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getClasse() {
		return classe;
	}
	public void setClasse(String classe) {
		this.classe = classe;
	}
	public int getSba() {
		return sba;
	}
	public void setSba(int sba) {
		this.sba = sba;
	}
	public long tongTien() {
		return this.TienAn=(long)(sba*30000);
	}
}
