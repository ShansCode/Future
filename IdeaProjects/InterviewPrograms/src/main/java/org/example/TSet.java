package org.example;

import java.util.TreeSet;

public class TSet {
    public static void main(String[] args) {
        TreeSet<Integer> se = new TreeSet<>();

        se.add(1);
        se.add(1);
        se.add(2);
        se.add(3);

        System.out.println(se);
        System.out.println("-----------------------");

        se.forEach(System.out::println);
    }
}

    /*
    *
    *   */

//    Map<String, List<Emplloyee>> ww=em.stream()
//            .collect(Collectors.groupingby(Employee::getDepartment,
//                    Collectors.collectingAndThen(
//                            Collectors.maxBy(Comparator.comparingDouble(Employee::getsalary))
//                            Optional::get
//                    )
//                    ));
//}
