
public class Test8 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer();
		sb.append("123456789");
		sb = sb.delete(sb.length() - 3, sb.length());
		System.out.println(sb.toString());
	}

}
