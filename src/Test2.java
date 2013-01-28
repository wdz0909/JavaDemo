import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class Test2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		List<KJDXInfo> list = null;
		String rev = "[{bz_mph: '宁波市海曙区丽园北路355号',d_bdjd: '121.5117517',d_bdwd: '29.8766798300001',zt_bh: '3302030000070120',zt_mc: '宁波海曙嘉茵瑜伽健身有限公司'}," +
				"{bz_mph: '海曙区灵桥路513号〈9-12〉-27室',d_bdjd: '121.55079452',d_bdwd: '29.8652978290001',zt_bh: '3302030000082543',zt_mc: '宁波海曙丰鹏货运代理有限公司'}]";
		Gson gson = new Gson();
		list = gson.fromJson(rev, new TypeToken<List<KJDXInfo>>() {
		}.getType());
		String json = gson.toJson(list);
		System.out.println(json);
	}
}
