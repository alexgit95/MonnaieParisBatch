
package com.alex.robot.monnaieparisrobot.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class VcolFileback {

    @SerializedName("web_path")
    @Expose
    private String webPath;

    public String getWebPath() {
        return webPath;
    }

    public void setWebPath(String webPath) {
        this.webPath = webPath;
    }

}
