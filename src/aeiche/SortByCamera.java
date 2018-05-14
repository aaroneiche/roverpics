package aeiche;

import java.util.Comparator;

/**
 * Created by aeiche on 5/12/18.
 */
public class SortByCamera implements Comparator<Photo>{


    public int compare(Photo a, Photo b) {
        return a.getCamera().getName().compareTo(b.getCamera().getName());
    }
}
