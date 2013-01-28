
public class Test7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double xmin, xmax,ymin,ymax;
		xmin = 1.0;
		xmax = 2.0;
		ymin = 3.0;
		ymax = 4.0;
		String str = "%.13f%%%.13f";
		System.out.println(String.format(str, xmin,xmax));
		//String str = "POLYGON((%lf%%20%lf%%2C%lf%%20%lf%%2C%lf%%20%lf%%2C%lf%%20%lf%%2C%lf%%20%lf%%2C))";
		//System.out.println(String.format(str, xmin,ymin,xmax,ymin,xmax,ymax,xmin,ymax,xmin,ymin));
	}

}
