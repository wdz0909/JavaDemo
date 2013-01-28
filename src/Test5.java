import java.awt.Point;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class Test5 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		//System.out.println(Double.parseDouble("121.563561"));
		String str = "{POICODE: \"2900\",NAME: \" \",ABBRNAME: \" \",ALIASNAME: \" \",REGISTNAME: \" \",TYPE: \" \",CITYNAME: \" \",COUNTYNAME: \" \",TOWNNAME: \" \",VILLAGNAME: \" \","+
				"ADDRESS: \"宁波市江东区百丈路185号\",COLTIME: \"2011/9/13 0:00:00\",NBID: \"NBSGHJ2012-9-12 19:42:41地名地址提取兴趣点\",GEOMETRY: \"POINT (121.563561 29.867241)\"}";
		GsonBuilder gsonBuilder = new GsonBuilder();
		Gson gson = gsonBuilder.registerTypeAdapter(Point.class,
	              new PointDeserializerUtils()).create();
		T t = gson.fromJson(str, T.class);
		Point pt = t.getGEOMETRY();
		System.out.println(pt.toString());
		
	}
	class T{
		private String ADDRESS;
		private Point GEOMETRY;
		public Point getGEOMETRY() {
			return GEOMETRY;
		}
		public void setGEOMETRY(Point gEOMETRY) {
			GEOMETRY = gEOMETRY;
		}
		public String getAddress() {
			return ADDRESS;
		}
		public void setAddress(String address) {
			this.ADDRESS = address;
		}
	}

}
