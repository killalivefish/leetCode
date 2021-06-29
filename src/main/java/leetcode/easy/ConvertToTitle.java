package leetcode.easy;

public class ConvertToTitle {
    public String convertToTitle(int columnNumber) {
        StringBuilder sb = new StringBuilder();
        method(sb,columnNumber);
        return sb.reverse().toString();
    }

    private void method(StringBuilder sb, int num) {
        int shang = (num -1) / 26;
        int yu = (num-1) % 26;
        if (shang == 0) {
            sb.append((char) (65 + yu));
        } else {
            sb.append((char) (65 + yu));
            method(sb,shang);
        }

    }

    public static void main(String[] args) {
//        System.out.println(2/26);
//        System.out.println((int)'Z');
        ConvertToTitle convertToTitle = new ConvertToTitle();
        System.out.println(convertToTitle.convertToTitle(1));
        System.out.println(convertToTitle.convertToTitle(26));
        System.out.println(convertToTitle.convertToTitle(27));
        System.out.println(convertToTitle.convertToTitle(51));
        System.out.println(convertToTitle.convertToTitle(52));
        System.out.println(convertToTitle.convertToTitle(53));
        System.out.println(convertToTitle.convertToTitle(703));
        System.out.println(convertToTitle.convertToTitle(701));
        System.out.println(convertToTitle.convertToTitle(704));
    }
}
