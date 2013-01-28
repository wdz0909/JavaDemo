

import java.lang.reflect.Type;
import java.util.Date;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
/**
 * gson针对日期的反序列化类
 * @author wudz
 *
 */
public class DateDeserializerUtils implements JsonDeserializer<java.util.Date> {
	@Override
	public Date deserialize(JsonElement arg0, Type arg1,
			JsonDeserializationContext arg2) throws JsonParseException {
		// TODO Auto-generated method stub
		return new java.util.Date(arg0.getAsJsonPrimitive().getAsLong());
	}

}
