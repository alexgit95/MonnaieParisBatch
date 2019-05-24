
package com.alex.robot.monnaieparisrobot.model;

import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Piece {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;
    @SerializedName("options")
    @Expose
    private List<Object> options = null;
    @SerializedName("files")
    @Expose
    private List<Object> files = null;

    public List<Datum> getData() {
        return data;
    }

    public void setData(List<Datum> data) {
        this.data = data;
    }

    public List<Object> getOptions() {
        return options;
    }

    public void setOptions(List<Object> options) {
        this.options = options;
    }

    public List<Object> getFiles() {
        return files;
    }

    public void setFiles(List<Object> files) {
        this.files = files;
    }

}
