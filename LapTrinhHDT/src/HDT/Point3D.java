package HDT;

import java.util.Scanner;

public class Point3D {
	private double x, y, z;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public double getZ() {
		return z;
	}

	public void setZ(double z) {
		this.z = z;
	}

	private Scanner sc = new Scanner(System.in);

	public Point3D() {
		System.out.println("vui long nhap toa do khong gian 3 chieu: ");
		x = sc.nextDouble();
		y = sc.nextDouble();
		z = sc.nextDouble();
	}

	public Point3D(double a, double b, double c) {
		this.x = a;
		this.y = b;
		this.z = c;
	}

	public void InThongTin() {
		System.out.println("( " + x + " ," + y + " ," + z + " )");
	}

	public double TinhKhoangCach(Point3D diem) {
		return Math.sqrt(Math.pow(x - diem.getX(), 2) + Math.pow(y - diem.getY(), 2) + Math.pow(z - diem.getZ(), 2));
	}
}
