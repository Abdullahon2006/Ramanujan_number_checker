public class Ramanujan {

    public static boolean isRamanujan(long n)
    {
        if (n < 0)
            return false;
        int k = ((int) (Math.cbrt(n)));
        long[] all = new long[k];
        for (int i = 1; i <= k; i++)
        {
            long j = (long) i;
            all[i - 1] = j*j*j;
        }
        int halfnum = (int) (Math.cbrt(n/2));
        boolean p1 = false;
        for (int i = 0; i < halfnum; i++)
        {
            long other = n - all[i];
            for (int j = k - 1; j >= halfnum; j--) {
                if (all[j] == other) {
                    if (p1)
                        return true;
                    k = j;
                    p1 = true;
                } else if (all[j] < other)
                {
                    k = j + 1;
                    break;
                }
            }
        }
        return false;
    }

    public static void main(String[] args)
    {
        long a = Long.parseLong(args[0]);
        System.out.print(isRamanujan(a) + "\n");
    }
}
