    import java.util.*;
    public class _con {
        static int Q, n;

        static void solve() {
            Scanner scanner = new Scanner(System.in);
            n = scanner.nextInt();
            int[] v = new int[n];
            for (int i = 0; i < n; i++)
                v[i] = scanner.nextInt();
            int[] post = new int[n];
            int[] pre = new int[n];
            post[n - 1] = v[n - 1];
            pre[0] = v[0];
            for (int i = n - 2; i >= 0; i--)
                post[i] = post[i + 1] + v[i];
            for (int i = 1; i < n; i++)
                pre[i] = pre[i - 1] + v[i];
            Q = scanner.nextInt();
            while (Q-- > 0) {
                int l = scanner.nextInt(), u = scanner.nextInt();
                l--;
                int tot = post[l];
                if (u >= tot) {
                    System.out.print(n + " ");
                } else {
                    int x = (l == 0) ? 0 : pre[l - 1];
                    int f = x + u;
                    int it = upperBound(pre, f);
                    int lo = post[l], hi = post[it];
                    int rt = hi - lo;
                    int p = u * rt - (rt * (rt + 1) / 2);
                    int ans = it;
                    if (it != 0 && it > l) {
                        it--;
                        lo = post[l];
                        hi = post[it];
                        rt = hi - lo;
                        int pp = u * rt - (rt * (rt + 1) / 2);
                        if (pp == p)
                            ans = it;
                    }
                    if (ans != 0)
                        System.out.print(ans + " ");
                    else
                        System.out.print(1 + " ");
                }
            }
            System.out.println();
            scanner.close();
        }

        static int upperBound(int[] arr, int target) {
            int low = 0, high = arr.length;
            while (low < high) {
                int mid = low + (high - low) / 2;
                if (arr[mid] <= target)
                    low = mid + 1;
                else
                    high = mid;
            }
            return low;
        }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int T = 1;
            T = scanner.nextInt();
            for (int t = 1; t <= T; t++) {
                solve();
            }
            scanner.close();
        }
    }
