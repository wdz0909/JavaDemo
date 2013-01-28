

import com.google.gson.Gson;

public class KJDXInfo {
	private String zt_bh;
	private String zt_mc;
	private String bz_mph;
	private Double d_bdjd;
	private Double d_bdwd;
	public KJDXInfo() {
		// TODO Auto-generated constructor stub
	}
	
	public KJDXInfo(String zt_bh, String zt_mc, String bz_mph, Double d_bdjd,
			Double d_bdwd) {
		super();
		this.zt_bh = zt_bh;
		this.zt_mc = zt_mc;
		this.bz_mph = bz_mph;
		this.d_bdjd = d_bdjd;
		this.d_bdwd = d_bdwd;
	}

	public String getZt_bh() {
		return zt_bh;
	}
	public void setZt_bh(String ztBh) {
		zt_bh = ztBh;
	}
	public String getZt_mc() {
		return zt_mc;
	}
	public void setZt_mc(String ztMc) {
		zt_mc = ztMc;
	}
	public String getBz_mph() {
		return bz_mph;
	}
	public void setBz_mph(String bzMph) {
		bz_mph = bzMph;
	}
	public Double getD_bdjd() {
		return d_bdjd;
	}
	public void setD_bdjd(Double dBdjd) {
		d_bdjd = dBdjd;
	}
	public Double getD_bdwd() {
		return d_bdwd;
	}
	public void setD_bdwd(Double dBdwd) {
		d_bdwd = dBdwd;
	}
}
