package aeiche;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Iterator;
import java.util.TreeMap;

import com.google.gson.Gson;

public class Loader {

    public void Loader() {}

    //Map
    public TreeMap retrievePhotosForSol(int sol) throws Exception{

        /* JSON request code found here: https://ampersandacademy.com/tutorials/json/java-json-get-json-reponse-url */
        URL url = new URL("https://api.nasa.gov/mars-photos/api/v1/rovers/curiosity/photos?sol=" + sol + "&api_key=DEMO_KEY");

        Gson gson = new Gson();

        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(url.openStream()));
            String str; //A temporary var.
            String jsonString = ""; //the output

            while ((str = br.readLine()) != null) {
                jsonString = str;
            }

            Photos p = new Photos();
            p = gson.fromJson(jsonString, Photos.class);

            TreeMap<Integer,Photo> pmap = new TreeMap<Integer, Photo>();

            //Iterator design from:  https://www.geeksforgeeks.org/iterators-in-java/
            Iterator it = p.photos.iterator();
            while(it.hasNext()){
                //add items to tree according to
                Photo ph = (Photo)it.next();
                pmap.put(ph.getId(), ph);
            }

            return pmap;

        }catch (Exception e)
        {
            e.printStackTrace();
        }
        return null;
    }
}
