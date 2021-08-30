package HDT;

public class BinhLinh {
	protected String ten;
	protected double sucManh = 50;
	protected Boolean trangBi = false;

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public double getSucManh() {
		return sucManh;
	}

	public void setSucManh(double sucManh) {
		this.sucManh = sucManh;

	}

	public Boolean getTrangBi() {
		return trangBi;
	}

	public void setTrangBi(Boolean trangBi) {
		this.trangBi = trangBi;
		sucManh = TinhSucManh();
	}

	protected double TinhSucManh() {
		return trangBi ? sucManh *= 1.1 : sucManh;
	}

	public void InThongTin() {
		System.out.println(ten + " co chi so suc manh: " + (int) sucManh);
	}

	public int ChienDau(BinhLinh bl) {
		return sucManh < bl.getSucManh() ? -1 : sucManh == bl.getSucManh() ? 0 : 1;
	}
}
