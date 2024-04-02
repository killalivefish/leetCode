package leetcode.honer;

import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;
//14.【40分】 标题：收件人列表 | 时间限制：1秒 | 内存限制：32768K
//        NowCoder每天要给许多客户写电子邮件。正如你所知，如果一封邮件中包含多个收件人，收件人姓名之间会用一个逗号和空格隔开；如果收件人姓名也包含空格或逗号，则姓名需要用双引号包含。
//        现在给你一组收件人姓名，请你帮他生成相应的收件人列表。

public class Fourteen {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List<String> resultList = new ArrayList<>();
        while (in.hasNext()){
            int mailCount = in.nextInt();
            StringBuffer sb = new StringBuffer();
            for (int i = 0; i < mailCount; i++) {
                String curRecp = in.nextLine();
                if(curRecp.contains(" ") || curRecp.contains(",")){
                    curRecp = "\""+curRecp+"\"";
                }
                sb.append(curRecp);
                if(i<mailCount-1){
                    sb.append(",");
                }
            }
            resultList.add(sb.toString());
        }
    }
}
