import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;


public class Test4 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String str = m1();
		//将json中的部分字符串转化为java对象
		JsonObject object = new JsonParser().parse(str).getAsJsonObject();
		List<KJDXInfo> list = new Gson().fromJson(object.get("result"), new TypeToken<List<KJDXInfo>>(){}.getType());
		for (KJDXInfo kjdxInfo : list) {
			System.out.println(kjdxInfo.getZt_bh());
		}
	}
	//将多个对象组装成一个json字符串
	private static String m1(){
		String rev = null;
		ArrayList<KJDXInfo> list = new ArrayList<KJDXInfo>();
		list.add(new KJDXInfo("0001", "mc1", "mph1", 1.0, 1.0));
		list.add(new KJDXInfo("0002", "mc2", "mph2", 2.0, 2.0));
		list.add(new KJDXInfo("0003", "mc3", "mph3", 3.0, 3.0));
		JsonObject jsonObject = new JsonObject();
		jsonObject.addProperty("count", 100);
		jsonObject.addProperty("display", "test");
		jsonObject.add("result", new Gson().toJsonTree(list));
		return jsonObject.toString();
	}

}
