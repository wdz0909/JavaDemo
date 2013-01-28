import java.text.SimpleDateFormat;
import java.util.Date;



public class Test {
	private static final double a1 = -3632619310494.31968;
	private static final double b1 = 2427660780.37139468;
	private static final double c1 = 54238299852488.2383;

	private static final double a2 = 20.8235231397436565;
	private static final double b2 = 2.43239266029026899e-05;
	private static final double c2 = -1001770062.49654049;

	/**
	 * ���Ⱦ�ƫ
	 * 
	 * @param jd ԭʼ����
	 * @return
	 */
	public static double getJd(double jd) {
		double z;
		double y = jd * Math.pow(10, 8);
		z = a1 + b1 * Math.pow(Math.log(y), 2) + c1 / Math.log(y);
		return z / Math.pow(10, 8);
	}

	/**
	 * ά�Ⱦ�ƫ
	 * @param wd ԭʼά��
	 * @return
	 */
	public static double getWd(double wd) {
		double x = wd * Math.pow(10, 8);
		double lnz = a2 + b2 * Math.pow(x, 0.5) + c2 / x;
		double z = Math.pow(Math.E, lnz);
		return z / Math.pow(10, 8);

	}
	public static void main(String[] args) {
		double jd,wd;
		wd = 29.87260653609533;
		jd = 121.60710507844274;
		//System.out.println(getJd(jd));
		//System.out.println(getWd(wd));
		String str = String.format("%.9f", wd);
		System.out.println(str);
		
	}

}
