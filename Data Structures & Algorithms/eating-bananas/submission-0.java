class Solution {
    public static int minEatingSpeed(int[] piles, int h) {
        int res = 0;

        for(int i = 0; i < piles.length; i++) {
            res = Math.max(res, piles[i]);
        }

        int l = 1;
        int r = res;

        while(l <= r) {
            int k = (l + r) / 2;
            int hours = 0;
            for(int bananas: piles) {
                hours += Math.ceil((double)bananas / k);
            }
            if(hours <= h) {
                res = Math.min(res, k);
                r = k - 1;
            } else {
                l = k + 1;
            }
        }

        return res;

    }
}