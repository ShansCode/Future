package org.example;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class IteratorOnMap{

   public static void main(String[] args){
       Map<String,Integer> out=new HashMap<>();
       out.put("Sai",1);
       out.put("Dap",2);

       Iterator<Map.Entry<String,Integer>> outPut=out.entrySet().iterator();

       while(outPut.hasNext()){
           Map.Entry<String,Integer> loopOutPut=outPut.next();
           System.out.println("key "+ loopOutPut.getKey() + " value" +loopOutPut.getValue());
       }
   }
}
