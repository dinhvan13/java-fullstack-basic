package HDT;

public class CungThu extends BinhLinh {
 protected double TinhSucManh() {
	return trangBi ? sucManh*=1.3 : sucManh;
}
}
