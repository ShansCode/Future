package org.example;


import java.util.*;
import java.util.stream.Collectors;

public class Main{
  public static void main(String[] args) {

//      List<Integer> str= Arrays.asList(1,2,3,4,5,6,7,8,9);
//
//      List<Integer> i=str.stream()
//              .filter(x -> x % 2 ==0 )
//              .collect(Collectors.toList());
//
//      System.out.println(i);
//
//     int[] arr={1,29,13,34,85,2};
//
//     int sum=Arrays.stream(arr)
//             .filter(n->n%2 ==0)
//             .sum();
//     System.out.println(sum);

//      Iterator<Integer> itr=str.iterator();
//
//      while(itr.hasNext()){
//          int num=itr.next();
//                  System.out.print(num);
//      }
//      Map<Integer,String> val=new HashMap<>();
//
//      val.put(1,"roy");
//      val.put(2,"rwe");
//      val.put(3,"san");
//      val.put(4,"ten");
//
//      for(Map.Entry<Integer,String> itmp: val.entrySet()){
//          System.out.println(itmp.getKey() + " " +itmp.getValue());
//      }
//
//      Map<Integer,String > mst=val.entrySet()
//              .stream()
//              .filter(i -> i.getKey() == 2)
//              .collect(Collectors.toMap(Map.Entry :: getKey,
//              Map.Entry :: getValue));
//
//      System.out.println(mst);
//      }

      Snippets sm = new Snippets();
      System.out.println(sm.isPrime(5));
  }
}


