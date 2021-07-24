package leetcode.easy;

public class MaximumTime {
    public String maximumTime(String time) {
        StringBuilder sb = new StringBuilder();
        String[] split = time.split(":");
        String hour = split[0];
        String minute = split[1];
        if ("??".equals(hour)) {
            sb.append("23");
        } else {
            sb.append('?' == hour.charAt(0) ? (hour.charAt(1) > '3' ? "1" : "2") : hour.charAt(0));
            sb.append('?' == hour.charAt(1) ? (hour.charAt(0) < '2' ? "9" : "3") : hour.charAt(1));
        }
        sb.append(":");
        if ("??".equals(minute)) {
            sb.append("59");
        } else {
            sb.append('?' == minute.charAt(0) ? "5" : minute.charAt(0));
            sb.append('?' == minute.charAt(1) ? "9" : minute.charAt(1));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        MaximumTime maximumTime = new MaximumTime();
        System.out.println(maximumTime.maximumTime("2?:?0"));
        System.out.println(maximumTime.maximumTime("0?:3?"));
        System.out.println(maximumTime.maximumTime("1?:22"));
        System.out.println(maximumTime.maximumTime("??:??"));
    }
}
