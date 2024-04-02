package leetcode.easy.design;

import java.util.*;

public class Test {
    public static void main(String[] args) {
        Road roadA = new Road("apple",100);
        Road roadB = new Road("car",30);
        Road roadC = new Road("bear",70);

        List<Road> roadList = new ArrayList<>();
        roadList.add(roadA);
        roadList.add(roadB);
        roadList.add(roadC);

//        Collections.sort(roadList, new Comparator<Road>() {
//            @Override
//            public int compare(Road o1, Road o2) {
//                return o1.getLicheng() -o2.getLicheng() ;
//            }
//        });


        Road[] roads = roadList.toArray(new Road[roadList.size()]);
        Arrays.sort(roads, Comparator.comparingInt(Road::getLicheng));

        for (Road road : roads) {
            System.out.println(road.getName()+"---"+road.getLicheng());
        }
    }
}
