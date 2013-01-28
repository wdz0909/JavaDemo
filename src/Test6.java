import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class Test6 {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		Pattern pattern = Pattern.compile("[^(]*\\(([0-9.]*) ([0-9.]*)\\)");			//匹配{数字}格式
		Matcher matcher = pattern.matcher("POINT (121.563561 29.867241)");
		if(matcher.find()){
			System.out.println(matcher.group(1) + "  " + matcher.group(2));
		}
	}

}
