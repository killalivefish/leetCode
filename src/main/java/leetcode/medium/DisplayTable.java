package leetcode.medium;

import java.util.*;
import java.util.stream.Collectors;

public class DisplayTable {
    List<String> orderList = new ArrayList<>();
    List<Integer> tableNum = new ArrayList<>();

    public List<List<String>> displayTable(List<List<String>> orders) {
        Set<String> orders2 = new HashSet<>();
        Map<Integer, Map<String, Integer>> orderMap = new HashMap<>();
        for (List<String> order : orders) {
            Integer tempTableNum = Integer.parseInt(order.get(1));
            if (!orderMap.containsKey(tempTableNum)) {
                orderMap.put(tempTableNum, new HashMap<String, Integer>());
            }

            Map<String, Integer> tempOrderMap = orderMap.get(tempTableNum);
            String tempOrder = order.get(2);
            orders2.add(order.get(2));
            if (!tempOrderMap.containsKey(tempOrder)) {
                tempOrderMap.put(tempOrder, 0);
            }
            tempOrderMap.put(tempOrder, tempOrderMap.get(tempOrder) + 1);
        }
        this.orderList = orders2.stream().sorted().collect(Collectors.toList());
        Set<Integer> integers = orderMap.keySet();
        for (Integer integer : integers) {
            this.tableNum.add(integer);
        }
        Collections.sort(this.tableNum);

        List<List<String>> result = new ArrayList<List<String>>();

        List<String> title = new ArrayList<>();
        title.add("Table");
        title.addAll(orderList);
        result.add(title);

        for (Integer num : this.tableNum) {
            List<String> tempRow = new ArrayList<>(this.orderList.size());
            tempRow.add(String.valueOf(num));
            for (String order : this.orderList) {
                Integer orDefault = orderMap.get(num).getOrDefault(order, 0);
                tempRow.add(String.valueOf(orDefault));
            }
            result.add(tempRow);
        }

        return result;
    }

    public static void main(String[] args) {
        System.out.println("OK");
    }
}
