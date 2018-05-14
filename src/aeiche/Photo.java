package aeiche;

import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * Created by aeiche on 5/8/18.
 */
public class Photo {


    private int sol;
    private int id;
    @SerializedName("img_src")private String URI;
    private Camera camera;


    public int getSol(){ return sol;}
    public int getId() { return id; }
    public String getImageURI() {return URI; }
    public Camera getCamera() {return camera; }

    public void setId(int id) {this.id = id;}
    public void setCameraURI(String uri) {URI = uri; }
    public void setSol(int sol) {this.sol = sol;}
    public void setCamera(Camera cam) {camera = cam; }

    public void Photo(){

    }
}
