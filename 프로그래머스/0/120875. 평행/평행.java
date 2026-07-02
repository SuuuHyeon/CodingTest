class Solution {

    private boolean isParallel(int[] a, int[] b, int[] c, int[] d) {
        return (a[1] - b[1]) * (c[0] - d[0])
                == (c[1] - d[1]) * (a[0] - b[0]);
    }

    public int solution(int[][] dots) {

        if (isParallel(dots[0], dots[1], dots[2], dots[3]))
            return 1;

        if (isParallel(dots[0], dots[2], dots[1], dots[3]))
            return 1;

        if (isParallel(dots[0], dots[3], dots[1], dots[2]))
            return 1;

        return 0;
    }
}