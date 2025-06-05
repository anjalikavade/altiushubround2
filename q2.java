import java.util.*;
class q2 {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    String str[] = sc.nextLine().split(" ");
    int n = str.length;
    int arr[] = new int[n];
    for (int i = 0; i < n; i++) {
      arr[i] = Integer.parseInt(str[i]);
    }
    int ans = lcs(arr);
    System.out.print(ans);
  }
  public static int lcs(int[] arr) {
    int n = arr.length;
    int[] dp = new int[n];
    Arrays.fill(dp, 1);
    for (int i = 1; i < n; i++) {
      for (int j = 0; j < i; j++) {
        if (arr[i] > arr[j]) {
          dp[i] = Math.max(dp[i], dp[j] + 1);
        }
      }
    }
    int max = 0;
    for (int len : dp) {
      max = Math.max(max, len);
    }
    return max;
  }
}
