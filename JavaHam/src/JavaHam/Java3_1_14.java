package JavaHam;

import java.util.concurrent.TimeUnit;

public class Java3_1_14 {
	public static void QuyDoiGio(int gio) {
		long minutes = TimeUnit.HOURS.toMinutes(gio);
		long seconds = TimeUnit.MINUTES.toSeconds(minutes);
		System.out.println(gio + " gio bang " + minutes + " phut " + seconds + " giay ");
	}

	public static void main(String[] args) {
		int gio = 1;
		QuyDoiGio(gio);
	}
}
