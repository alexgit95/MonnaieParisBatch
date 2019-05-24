
package com.alex.robot.monnaieparisrobot.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VcolFilebackbat {

    @SerializedName("web_path")
    @Expose
    private Object webPath;

    public Object getWebPath() {
        return webPath;
    }

    public void setWebPath(Object webPath) {
        this.webPath = webPath;
    }

}
