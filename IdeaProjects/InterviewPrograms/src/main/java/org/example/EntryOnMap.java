package org.example;

import java.util.HashMap;
import java.util.Map;

public class EntryOnMap {

    public static void main(String[] args){
        Map<String,Integer> out=new HashMap<>();
        out.put("Sai",1);
        out.put("Santosh",2);

        for(Map.Entry<String,Integer> m:out.entrySet()){
            System.out.println("Key "+m.getKey()+" value "+m.getValue());
        }
    }

}
