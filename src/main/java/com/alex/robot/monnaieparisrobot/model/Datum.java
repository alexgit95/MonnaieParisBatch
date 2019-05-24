
package com.alex.robot.monnaieparisrobot.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Datum {

    @SerializedName("DT_RowId")
    @Expose
    private String dTRowId;
    @SerializedName("vcol_coinlist")
    @Expose
    private VcolCoinlist vcolCoinlist;
    @SerializedName("vcol_file")
    @Expose
    private VcolFile vcolFile;
    @SerializedName("vcol_filebat")
    @Expose
    private VcolFilebat vcolFilebat;
    @SerializedName("vcol_fileback")
    @Expose
    private VcolFileback vcolFileback;
    @SerializedName("vcol_filebackbat")
    @Expose
    private VcolFilebackbat vcolFilebackbat;

    public String getDTRowId() {
        return dTRowId;
    }

    public void setDTRowId(String dTRowId) {
        this.dTRowId = dTRowId;
    }

    public VcolCoinlist getVcolCoinlist() {
        return vcolCoinlist;
    }

    public void setVcolCoinlist(VcolCoinlist vcolCoinlist) {
        this.vcolCoinlist = vcolCoinlist;
    }

    public VcolFile getVcolFile() {
        return vcolFile;
    }

    public void setVcolFile(VcolFile vcolFile) {
        this.vcolFile = vcolFile;
    }

    public VcolFilebat getVcolFilebat() {
        return vcolFilebat;
    }

    public void setVcolFilebat(VcolFilebat vcolFilebat) {
        this.vcolFilebat = vcolFilebat;
    }

    public VcolFileback getVcolFileback() {
        return vcolFileback;
    }

    public void setVcolFileback(VcolFileback vcolFileback) {
        this.vcolFileback = vcolFileback;
    }

    public VcolFilebackbat getVcolFilebackbat() {
        return vcolFilebackbat;
    }

    public void setVcolFilebackbat(VcolFilebackbat vcolFilebackbat) {
        this.vcolFilebackbat = vcolFilebackbat;
    }

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((dTRowId == null) ? 0 : dTRowId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Datum other = (Datum) obj;
		if (dTRowId == null) {
			if (other.dTRowId != null)
				return false;
		} else if (!dTRowId.equals(other.dTRowId))
			return false;
		return true;
	}
    
    

}
