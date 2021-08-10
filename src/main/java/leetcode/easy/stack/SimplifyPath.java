package leetcode.easy.stack;

import java.util.LinkedList;
import java.util.List;

public class SimplifyPath {
    public String simplifyPath(String path) {
//        /a/./b/../../c/
        String root = "/";
        String curFolder = "/.";
        String upFloder = "/..";
        int length = path.length();
        if (length == 2) {
            return path;
        }

        LinkedList<String> pathList = new LinkedList<>();
        for (int i = 0, j = 1; j < length; ) {
                StringBuilder curFloder = new StringBuilder(path.charAt(i));

                

        }
        return null;
    }
}
