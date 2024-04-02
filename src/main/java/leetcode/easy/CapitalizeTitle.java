package leetcode.easy;

public class CapitalizeTitle {
    public String Solution(String title) {
        StringBuffer sb = new StringBuffer();
        String[] strArray = title.split(" ");

        for (int i = 0; i < strArray.length; i++) {
            if(strArray[i].length()<=2){
                sb.append(strArray[i].toLowerCase());
            }else{
                sb.append(strArray[i].substring(0,1).toUpperCase()+strArray[i].substring(1).toLowerCase());
            }
            if(i!=strArray.length-1){
                sb.append(" ");
            }
        }

        return sb.toString();
    }
}
