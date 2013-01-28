import java.awt.Point;
import java.lang.reflect.Type;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;


public class PointDeserializerUtils implements JsonDeserializer<Point>{
	private static Pattern pattern = Pattern.compile("[^(]*\\(([0-9.]*) ([0-9.]*)\\)");
	@Override
	public Point deserialize(JsonElement arg0, Type arg1,
			JsonDeserializationContext arg2) throws JsonParseException {
		String strPoint = arg0.getAsJsonPrimitive().getAsString();
		Matcher matcher = pattern.matcher(strPoint);
		if(!matcher.find()){
			return null;
		}
		//return new Point(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)));
		return new Point(11,22);
	}

}
