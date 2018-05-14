package aeiche;

import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception{

        Loader l = new Loader();


        TreeMap rPhotos = l.retrievePhotosForSol(1000);
        Set set = rPhotos.entrySet();

        Iterator itr = set.iterator();



        while(itr.hasNext()){
            Map.Entry pho = (Map.Entry)itr.next();
            Photo photoOb = (Photo)pho.getValue();


            System.out.print("("+ pho.getKey()+") ");
            System.out.print("From " + photoOb.getCamera().getFullName());
            System.out.println(": " + photoOb.getImageURI());
        }

    }
}
