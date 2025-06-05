import java.util.*;
class q1 {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String check = "";
        for (char ch : str.toCharArray()) {
            if (ch >= 'a' && ch <= 'z') {
                check = check + ch;
            } else if (ch >= 'A' && ch <= 'Z') {
                check = check + Character.toLowerCase(ch);
            }
        }
        System.out.print(fun(check));
    }
    public static boolean fun(String check) {
        int n = check.length();
        int l = 0;
        int r = n - 1;
        while (l < r) {
            if (check.charAt(l) != check.charAt(r)) {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}
