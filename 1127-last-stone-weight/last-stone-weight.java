import java.util.Arrays;

class Solution {
    public int lastStoneWeight(int[] stones) {
        while (true) {
            Arrays.sort(stones);
            int n = stones.length;
            if (n == 0 || stones[n - 1] == 0) return 0; 
            int heaviest = stones[n - 1];
            int secondHeaviest = n > 1 ? stones[n - 2] : 0;
            int newStone = heaviest - secondHeaviest; 
            stones[n - 1] = 0;
            if (n > 1) stones[n - 2] = 0;
        
            if (newStone > 0) {
                for (int i = 0; i < n; i++) {
                    if (stones[i] == 0) {
                        stones[i] = newStone;
                        break;
                    }
                }
            }
            int count = 0;
            int last = 0;
            for (int stone : stones) {
                if (stone != 0) {
                    count++;
                    last = stone;
                }
            }
            if (count <= 1) return last;
        }
    }
}
