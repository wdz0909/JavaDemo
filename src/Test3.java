import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.reflect.TypeToken;


public class Test3 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<KJDXInfo> list = new ArrayList<KJDXInfo>();
		list.add(new KJDXInfo("0001", "mc1", "mph1", 1.0, 1.0));
		list.add(new KJDXInfo("0002", "mc2", "mph2", 2.0, 2.0));
		list.add(new KJDXInfo("0003", "mc3", "mph3", 3.0, 3.0));
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("result", list);
		map.put("display", "test");
		map.put("count", 100);
		Gson gson = new Gson();
		String rev = gson.toJson(map);
		
//		HashMap<String, Object> map2 = gson.fromJson(rev, new TypeToken<HashMap<String, Object>>() {
//		}.getType());
//		System.out.println(map2.get("count"));
		
//		map = new HashMap<String, Object>();
//		map.put("user1", new KJDXInfo("0001", "mc1", "mph1", 1.0, 1.0));
//		map.put("user2", new KJDXInfo("0002", "mc2", "mph2", 2.0, 2.0));
//		rev = gson.toJson(map);
//		HashMap map2 = gson.fromJson(rev, new TypeToken<HashMap>(){}.getType());
//		KJDXInfo info = (KJDXInfo) map2.get("user1");
//		System.out.println(info == null);
		JsonObject object =(JsonObject) new JsonParser().parse(rev);
		String str = object.get("count").getAsString();
		JsonArray array = object.get("result").getAsJsonArray();
		for (JsonElement jsonElement : array) {
			KJDXInfo info = gson.fromJson(jsonElement, KJDXInfo.class);
			System.out.println(info.getZt_bh());
		}
		//System.out.println(str);
		
		
	}

}
