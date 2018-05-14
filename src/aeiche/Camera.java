package aeiche;

/**
 * Created by aeiche on 5/12/18.
 */
public class Camera {

    public void Camera() {}

    private int id;
    private String name;
    private String full_name;

    public int getId(){ return id; }
    public String getName() { return name; }
    public String getFullName() { return full_name; }

    public void setFullName(String name) { full_name = name; }
    public void setName(String name) {this.name = name;}
    public void setId(int id) {this.id = id;}

}

